package com.deepak.mybucket.travel;

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

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder>{
    List<TravelModel> travelModels = new ArrayList<>();
    Context context;
    public TravelAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_model_list,parent,false);
        return new TravelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        TravelModel model = travelModels.get(position);
        holder.place_name.setText(model.getTravelPlaceName());
        holder.about_place.setText(model.getAboutPlace());
    }

    @Override
    public int getItemCount() {
        return travelModels.size();
    }

    public void setTravelModels(List<TravelModel> travelModels) {
        this.travelModels = travelModels;
        notifyDataSetChanged();
    }

    public TravelModel travelModel(int position){
        return travelModels.get(position);
    }

    static class TravelViewHolder extends RecyclerView.ViewHolder{

        TextView place_name,about_place;
        public TravelViewHolder(@NonNull View itemView) {
            super(itemView);
            place_name = itemView.findViewById(R.id.place_name);
            about_place = itemView.findViewById(R.id.about_place);
        }

    }
}
