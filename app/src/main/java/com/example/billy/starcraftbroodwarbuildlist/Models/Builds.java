package com.example.billy.starcraftbroodwarbuildlist.Models;

import java.io.Serializable;

/**
 * Created by wchoi on 7/27/2017.
 */

public class Builds implements Serializable{


    public String buildName;
    public String RaceVsRace;
    public String buildOrder;
    public String buildDifficulty;
    public String buildFavorite;
    public String buildNotes;
    public int buildID;

    public int getBuildID() {
        return buildID;
    }

    public void setBuildID(int buildID) {
        this.buildID = buildID;
    }

    public Builds (String buildName, String RaceVsRace, String buildOrder, String buildNotes){

        this.buildName = buildName;
        this.RaceVsRace = RaceVsRace;
        this.buildOrder = buildOrder;
        this.buildNotes = buildNotes;


    }
    public Builds (){

    }

    public String getBuildName() {
        return buildName;
    }

    public String getRaceVsRace() {
        return RaceVsRace;
    }



    public String getBuildDifficulty() {
        return buildDifficulty;
    }

    public String getBuildFavorite() {
        return buildFavorite;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public void setRaceVsRace(String raceVsRace) {
        RaceVsRace = raceVsRace;
    }

    public void setBuildInfo(String buildInfo) {
        this.buildOrder = buildOrder;
    }

    public void setBuildDifficulty(String buildDifficulty) {
        this.buildDifficulty = buildDifficulty;
    }

    public void setBuildFavorite(String buildFavorite) {
        this.buildFavorite = buildFavorite;
    }

    public String getBuildOrder() {
        return buildOrder;
    }

    public void setBuildOrder(String buildOrder) {
        this.buildOrder = buildOrder;
    }

    public String getBuildNotes() {
        return buildNotes;
    }

    public void setBuildNotes(String buildNotes) {
        this.buildNotes = buildNotes;
    }


}
