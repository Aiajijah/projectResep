package com.example.projectresep;

import java.io.Serializable;

public class IsiResep implements Serializable {
    private String title;
    private  String thumb;
    private String key;
    private String times;
    private String portion;
    private String dificulty;

    public IsiResep(String title, String thumb, String key, String times, String portion, String dificulty) {
        this.title = title;
        this.thumb = thumb;
        this.key = key;
        this.times = times;
        this.portion = portion;
        this.dificulty = dificulty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }
}

