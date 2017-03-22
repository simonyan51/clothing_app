package com.example.clothingapp.clothes.man_cloths.topDress;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class TShirt extends TopDress {
    public TShirt(String brand, String color, int size, double price, boolean has, String sleeveType) {
        super(brand, color, size, price, has, sleeveType);
        this.setName("T-Shirt");
    };
}
