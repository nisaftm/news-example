package id.simple.news.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        holder.bind(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void setList(ArrayList<ArticlesNews> arrayNews) {
        this.listData.clear();
        this.listData.addAll(arrayNews);

    }

    public static class HolderNews extends RecyclerView.ViewHolder {
        private TextView tvjudul;

        public HolderNews(@NonNull View itemView) {
            super(itemView);
            tvjudul = itemView.findViewById(R.id.tvjudul);
        }

        public void bind(ArticlesNews item) {
            tvjudul.setText(item.getTitle());
        }
    }
}
