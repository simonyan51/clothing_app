package com.example.clothingapp.clothes.man_cloths.topDress;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class TopDress extends ManCloth {
    public TopDress(String brand, String color, int size, double price, boolean has, String sleeveType) {
        super(brand, color, size, price, has);
        this.sleeveType = sleeveType;
    }
    public String type = "Top Dress";
    public String sleeveType;
}
