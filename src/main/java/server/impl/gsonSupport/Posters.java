package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
public class Posters {
	
	@SerializedName("thumbnail")
	public String thumbnail;

	@SerializedName("profile")
	public String profile;

	@SerializedName("detailed")
	public String detailed;

	@SerializedName("original")
	public String original;


}
