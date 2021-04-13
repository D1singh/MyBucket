package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.fitness.FitnessModel;

import java.util.List;

@Dao
public interface FitnessDao {
    @Insert
    void insertFitness(FitnessModel fitnessModel);
    @Delete
    void deleteFitness(FitnessModel fitnessModel);
    @Query("SELECT * FROM fitness_table")
    LiveData<List<FitnessModel>> getAllFitness();
}
