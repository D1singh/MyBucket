package com.deepak.mybucket.food;

import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;

@Entity(tableName = "food_table")
public class FoodModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String foodName;
    private String foodDesc;

    public FoodModel(String foodName, String foodDesc) {
        this.foodName = foodName;
        this.foodDesc = foodDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }
}
