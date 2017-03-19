package com.example.clothingapp.clothes.woman_cloths.downDress;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class DownDress extends WomanCloth {

    String[] downDress = new String[] {"Pants", "Jeans", "Classic Pants", "Skirt"};

    public String wearedDownDress;

    public String[] getDownDressType() {
        return downDress;
    }

    public void setDownDressType(int i) {
        this.wearedDownDress = downDress[i];
    }
}
