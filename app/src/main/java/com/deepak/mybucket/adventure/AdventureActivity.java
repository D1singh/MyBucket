package com.deepak.mybucket.adventure;

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

import com.deepak.mybucket.Movies.MovieAdapter;
import com.deepak.mybucket.Movies.MoviesModel;
import com.deepak.mybucket.R;
import com.deepak.mybucket.networkconnection.BucketModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class AdventureActivity extends AppCompatActivity {
private RecyclerView adventure_recycler_view;
private AdventureAdapter adventureAdapter;
private FloatingActionButton adventure_add_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        adventure_recycler_view = findViewById(R.id.adventure_recycler_view);
        adventureAdapter = new AdventureAdapter(this) ;
        adventure_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adventure_recycler_view.setAdapter(adventureAdapter);
        adventure_add_btn = findViewById(R.id.adventure_add_btn);


        BucketModel bucketModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(BucketModel.class);
        bucketModel.getAdventureModel().observe(this,adventureModels -> adventureAdapter.setAdventureModels(adventureModels));

        adventure_add_btn.setOnClickListener(v -> {
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
                    AdventureModel adventureModel = new AdventureModel(txt,tx);
                    bucketModel.insertAdventure(adventureModel);
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
                bucketModel.deleteAdventure(adventureAdapter.aModel(viewHolder.getAdapterPosition()));
            }
        }).attachToRecyclerView(adventure_recycler_view);
    }
}