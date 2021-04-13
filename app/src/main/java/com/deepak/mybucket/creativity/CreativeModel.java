package com.deepak.mybucket.creativity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "creative_table")
public class CreativeModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String creativeName;
    private String aboutCreative;

    public CreativeModel(String creativeName, String aboutCreative) {
        this.creativeName = creativeName;
        this.aboutCreative = aboutCreative;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreativeName() {
        return creativeName;
    }

    public void setCreativeName(String creativeName) {
        this.creativeName = creativeName;
    }

    public String getAboutCreative() {
        return aboutCreative;
    }

    public void setAboutCreative(String aboutCreative) {
        this.aboutCreative = aboutCreative;
    }
}
