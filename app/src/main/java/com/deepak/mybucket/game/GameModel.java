package com.deepak.mybucket.game;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "game_bucket")
public class GameModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String gameName;

    private String aboutGame;

    public GameModel(String gameName, String aboutGame) {
        this.gameName = gameName;

        this.aboutGame = aboutGame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAboutGame() {
        return aboutGame;
    }

    public void setAboutGame(String aboutGame) {
        this.aboutGame = aboutGame;
    }
}
