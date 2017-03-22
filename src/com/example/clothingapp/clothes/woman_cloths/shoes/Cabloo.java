package com.example.clothingapp.clothes.woman_cloths.shoes;

import com.example.clothingapp.clothes.man_cloths.shoes.*;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class Cabloo extends Shoes {
    public Cabloo(String brand, String color, int size, double price, boolean has, String season, String style) {
        super(brand, color, size, price, has, season, style);
        this.setName("Cabloo");
    };
}
