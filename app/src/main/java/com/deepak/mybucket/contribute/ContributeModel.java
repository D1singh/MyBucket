package com.deepak.mybucket.contribute;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contribute_table")
public class ContributeModel {
    @PrimaryKey
    private int id;
    private String contributeName;
    private String aboutContribution;

    public ContributeModel(String contributeName, String aboutContribution) {
        this.contributeName = contributeName;
        this.aboutContribution = aboutContribution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContributeName() {
        return contributeName;
    }

    public void setContributeName(String contributeName) {
        this.contributeName = contributeName;
    }

    public String getAboutContribution() {
        return aboutContribution;
    }

    public void setAboutContribution(String aboutContribution) {
        this.aboutContribution = aboutContribution;
    }
}
