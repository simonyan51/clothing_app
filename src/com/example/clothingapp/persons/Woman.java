package com.example.clothingapp.persons;

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


}
