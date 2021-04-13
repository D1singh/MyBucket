package com.deepak.mybucket.adventure;

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

public class AdventureAdapter extends RecyclerView.Adapter<AdventureAdapter.AdventureViewHolder> {
    private List<AdventureModel> adventureModels = new ArrayList<>();
    private Context context;

    public AdventureAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public AdventureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adventure_model_list,parent,false);
        return new AdventureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdventureViewHolder holder, int position) {
        AdventureModel model = adventureModels.get(position);
        holder.adventure_name.setText(model.getAdventureName());
        holder.about_adventure.setText(model.getAboutAdventure());
    }

    @Override
    public int getItemCount() {
        return adventureModels.size();
    }

    public void setAdventureModels(List<AdventureModel> adventureModels) {
        this.adventureModels = adventureModels;
        notifyDataSetChanged();
    }
    public AdventureModel aModel(int position){
        return adventureModels.get(position);
    }

    static class AdventureViewHolder extends RecyclerView.ViewHolder{
private TextView adventure_name,about_adventure;
        public AdventureViewHolder(@NonNull View itemView) {
            super(itemView);
            adventure_name = itemView.findViewById(R.id.adventure_name);
            about_adventure = itemView.findViewById(R.id.about_adventure);
        }
    }
}
