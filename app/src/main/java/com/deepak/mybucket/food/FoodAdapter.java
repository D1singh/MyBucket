package com.deepak.mybucket.food;

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

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List<FoodModel> foodModels = new ArrayList<>();
    private Context context;

    public FoodAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_model_list, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodModel foodModel = foodModels.get(position);
        holder.food_Name.setText(foodModel.getFoodName());
        holder.about_food.setText(foodModel.getFoodDesc());
    }

    @Override
    public int getItemCount() {
        return foodModels.size();
    }

    public void setFoodModels(List<FoodModel> foodModels) {
        this.foodModels = foodModels;
        notifyDataSetChanged();
    }

    public FoodModel foodModel(int position) {
        return foodModels.get(position);
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {
        TextView food_Name, about_food;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            food_Name = itemView.findViewById(R.id.food_Name);
            about_food = itemView.findViewById(R.id.about_food);
        }
    }
}
