package com.example.clothingapp.clothes.man_cloths.hats;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Hat extends ManCloth {

    public Hat(String brand, String color, int size, double price, boolean has, String style) {
        super(brand, color, size, price, has);
        this.style = style;
    };

    public String type = "Hat";
    public String style;
}
