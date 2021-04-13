package com.deepak.mybucket.game;

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

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {
    private List<GameModel> gameModels = new ArrayList<>();
    private Context context;

    public GameAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_model_list, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        GameModel model = gameModels.get(position);
        holder.Game_Name_text.setText(model.getGameName());
        holder.about_game.setText(model.getAboutGame());

    }

    @Override
    public int getItemCount() {
        return gameModels.size();
    }

    public void setGameModels(List<GameModel> gameModels) {
        this.gameModels = gameModels;
        notifyDataSetChanged();
    }

    public GameModel getPosition(int position) {
        return gameModels.get(position);
    }

    static class GameViewHolder extends RecyclerView.ViewHolder {

        private TextView Game_Name_text, about_game;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            Game_Name_text = itemView.findViewById(R.id.Game_Name_text);
            about_game = itemView.findViewById(R.id.about_game);


        }
    }
}
