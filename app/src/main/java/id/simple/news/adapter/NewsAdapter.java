package id.simple.news.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.simple.news.MainActivity;
import id.simple.news.R;
import id.simple.news.data.model.ArticlesNews;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.HolderNews> {
    private final Context context;
    private ArrayList<ArticlesNews> listData = new ArrayList<>();

    public NewsAdapter(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public HolderNews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null);
        return new HolderNews(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderNews holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void setList(ArrayList<ArticlesNews> arrayNews) {
        this.listData=arrayNews;
    }

    public class HolderNews extends RecyclerView.ViewHolder {
        public HolderNews(@NonNull View itemView) {
            super(itemView);
        }
    }
}
