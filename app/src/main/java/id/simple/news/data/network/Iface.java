package id.simple.news.data.network;

import java.util.HashMap;

import id.simple.news.data.model.ResponseNews;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface Iface {
    @GET("top-headlines")
    Call<ResponseNews> topHeadline(@QueryMap HashMap<String, String> parameter);
}
