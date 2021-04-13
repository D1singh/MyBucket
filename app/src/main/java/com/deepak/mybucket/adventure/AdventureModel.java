package com.deepak.mybucket.adventure;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "adventure_table")
public class AdventureModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String adventureName;
    private String aboutAdventure;

    public AdventureModel(String adventureName, String aboutAdventure) {
        this.adventureName = adventureName;
        this.aboutAdventure = aboutAdventure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdventureName() {
        return adventureName;
    }

    public void setAdventureName(String adventureName) {
        this.adventureName = adventureName;
    }

    public String getAboutAdventure() {
        return aboutAdventure;
    }

    public void setAboutAdventure(String aboutAdventure) {
        this.aboutAdventure = aboutAdventure;
    }
}
