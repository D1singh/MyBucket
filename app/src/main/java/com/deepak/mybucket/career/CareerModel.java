package com.deepak.mybucket.career;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "career_table")
public class CareerModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String careerName;
    private String aboutCareer;

    public CareerModel(String careerName, String aboutCareer) {
        this.careerName = careerName;
        this.aboutCareer = aboutCareer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public String getAboutCareer() {
        return aboutCareer;
    }

    public void setAboutCareer(String aboutCareer) {
        this.aboutCareer = aboutCareer;
    }
}
