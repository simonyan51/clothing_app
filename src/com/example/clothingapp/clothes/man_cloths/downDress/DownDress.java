package com.example.clothingapp.clothes.man_cloths.downDress;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class DownDress extends ManCloth {
    public DownDress(String brand, String color, int size, double price, boolean has, String fit) {
        super(brand, color, size, price, has);
        this.fit = fit;
    }
    public String type = "Down Dress";
    public String fit;

}
