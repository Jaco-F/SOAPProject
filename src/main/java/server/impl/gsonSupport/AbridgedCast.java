package server.impl.gsonSupport;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jacopo on 16/02/2015.
 */
class AbridgedCast {
	
	@SerializedName("id")
	public String id;
	
	@SerializedName("name")
	public String name;

	@SerializedName("characters")
	public List<String> characters;

}
