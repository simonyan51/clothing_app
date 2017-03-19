package com.example.clothingapp.clothes.woman_cloths.topDress;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class Shirt extends TopDress {
    public Shirt(String brand, String color, int size, double price, boolean has, String sleeveType) {
        super(brand, color, size, price, has, sleeveType);
        this.name = "Shirt";
    };
}
