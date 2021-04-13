package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.creativity.CreativeModel;

import java.util.List;

@Dao
public interface CreativeDao {
@Insert
    void insertCreative(CreativeModel creativeModel);
@Delete
    void deleteCreative(CreativeModel creativeModel);
@Query("SELECT * FROM creative_table")
    LiveData<List<CreativeModel>> getAllCreative();
}
