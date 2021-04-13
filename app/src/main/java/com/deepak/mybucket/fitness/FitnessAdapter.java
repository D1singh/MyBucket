package com.deepak.mybucket.fitness;

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

public class FitnessAdapter extends RecyclerView.Adapter<FitnessAdapter.FitnessViewHolder> {
    private List<FitnessModel> fitnessModels = new ArrayList<>();
    private Context context;

    public FitnessAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FitnessViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fitness_model_list, parent, false);
        return new FitnessViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FitnessViewHolder holder, int position) {
        FitnessModel model = fitnessModels.get(position);
        holder.fitness_name.setText(model.getFitnessName());
        holder.about_fitness.setText(model.getAboutFitness());
    }

    @Override
    public int getItemCount() {
        return fitnessModels.size();
    }

    public void setFitnessModels(List<FitnessModel> fitnessModels) {
        this.fitnessModels = fitnessModels;
        notifyDataSetChanged();
    }

    public FitnessModel fModel(int position) {
        return fitnessModels.get(position);
    }

    static class FitnessViewHolder extends RecyclerView.ViewHolder {
        private TextView fitness_name, about_fitness;

        public FitnessViewHolder(@NonNull View itemView) {
            super(itemView);

            fitness_name = itemView.findViewById(R.id.fitness_name);
            about_fitness = itemView.findViewById(R.id.about_fitness);
        }
    }
}
