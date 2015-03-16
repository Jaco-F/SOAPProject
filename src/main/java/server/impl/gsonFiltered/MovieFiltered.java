package server.impl.gsonFiltered;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */

//title, year of publication, name of the director(s), critics and audience votes, link to movie posters
//one or more links to the books on whitch it was based on, on googlebooks
public class MovieFiltered {
    @SerializedName("title")
    public String title;

    // Cannot be int because API sometimes return an emptystring ""
    @SerializedName("year")
    public String year;

    @SerializedName("ratings")
    public Rating rating;

    @SerializedName("posters")
    public Posters posters;

    @SerializedName("bookLinks")
    public String[] bookLinks;

    public String toString() {
        return this.title;
    }
}
