package com.deepak.mybucket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.deepak.mybucket.Movies.MovieActivity;
import com.deepak.mybucket.Webseries.SeriesActivity;
import com.deepak.mybucket.adventure.AdventureActivity;
import com.deepak.mybucket.book.BookActivity;
import com.deepak.mybucket.career.CareerActivity;
import com.deepak.mybucket.contribute.ContributeActivity;
import com.deepak.mybucket.creativity.CreativityActivity;
import com.deepak.mybucket.fitness.FitnessActivity;
import com.deepak.mybucket.food.FoodActivity;
import com.deepak.mybucket.game.GameActivity;
import com.deepak.mybucket.networkconnection.BucketModel;
import com.deepak.mybucket.others.OtherActivity;
import com.deepak.mybucket.travel.TravelActivity;
import com.google.android.material.card.MaterialCardView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    private MaterialCardView game_id, movies_id, travel_id, food_id, books_id, series_id, career_id, contribution_id,
            fitness_id, creativity_id, adventure_id, other_id;

    private ImageButton setting_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        differentActivity();
    }


    private void initView() {
        game_id = findViewById(R.id.game_id);
        movies_id = findViewById(R.id.movies_id);
        travel_id = findViewById(R.id.travel_id);
        food_id = findViewById(R.id.food_id);
        books_id = findViewById(R.id.books_id);
        series_id = findViewById(R.id.series_id);
        career_id = findViewById(R.id.career_id);
        contribution_id = findViewById(R.id.contribution_id);
        fitness_id = findViewById(R.id.fitness_id);
        creativity_id = findViewById(R.id.creativity_id);
        adventure_id = findViewById(R.id.adventure_id);
        other_id = findViewById(R.id.other_id);
        setting_details = findViewById(R.id.setting_details);



    }

    private void differentActivity() {
        game_id.setOnClickListener(v -> {
            startActivity(new Intent(this, GameActivity.class));
        });

        movies_id.setOnClickListener(v -> {
            startActivity(new Intent(this, MovieActivity.class));
        });

        travel_id.setOnClickListener(v -> {
            startActivity(new Intent(this, TravelActivity.class));
        });

        food_id.setOnClickListener(v -> {
            startActivity(new Intent(this, FoodActivity.class));
        });

        books_id.setOnClickListener(v -> {
            startActivity(new Intent(this, BookActivity.class));
        });

        series_id.setOnClickListener(v -> {
            startActivity(new Intent(this, SeriesActivity.class));
        });

        career_id.setOnClickListener(v -> {
            startActivity(new Intent(this, CareerActivity.class));
        });

        contribution_id.setOnClickListener(v -> {
            startActivity(new Intent(this, ContributeActivity.class));
        });

        fitness_id.setOnClickListener(v -> {
            startActivity(new Intent(this, FitnessActivity.class));
        });
        creativity_id.setOnClickListener(v -> {
            startActivity(new Intent(this, CreativityActivity.class));
        });

        adventure_id.setOnClickListener(v -> {
            startActivity(new Intent(this, AdventureActivity.class));
        });

        other_id.setOnClickListener(v -> {
            startActivity(new Intent(this, OtherActivity.class));
        });

        setting_details.setOnClickListener(v -> {
            startActivity(new Intent(this, SettingActivity.class));
        });
    }

}
