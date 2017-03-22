package com.example.clothingapp.clothes.man_cloths.hats;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class Cap extends Hat{
    public Cap(String brand, String color, int size, double price, boolean has, String style) {
        super(brand, color, size, price, has, style);
        this.setName("Cap");
    };
}
