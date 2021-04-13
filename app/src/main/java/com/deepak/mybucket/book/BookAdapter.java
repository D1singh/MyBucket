package com.deepak.mybucket.book;

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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    List<BookModel> models = new ArrayList<>();
    private Context context;

    public BookAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_model_list,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        BookModel book = models.get(position);
        holder.book_Name.setText(book.getBookName());
        holder.about_book.setText(book.getAboutBook());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public void setModels(List<BookModel> models) {
        this.models = models;
        notifyDataSetChanged();
    }

    public BookModel bookData(int position){
        return models.get(position);
    }

    static class BookViewHolder extends RecyclerView.ViewHolder{
        private TextView book_Name,about_book;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            book_Name = itemView.findViewById(R.id.book_Name);
            about_book = itemView.findViewById(R.id.about_book);
        }
    }
}
