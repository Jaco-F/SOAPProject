package server.impl;

import com.google.gson.*;
import server.MovieServerInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import server.impl.gsonFiltered.MovieFiltered;
import server.impl.gsonFiltered.Posters;
import server.impl.gsonFiltered.Rating;
import server.impl.gsonSupport.Movie;


/**
 * Created by Jacopo on 14/02/2015.
 */
@WebService(endpointInterface="server.MovieServerInterface",serviceName = "MovieService")
public class MovieServerImpl implements MovieServerInterface {

    @Override
    //title, year of publication, name of the director(s), critics and audience votes, link to movie posters
    //one or more links to the movies on whitch it was based on, on googlebooks
    @WebMethod(operationName = "getJsonFromRottenTomatoes")
    public String getJsonFromRottenTomatoes(String movieTitle) {
        String movie = movieTitle.replace(" ","+");
        String pageLimit = "15";
        String apiKey = "y7p8awe8zbk368e9yna7nv6y";

        String url = "http://api.rottentomatoes.com/api/public/v1.0/movies.json?q="+
                movie +"&page_limit="+pageLimit+"&apikey="+apiKey;

        JsonArray movieArray = null;
        try {
            JsonObject jsonResponse = getJSONresponse(url);
            if(jsonResponse != null){
                movieArray = jsonResponse.getAsJsonArray("movies");
            }
        } catch (JsonIOException e) {
            System.err.println("Error: Could not find any movies. Check that your API-key is correct");
        }

        JsonArray jsonFilteredArray = new JsonArray();
        if (movieArray!=null){
            Gson gson= new Gson();
            Movie movieObj;
            JsonElement filteredMovie;


            for(JsonElement jsonObject:movieArray) {

                movieObj = gson.fromJson(jsonObject,Movie.class);
                filteredMovie = filterMovie(movieObj);
                jsonFilteredArray.add(filteredMovie);
            }
        }
        return jsonFilteredArray.toString();
    }

    private JsonElement filterMovie(Movie movieObj) {
        MovieFiltered movieFiltered = new MovieFiltered();
        movieFiltered.title = movieObj.title;
        movieFiltered.year = movieObj.year;

        movieFiltered.rating = new Rating();
        movieFiltered.rating.audienceRating = movieObj.rating.audienceRating;
        movieFiltered.rating.audienceScore = movieObj.rating.audienceScore;
        movieFiltered.rating.criticsRating = movieObj.rating.criticsRating;
        movieFiltered.rating.criticsScore = movieObj.rating.criticsScore;

        movieFiltered.posters = new Posters();
        movieFiltered.posters.original = movieObj.posters.original;

        movieFiltered.bookLinks = fetchBooks(movieObj.title);

        Gson gson = new Gson();
        return gson.toJsonTree(movieFiltered);
    }

    private String[] fetchBooks(String title) {
        title = title.replace(" ", "+");
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + title;
        JsonArray bookArray = null;
        List<String> bookLinks = new ArrayList<String>();
        JsonObject jsonResponse = getJSONresponse(url);
        if(jsonResponse != null){
            bookArray = jsonResponse.getAsJsonArray("items");
        }

        if (bookArray == null) {
            return new String[] {""};
        }

        for (int i=0; i < bookArray.size(); i++) {
            JsonObject jsonObject = (JsonObject) bookArray.get(i);
            JsonObject volumeInfo = (JsonObject) jsonObject.get("volumeInfo");

            String name = volumeInfo.get("title").getAsString().replace(" ", "+");

            if (name.equals(title)) {
                volumeInfo.get("infoLink");
                bookLinks.add(volumeInfo.get("infoLink").getAsString());
            }
        }

        if (bookLinks.isEmpty()) {
            return new String[] {""};
        }

        String[] bookListStrings = new String[bookLinks.size()];
        for(int i = 0; i<bookLinks.size();i++) {
            bookListStrings[i] = bookLinks.get(i);
        }
        return bookListStrings;
    }

    private JsonObject getJSONresponse(String url) throws JsonIOException{
        InputStream is = null;
        try{
            is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader( new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JsonParser jp = new JsonParser();
            return (JsonObject) jp.parse(jsonText);
        }
        catch (UnknownHostException uhe){
            System.err.println("Unknown host: Check your internet connection");
        }
        catch (IOException ie) {
            System.err.println("Connection issues: Could not connect to the API. Check your API-key");

        }finally{
            try {
                if(is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String readAll(BufferedReader rd) throws IOException{
        StringBuilder sb = new StringBuilder();
        int cp;
        while((cp = rd.read()) != -1){
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
