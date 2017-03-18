package com.example.clothingapp.clothes.woman_cloths.shoes;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Shoes extends WomanCloth {

    public String shoesName;
    public boolean hasBootlace;
    public boolean hasHoles;
    public int number;

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public boolean isHasBootlace() {
        return hasBootlace;
    }

    public void setHasBootlace(boolean hasBootlace) {
        this.hasBootlace = hasBootlace;
    }

    public boolean isHasHoles() {
        return hasHoles;
    }

    public void setHasHoles(boolean hasHoles) {
        this.hasHoles = hasHoles;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
