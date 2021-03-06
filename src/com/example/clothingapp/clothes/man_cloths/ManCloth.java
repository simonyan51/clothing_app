package com.example.clothingapp.clothes.man_cloths;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.hats.Hat;
import com.example.clothingapp.clothes.man_cloths.topDress.TopDress;
import com.example.clothingapp.clothes.man_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.man_cloths.shoes.Shoes;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class ManCloth extends Cloth {
    protected ManCloth(String brand, String color, int size, double price, boolean has) {
        super(brand, color, size, price, has);
    }
    public final String CATEGORY = "Man Cloths";
}
