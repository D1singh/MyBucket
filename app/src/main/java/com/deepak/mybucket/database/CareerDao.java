package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.career.CareerModel;

import java.util.List;

@Dao
public interface CareerDao {

    @Insert
    void insertCareer(CareerModel careerModel);

    @Delete
    void deleteCareer(CareerModel careerModel);

    @Query("SELECT * FROM career_table")
    LiveData<List<CareerModel>> gatAllCareer();

}
