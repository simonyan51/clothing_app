package com.example.clothingapp.clothes.woman_cloths;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.woman_cloths.hats.Hat;
import com.example.clothingapp.clothes.woman_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.woman_cloths.shoes.Shoes;
import com.example.clothingapp.clothes.woman_cloths.topDress.TopDress;


/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class WomanCloth extends Cloth {
    protected WomanCloth(String brand, String color, int size, double price, boolean has) {
        super(brand, color, size, price, has);
    }
    public final String CATEGORY = "Woman Cloth";
}
