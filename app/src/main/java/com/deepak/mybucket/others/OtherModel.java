package com.deepak.mybucket.others;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "other_table")
public class OtherModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String otherName;
    private String aboutOther;

    public OtherModel(String otherName, String aboutOther) {
        this.otherName = otherName;
        this.aboutOther = aboutOther;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getAboutOther() {
        return aboutOther;
    }

    public void setAboutOther(String aboutOther) {
        this.aboutOther = aboutOther;
    }
}
