package com.deepak.mybucket.Webseries;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.deepak.mybucket.R;
import com.deepak.mybucket.networkconnection.BucketModel;
import com.deepak.mybucket.travel.TravelAdapter;
import com.deepak.mybucket.travel.TravelModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class SeriesActivity extends AppCompatActivity {
private RecyclerView webSeries_recycler_view;
 private WebSeriesAdapter adapter;
 private FloatingActionButton webSeries_add_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        webSeries_recycler_view = findViewById(R.id.webSeries_recycler_view);
        adapter = new WebSeriesAdapter(this);
        webSeries_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        webSeries_recycler_view.setAdapter(adapter);

        webSeries_add_btn = findViewById(R.id.webSeries_add_btn);
        BucketModel bucketModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(BucketModel.class);
        bucketModel.getWebSeriesModel().observe(this,webSeriesModels -> adapter.setWebSeriesModels(webSeriesModels));

        webSeries_add_btn.setOnClickListener(v -> {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.game_dialog_box);
            int width = WindowManager.LayoutParams.MATCH_PARENT;
            int height = WindowManager.LayoutParams.WRAP_CONTENT;

            //set layout
            Objects.requireNonNull(dialog.getWindow()).setLayout(width,height);
            //show dialog
            dialog.show();

            EditText editText = dialog.findViewById(R.id.place_text_name);
            EditText edit = dialog.findViewById(R.id.place_text);
            Button button = dialog.findViewById(R.id.btn_upload);

            button.setOnClickListener( v1 -> {

                if (editText.getText().length()==0){
                    Toast.makeText(this, "input required", Toast.LENGTH_SHORT).show();
                }else {
                    String txt = editText.getText().toString().trim();
                    String tx = edit.getText().toString().trim();
                   WebSeriesModel webSeriesModel = new WebSeriesModel(txt,tx);
                   bucketModel.insertWebSeries(webSeriesModel);
                    dialog.dismiss();}
            });
        });

/**...........................To delete on swap.........................*/

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                bucketModel.deleteWebSeries(adapter.webSeries(viewHolder.getAdapterPosition()));
            }
        }).attachToRecyclerView(webSeries_recycler_view);

    }
}