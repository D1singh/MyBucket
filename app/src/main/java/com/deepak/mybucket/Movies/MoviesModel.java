package com.deepak.mybucket.Movies;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movies_table")
public class MoviesModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String MovieName;
    private String shortDisc;


    public MoviesModel(String MovieName, String shortDisc) {
       this.MovieName = MovieName;
        this.shortDisc = shortDisc;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getShortDisc() {
        return shortDisc;
    }

    public void setShortDisc(String shortDisc) {
        this.shortDisc = shortDisc;
    }

}
