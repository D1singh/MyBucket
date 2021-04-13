package com.deepak.mybucket.fitness;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fitness_table")
public class FitnessModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String fitnessName;
    private String aboutFitness;

    public FitnessModel(String fitnessName, String aboutFitness) {
        this.fitnessName = fitnessName;
        this.aboutFitness = aboutFitness;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFitnessName() {
        return fitnessName;
    }

    public void setFitnessName(String fitnessName) {
        this.fitnessName = fitnessName;
    }

    public String getAboutFitness() {
        return aboutFitness;
    }

    public void setAboutFitness(String aboutFitness) {
        this.aboutFitness = aboutFitness;
    }
}
