package id.simple.news;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

import id.simple.news.adapter.NewsAdapter;
import id.simple.news.data.model.ArticlesNews;
import id.simple.news.data.model.ResponseNews;
import id.simple.news.data.network.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvmain;
    private ArrayList<ArticlesNews> arrayNews = new ArrayList<>();
    private Activity activity = this;
    private NewsAdapter adapter;
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvmain = findViewById(R.id.rvmain);

        LinearLayoutManager ilayout = new LinearLayoutManager(this);
        rvmain.setHasFixedSize(true);
        rvmain.setNestedScrollingEnabled(true);
        rvmain.setLayoutManager(ilayout);

        adapter = new NewsAdapter(this);
        rvmain.setAdapter(adapter);

        getData();
    }

    private void getData() {
        String url = "https://newsapi.org/v2/";
        HashMap<String, String> paramter = new HashMap<>();
        paramter.put("apiKey", "da8ad0b73f3c43748839cfa37c3224d2");
        paramter.put("country", "id");

        Call<ResponseNews> call = ApiService.ApiData(url).topHeadline(paramter);
        call.enqueue(new Callback<ResponseNews>() {
            @Override
            public void onResponse(Call<ResponseNews> call, Response<ResponseNews> response) {
                if (response.isSuccessful() && response.body() != null){
                    arrayNews.clear();
                    arrayNews.addAll(response.body().getArticles());
                    Log.e(TAG, "onResponse: "+response.body().getStatus());
                    Log.e(TAG, "onResponse: "+response.body().getTotalResults());
                    setList();
                }else {
                    Toast.makeText(activity, response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseNews> call, Throwable t) {
                Toast.makeText(activity, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setList() {
        adapter.setList(arrayNews);
        adapter.notifyDataSetChanged();
    }
}