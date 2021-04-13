package com.deepak.mybucket.Movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.deepak.mybucket.R;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<MoviesModel> models = new ArrayList<>();
    private Context context;

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_view,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MoviesModel moviesModel = models.get(position);
        holder.Movie_Name_text.setText(moviesModel.getMovieName());
        holder.about_movie.setText(moviesModel.getShortDisc());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public void setModels(List<MoviesModel> models) {
        this.models = models;
        notifyDataSetChanged();
    }
    public MoviesModel mov(int position){
        return models.get(position);
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder{


        private TextView Movie_Name_text,about_movie;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            Movie_Name_text = itemView.findViewById(R.id.Movie_Name_text);
            about_movie = itemView.findViewById(R.id.about_movie);
        }
    }
}
