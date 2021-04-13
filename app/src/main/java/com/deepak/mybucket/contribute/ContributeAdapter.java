package com.deepak.mybucket.contribute;

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

public class ContributeAdapter extends RecyclerView.Adapter<ContributeAdapter.ContributeViewHolder>{
    private List<ContributeModel> contributeModels = new ArrayList<>();
    private Context context;

    public ContributeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ContributeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contribute_model_list,parent,false);
        return new ContributeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContributeViewHolder holder, int position) {
        ContributeModel model = contributeModels.get(position);
        holder.contribute_name.setText(model.getContributeName());
        holder.about_contribute.setText(model.getAboutContribution());
    }

    @Override
    public int getItemCount() {
        return contributeModels.size();
    }

    public void setContributeModels(List<ContributeModel> contributeModels) {
        this.contributeModels = contributeModels;
        notifyDataSetChanged();
    }

    public ContributeModel cModel(int position){
        return contributeModels.get(position);
    }

    static class ContributeViewHolder extends RecyclerView.ViewHolder{
private TextView contribute_name,about_contribute;
        public ContributeViewHolder(@NonNull View itemView) {
            super(itemView);
            contribute_name = itemView.findViewById(R.id.contribute_name);
            about_contribute = itemView.findViewById(R.id.about_contribute);
        }
    }
}
