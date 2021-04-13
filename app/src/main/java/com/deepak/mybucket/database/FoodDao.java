package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.food.FoodModel;

import java.util.List;

@Dao
public interface FoodDao {

    @Insert
    void insertFood(FoodModel foodModel);

    @Delete
    void deleteFood(FoodModel foodModel);

    @Query("SELECT * FROM food_table")
    LiveData<List<FoodModel>> getAllFood();
}
