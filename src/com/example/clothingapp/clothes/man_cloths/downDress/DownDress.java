package com.example.clothingapp.clothes.man_cloths.downDress;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class DownDress extends ManCloth {

    String[] downDress = new String[] {"Pants", "Jeans", "Classic Pants", "Shorts"};

    public String wearedDownDress;

    public String[] getDownDressType() {
        return downDress;
    }

    public void setDownDressType(int i) {
        this.wearedDownDress = downDress[i];
    }

}
