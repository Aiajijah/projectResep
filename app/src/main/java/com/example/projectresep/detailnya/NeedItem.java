package com.example.projectresep.detailnya;

import java.io.Serializable;

public class NeedItem implements Serializable {
    private String item_name;
    private String thumb_item;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getThumb_item() {
        return thumb_item;
    }

    public void setThumb_item(String thumb_item) {
        this.thumb_item = thumb_item;
    }
}
