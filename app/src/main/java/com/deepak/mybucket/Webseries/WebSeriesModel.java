package com.deepak.mybucket.Webseries;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "series_table")
public class WebSeriesModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String webSeriesName;
    private String aboutWebSeries;

    public WebSeriesModel(String webSeriesName, String aboutWebSeries) {
        this.webSeriesName = webSeriesName;
        this.aboutWebSeries = aboutWebSeries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebSeriesName() {
        return webSeriesName;
    }

    public void setWebSeriesName(String webSeriesName) {
        this.webSeriesName = webSeriesName;
    }

    public String getAboutWebSeries() {
        return aboutWebSeries;
    }

    public void setAboutWebSeries(String aboutWebSeries) {
        this.aboutWebSeries = aboutWebSeries;
    }
}
