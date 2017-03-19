package com.example.clothingapp.clothes.woman_cloths;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.woman_cloths.hats.Hat;
import com.example.clothingapp.clothes.woman_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.woman_cloths.shoes.Shoes;
import com.example.clothingapp.clothes.woman_cloths.topDress.TopDress;


/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class WomanCloth extends Cloth {
    public String hat = "None";
    public String topDress;
    public String downDress;
    public String shoes;

    public String getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat.wearedHatType;
    }

    public String getTopDress() {
        return topDress;
    }

    public void setTopDress(TopDress topDress) {
        this.topDress = topDress.wearedTopDress;
    }

    public String getDownDress() {
        return downDress;
    }

    public void setDownDress(DownDress downDress) {
        this.downDress = downDress.wearedDownDress;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes.wearedShoes;
    }
}
