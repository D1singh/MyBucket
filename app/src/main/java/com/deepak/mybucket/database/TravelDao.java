package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.travel.TravelModel;

import java.util.List;

@Dao
public interface TravelDao {

    @Insert
    void insertTravel(TravelModel travelModel);

    @Delete
    void deleteTravel(TravelModel travelModel);

    @Query("SELECT* FROM travel_table")
    LiveData<List<TravelModel>> getAllTravel();
}
