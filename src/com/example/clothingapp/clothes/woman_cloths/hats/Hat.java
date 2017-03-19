package com.example.clothingapp.clothes.woman_cloths.hats;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Hat extends WomanCloth {
    public Hat(String brand, String color, int size, double price, boolean has, String style) {
        super(brand, color, size, price, has);
        this.style = style;
    };

    public String type = "Hat";
    public String style;
}
