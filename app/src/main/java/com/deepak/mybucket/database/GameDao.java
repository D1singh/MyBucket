package com.deepak.mybucket.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.deepak.mybucket.game.GameModel;

import java.util.List;

@Dao
public interface GameDao {
    @Insert
    void insertGame(GameModel gameModel);

    @Delete
    void deleteGame(GameModel gameModel);


    @Query("SELECT * FROM game_bucket")
    LiveData<List<GameModel>> getAllGame();
}
