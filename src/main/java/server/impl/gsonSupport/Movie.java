package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jacopo on 16/02/2015.
 */
public class Movie {
    @SerializedName("id")
    public String id;

    @SerializedName("title")
    public String title;

    @SerializedName("genres")
    public List<String> genres;

    // Cannot be int because API sometimes return an emptystring ""
    @SerializedName("year")
    public String year;

    @SerializedName("mpaa_rating")
    public String mpaaRating;

    @SerializedName("ratings")
    public Rating rating;

    @SerializedName("release_dates")
    public ReleaseDate releaseDate;

    // Cannot be int because API sometimes return an emptystring ""
    @SerializedName("runtime")
    public String runtime;

    @SerializedName("critics_consensus")
    public String criticsConsensus;

    @SerializedName("synopsis")
    public String synopsis;

    @SerializedName("posters")
    public Posters posters;

    @SerializedName("links")
    public Links links;

    @SerializedName("abridged_cast")
    public List<AbridgedCast> abridgedCast;

    public String toString() {
        return this.title;
    }
}
