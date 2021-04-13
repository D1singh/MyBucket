package com.deepak.mybucket.others;

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

public class OtherAdapter extends RecyclerView.Adapter<OtherAdapter.OtherViewHolder> {
    private List<OtherModel> otherModels = new ArrayList<>();
    private Context context;

    public OtherAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public OtherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.other_model_list,parent,false);
        return new OtherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OtherViewHolder holder, int position) {
    OtherModel model = otherModels.get(position);
    holder.other_name.setText(model.getOtherName());
    holder.about_other.setText(model.getAboutOther());
    }

    @Override
    public int getItemCount() {
        return otherModels.size();
    }

    public void setOtherModels(List<OtherModel> otherModels) {
        this.otherModels = otherModels;
        notifyDataSetChanged();
    }
    public OtherModel oModel(int position)
    {
        return otherModels.get(position);
    }
    static class OtherViewHolder extends RecyclerView.ViewHolder{
private TextView other_name, about_other;
        public OtherViewHolder(@NonNull View itemView) {
            super(itemView);
            other_name = itemView.findViewById(R.id.other_name);
            about_other = itemView.findViewById(R.id.about_other);
        }
    }
}
