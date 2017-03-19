package com.example.clothingapp.clothes.woman_cloths.topDress;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class TopDress extends WomanCloth {

    public String[] topDressType = new String[] {"Shirt", "T-Shirt", "Sweater", "Ges Shirt"};
    public String wearedTopDress;

    public String[] getTopDressType() {
        return topDressType;
    }

    public void setTopDressType(int i) {
        this.wearedTopDress = topDressType[i];
    }
}
