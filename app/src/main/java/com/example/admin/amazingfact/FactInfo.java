package com.example.admin.amazingfact;

/**
 * Created by Admin on 15-07-2016.
 */
public class FactInfo {

    private String text;
    private boolean found;
    private String type;

    public FactInfo(String text, boolean found, String type) {
        this.text = text;
        this.found = found;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
