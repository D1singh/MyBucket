package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.others.OtherModel;

import java.util.List;

@Dao
public interface OtherDao {
    @Insert
    void insertOther(OtherModel otherModel);
    @Delete
    void deleteOther(OtherModel otherModel);
    @Query("SELECT * FROM other_table")
    LiveData<List<OtherModel>> getAllOther();
}
