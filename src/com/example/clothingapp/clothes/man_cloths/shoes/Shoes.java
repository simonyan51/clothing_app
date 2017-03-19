package com.example.clothingapp.clothes.man_cloths.shoes;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Shoes extends ManCloth {
    public Shoes(String brand, String color, int size, double price, boolean has, String season, String style) {
        super(brand, color, size, price, has);
        this.season = season;
        this.style = style;
    }
    public String type = "Shoes";
    public String season;
    public String style;
}
