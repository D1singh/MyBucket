package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.adventure.AdventureModel;

import java.util.List;

@Dao
public interface AdventureDao {
    @Insert
    void insertAdventure(AdventureModel adventureModel);
    @Delete
    void deleteAdventure(AdventureModel adventureModel);

    @Query("SELECT * FROM adventure_table")
    LiveData<List<AdventureModel>> getAllAdventure();
}
