package com.example.clothingapp.clothes.man_cloths.shoes;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Shoes extends ManCloth {

    public String[] shoesType = new String[] {"Boots", "Classic Shoes", "Sneakers"};
    public String wearedShoes;
    public int number;

    public String[] getShoesType() {
        return shoesType;
    }

    public void setShoesType(int i) {
        this.wearedShoes = shoesType[i];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
