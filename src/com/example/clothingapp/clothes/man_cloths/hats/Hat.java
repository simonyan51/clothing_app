package com.example.clothingapp.clothes.man_cloths.hats;

import com.example.clothingapp.clothes.man_cloths.ManCloth;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Hat extends ManCloth {

    public String type;
    public boolean hasWeared;
    public String position;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasWeared() {
        return hasWeared;
    }

    public void setHasWeared(boolean hasWeared) {
        this.hasWeared = hasWeared;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
