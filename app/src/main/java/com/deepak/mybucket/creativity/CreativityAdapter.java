package com.deepak.mybucket.creativity;

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

public class CreativityAdapter extends RecyclerView.Adapter<CreativityAdapter.CreativeViewHolder> {
    private List<CreativeModel> creativeModels = new ArrayList<>();
    private Context context;

    public CreativityAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CreativeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.creative_model_list,parent,false);
        return new CreativeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreativeViewHolder holder, int position) {
CreativeModel model = creativeModels.get(position);
holder.creative_name.setText(model.getCreativeName());
holder.about_creative.setText(model.getAboutCreative());
    }

    @Override
    public int getItemCount() {
        return creativeModels.size();
    }

    public void setCreativeModels(List<CreativeModel> creativeModels) {
        this.creativeModels = creativeModels;
        notifyDataSetChanged();
    }
    public CreativeModel cModel(int position){
        return creativeModels.get(position);
    }

    static class CreativeViewHolder extends RecyclerView.ViewHolder{
private TextView creative_name,about_creative;
        public CreativeViewHolder(@NonNull View itemView) {
            super(itemView);
            creative_name = itemView.findViewById(R.id.creative_name);
            about_creative = itemView.findViewById(R.id.about_creative);
        }
    }
}
