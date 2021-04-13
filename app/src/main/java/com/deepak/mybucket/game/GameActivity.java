package com.deepak.mybucket.game;

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

import android.widget.TextView;
import android.widget.Toast;


import com.deepak.mybucket.R;
import com.deepak.mybucket.networkconnection.BucketModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class GameActivity extends AppCompatActivity {
    RecyclerView game_recyclerView;
    GameAdapter adapter;
    FloatingActionButton game_add_btn;
    private BucketModel bucketModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        game_recyclerView = findViewById(R.id.bucket_recycler_view);
        adapter = new GameAdapter(this);
        game_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        game_recyclerView.setAdapter(adapter);
        game_add_btn = findViewById(R.id.game_add_btn);
        bucketModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(BucketModel.class);
        bucketModel.getGameModel().observe(this, gameModels -> adapter.setGameModels(gameModels));

/**...........................To Add game  on click.........................*/

        game_add_btn.setOnClickListener(v -> {
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
                    GameModel quotes = new GameModel(txt,tx);
                    bucketModel.insetGame(quotes);
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
      bucketModel.deleteGame(adapter.getPosition(viewHolder.getAdapterPosition()));
        Toast.makeText(GameActivity.this, "Bucket Game Deleted", Toast.LENGTH_SHORT).show();
    }
}).attachToRecyclerView(game_recyclerView);

    }
}