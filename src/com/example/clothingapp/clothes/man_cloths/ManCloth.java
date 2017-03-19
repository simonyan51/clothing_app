package com.example.clothingapp.clothes.man_cloths;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.hats.Hat;
import com.example.clothingapp.clothes.man_cloths.topDress.TopDress;
import com.example.clothingapp.clothes.man_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.man_cloths.shoes.Shoes;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class ManCloth extends Cloth {
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
