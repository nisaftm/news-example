package id.simple.news.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ArticlesNews implements Serializable {

	@SerializedName("source")
	private SourceNews source;

	@SerializedName("author")
	private String author;

	@SerializedName("title")
	private String title;

	@SerializedName("description")
	private String description;

	@SerializedName("url")
	private String url;

	@SerializedName("urlToImage")
	private String urlToImage;

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("content")
	private String content;

	public void setSource(SourceNews source){
		this.source = source;
	}

	public SourceNews getSource(){
		return source;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setUrlToImage(String urlToImage){
		this.urlToImage = urlToImage;
	}

	public String getUrlToImage(){
		return urlToImage;
	}

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"ArticlesNews{" + 
			"source = '" + source + '\'' + 
			",author = '" + author + '\'' + 
			",title = '" + title + '\'' + 
			",description = '" + description + '\'' + 
			",url = '" + url + '\'' + 
			",urlToImage = '" + urlToImage + '\'' + 
			",publishedAt = '" + publishedAt + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}