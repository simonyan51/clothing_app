package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Woman extends Person {

    public boolean hasMakeup;
    public String lipstickColor;
    public boolean hasEarrings;

    public boolean isHasEarrings() {
        return hasEarrings;
    }

    public void setHasEarrings(boolean hasEarrings) {
        this.hasEarrings = hasEarrings;
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public void setLipstickColor(String lipstickColor) {
        this.lipstickColor = lipstickColor;
    }

    @Override
    public void goOut() {
        boolean dressed = this.isDressed();
        if (dressed && this.hasMakeup) {
            System.out.println("I look great, goind out");
        } else {
            System.out.println("No way, I will not go out without makeup!");
        }
    }

    public String getShoes() {
        return shoes;
    }
    public void setShoes(WomanCloth shoes) {
        this.shoes = shoes.shoes;
    }

    public String getTopDress() {
        return topDress;
    }

    public void setTopDress(WomanCloth topDress) {
        this.topDress = topDress.topDress;
    }

    public String getDownDress() {
        return downDress;
    }

    public void setDownDress(WomanCloth downDress) {
        this.downDress = downDress.downDress;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(WomanCloth hat) {
        this.hat = hat.hat;
    }


}
