package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
class Review {

	@SerializedName("critic")
	public String critic;

	@SerializedName("date")
	public String date;

	@SerializedName("freshness")
	public String freshness;

	@SerializedName("publication")
	public String publication;

	@SerializedName("quote")
	public String quote;
}
