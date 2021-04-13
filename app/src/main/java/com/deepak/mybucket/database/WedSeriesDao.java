package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.Webseries.WebSeriesModel;

import java.util.List;

@Dao
public interface WedSeriesDao {

    @Insert
    void insertWebSeries(WebSeriesModel webSeriesModel);

    @Delete
    void deleteWebSeries(WebSeriesModel webSeriesModel);

  @Query("SELECT * FROM series_table")
    LiveData<List<WebSeriesModel>> getAllWebSeries();
}