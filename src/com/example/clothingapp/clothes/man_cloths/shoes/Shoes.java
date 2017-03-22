package com.example.clothingapp.clothes.man_cloths.shoes;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class Shoes extends ManCloth {
    protected Shoes(String brand, String color, int size, double price, boolean has, String season, String style) {
        super(brand, color, size, price, has);
        this.season = season;
        this.style = style;
    }
    public final String TYPE = "Shoes";
    private String season;
    private String style;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
