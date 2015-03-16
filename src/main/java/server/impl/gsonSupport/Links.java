package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
public class Links {

	@SerializedName("self")
	public String self;

	@SerializedName("alternate")
	public String alternate;

	@SerializedName("cast")
	public String cast;

	@SerializedName("clips")
	public String clips;

	@SerializedName("review")
	public String review;

	@SerializedName("similar")
	public String similar;

}
