package com.deepak.mybucket.career;

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

public class CareerAdapter extends RecyclerView.Adapter<CareerAdapter.CareerViewHolder>{
    private List<CareerModel> careerModels = new ArrayList<>();
    private Context context;

    public CareerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CareerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.career_model_list,parent,false);
        return new CareerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CareerViewHolder holder, int position) {
        CareerModel model = careerModels.get(position);
        holder.career_name.setText(model.getCareerName());
        holder.about_career.setText(model.getAboutCareer());
    }

    @Override
    public int getItemCount() {
        return careerModels.size();
    }

    public void setCareerModels(List<CareerModel> careerModels) {
        this.careerModels = careerModels;
        notifyDataSetChanged();
    }

    public CareerModel career(int position){
        return careerModels.get(position);
    }

    static class CareerViewHolder extends RecyclerView.ViewHolder{
        private TextView career_name,about_career;
        public CareerViewHolder(@NonNull View itemView) {
            super(itemView);
            career_name = itemView.findViewById(R.id.career_name);
            about_career = itemView.findViewById(R.id.about_career);
        }
    }
}
