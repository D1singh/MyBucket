package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.Movies.MoviesModel;

import java.util.List;

@Dao
public interface MovieDao {
    @Insert
    void insertMovie(MoviesModel moviesModel);

    @Delete
    void deleteMovie(MoviesModel moviesModel);

    @Query("SELECT * FROM movies_table")
    LiveData<List<MoviesModel>> getAllMovies();
}
