package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.ManCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Man extends Person {

    public boolean hasTattoo;
    public String tattooColor;
    public String tattoColor(String str) {
        if (this.hasTattoo) {
            return this.tattooColor = str;
        }
        return "None";
    }

    public String getShoes() {
        return shoes;
    }
    public void setShoes(ManCloth shoes) {
        this.shoes = shoes.shoes;
    }

    public String getTopDress() {
        return topDress;
    }

    public void setTopDress(ManCloth topDress) {
        this.topDress = topDress.topDress;
    }

    public String getDownDress() {
        return downDress;
    }

    public void setDownDress(ManCloth downDress) {
        this.downDress = downDress.downDress;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(ManCloth hat) {
        this.hat = hat.hat;
    }
}
