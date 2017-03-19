package com.example.clothingapp.clothes.man_cloths.topDress;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class TopDress extends ManCloth {

    public String[] topDressType = new String[] {"Shirt", "T-Shirt", "Sweater"};
    public String wearedTopDress;

    public String[] getTopDressType() {
        return topDressType;
    }

    public void setTopDressType(int i) {
        this.wearedTopDress = topDressType[i];
    }

}
