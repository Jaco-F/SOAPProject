package server.impl.gsonSupport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
public class ReleaseDate {
	
	@SerializedName("theater")
	public String theater;
	
	@SerializedName("dvd")
	public String dvd;


}
