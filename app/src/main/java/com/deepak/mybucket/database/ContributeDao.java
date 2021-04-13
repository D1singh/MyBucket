package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.contribute.ContributeModel;

import java.util.List;

@Dao
public interface ContributeDao {
    @Insert
    void insertContribute(ContributeModel contributeModel);

    @Delete
    void  deleteContribute(ContributeModel contributeModel);

    @Query("SELECT  * FROM contribute_table")
    LiveData<List<ContributeModel>> getAllContribution();
}
