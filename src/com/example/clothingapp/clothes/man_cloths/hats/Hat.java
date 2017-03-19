package com.example.clothingapp.clothes.man_cloths.hats;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Hat extends ManCloth {

    public String[] hatType = new String[] {"Flat Cap", "Cap", "Snap Back", "Fedora", "Knit Cap"};
    public String wearedHatType = "None";

    public String[] getHatType() {
        return hatType;
    }

    public void setHatType(int i) {
        this.wearedHatType = hatType[i];
    }

    public boolean isWeared() {
        if (!wearedHatType.equals("None")) {
            return true;
        }
        return false;
    }

}
