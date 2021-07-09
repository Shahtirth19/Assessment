package com.example.myapplication.ui.home;

public class StaticRvModel {
    private int image;
    private int image2;
    private String text;
    private String txt;

    public StaticRvModel(int image, int image2, String text, String txt) {
        this.image = image;
        this.image2 = image2;
        this.text = text;
        this.txt = txt;
    }

    public int getImage() {
        return image;
    }

    public int getImage2() {
        return image2;
    }

    public String getText() {
        return text;
    }

    public String getTxt() {
        return txt;
    }
}
