package id.simple.news.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SourceNews implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SourceNews{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}