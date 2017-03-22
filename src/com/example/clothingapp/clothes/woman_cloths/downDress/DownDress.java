package com.example.clothingapp.clothes.woman_cloths.downDress;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class DownDress extends WomanCloth {
    protected DownDress(String brand, String color, int size, double price, boolean has, String fit) {
        super(brand, color, size, price, has);
        this.fit = fit;
    }
    public final String TYPE = "Down Dress";
    private String fit;

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
}
