package com.example.projectresep.detailnya;

import java.io.Serializable;
import java.util.List;

public class Hasil implements Serializable {
    private String title;
    private String thumb;
    private String servings;
    private String times;
    private String diviculty;
    private String desc;
    private List<NeedItem> needItem;
    private List<String> ingredient;
    private List<String> step;

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

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getDiviculty() {
        return diviculty;
    }

    public void setDiviculty(String diviculty) {
        this.diviculty = diviculty;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<NeedItem> getNeedItem() {
        return needItem;
    }

    public void setNeedItem(List<NeedItem> needItem) {
        this.needItem = needItem;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    public List<String> getStep() {
        return step;
    }

    public void setStep(List<String> step) {
        this.step = step;
    }
}
