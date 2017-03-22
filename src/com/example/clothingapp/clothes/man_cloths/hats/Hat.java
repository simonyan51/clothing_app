package com.example.clothingapp.clothes.man_cloths.hats;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class Hat extends ManCloth {

    protected Hat(String brand, String color, int size, double price, boolean has, String style) {
        super(brand, color, size, price, has);
        this.style = style;
    };

    public final String TYPE = "Hat";
    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
