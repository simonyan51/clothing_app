package com.example.clothingapp.clothes.woman_cloths.downDress;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class DownDress extends WomanCloth {
    public DownDress(String brand, String color, int size, double price, boolean has, String fit) {
        super(brand, color, size, price, has);
        this.fit = fit;
    }
    public String type = "Down Dress";
    public String fit;
}
