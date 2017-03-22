package com.example.clothingapp.clothes.man_cloths.topDress;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class TopDress extends ManCloth {
    protected TopDress(String brand, String color, int size, double price, boolean has, String sleeveType) {
        super(brand, color, size, price, has);
        this.sleeveType = sleeveType;
    }
    public final String TYPE = "Top Dress";
    private String sleeveType;

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }
}
