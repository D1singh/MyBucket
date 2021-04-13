package com.deepak.mybucket.travel;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "travel_table")
public class TravelModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String TravelPlaceName;
    private String AboutPlace;

    public TravelModel(String TravelPlaceName, String AboutPlace) {
        this.TravelPlaceName = TravelPlaceName;
        this.AboutPlace = AboutPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravelPlaceName() {
        return TravelPlaceName;
    }

    public void setTravelPlaceName(String travelPlaceName) {
        TravelPlaceName = travelPlaceName;
    }

    public String getAboutPlace() {
        return AboutPlace;
    }

    public void setAboutPlace(String aboutPlace) {
        AboutPlace = aboutPlace;
    }
}
