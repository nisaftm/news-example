package id.simple.news.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class ResponseNews implements Serializable {

	@SerializedName("status")
	private String status;

	@SerializedName("totalResults")
	private int totalResults;

	@SerializedName("articles")
	private List<ArticlesNews> articles;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setArticles(List<ArticlesNews> articles){
		this.articles = articles;
	}

	public List<ArticlesNews> getArticles(){
		return articles;
	}

	@Override
 	public String toString(){
		return 
			"ResponseNews{" + 
			"status = '" + status + '\'' + 
			",totalResults = '" + totalResults + '\'' + 
			",articles = '" + articles + '\'' + 
			"}";
		}
}