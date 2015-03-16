package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
public class Rating {

	@SerializedName("critics_rating")
	public String criticsRating;

	@SerializedName("critics_score")
	public int criticsScore;

	@SerializedName("audience_rating")
	public String audienceRating;

	@SerializedName("audience_score")
	public int audienceScore;
}
