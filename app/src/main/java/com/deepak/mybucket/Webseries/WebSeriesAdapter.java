package com.deepak.mybucket.Webseries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepak.mybucket.R;

import java.util.ArrayList;
import java.util.List;

public class WebSeriesAdapter extends RecyclerView.Adapter<WebSeriesAdapter.WebSeriesViewHolder>{
    private List<WebSeriesModel> webSeriesModels = new ArrayList<>();
    private Context context;

    public WebSeriesAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public WebSeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.series_model_list,parent,false);
        return new WebSeriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WebSeriesViewHolder holder, int position) {
    WebSeriesModel model = webSeriesModels.get(position);
    holder.series_name.setText(model.getWebSeriesName());
    holder.about_series.setText(model.getAboutWebSeries());
    }

    @Override
    public int getItemCount() {
        return webSeriesModels.size();
    }

    public void setWebSeriesModels(List<WebSeriesModel> webSeriesModels) {
        this.webSeriesModels = webSeriesModels;
        notifyDataSetChanged();
    }

    public WebSeriesModel webSeries(int position){
        return webSeriesModels.get(position);
    }
    static class WebSeriesViewHolder extends RecyclerView.ViewHolder{
        private TextView series_name,about_series;
        public WebSeriesViewHolder(@NonNull View itemView) {
            super(itemView);

            series_name = itemView.findViewById(R.id.series_name);
            about_series = itemView.findViewById(R.id.about_series);
        }
    }
}
