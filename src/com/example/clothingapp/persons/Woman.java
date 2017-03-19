package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.woman_cloths.WomanCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Woman extends Person {

    public boolean hasMakeup = false;
    public String lipstickColor;
    public boolean hasEarrings = false;

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
        this.hasMakeup = true;
    }

    @Override public void draw() {
        super.draw();
        if (hasEarrings) {
            System.out.println(this.firstName + " " + this.lastName + " Has Earrings");
        }
        System.out.println(this.firstName + " " + this.lastName + " Lipstick Color is " + this.lipstickColor);

        if (this.goOut()) {
            System.out.println(this.firstName + " " + this.lastName + " Wears " + this.shoes + " Shoes, " + this.downDress + " Down Dress, \n "
                    + this.topDress + " TopDress and " + this.hat + " hat.");
            if (!hasMakeup) {
                System.out.println("No Way, I'm Not Maked Up!!");
            } else
                System.out.println("I look great, going out");
        } else {
            System.out.println("Sorry, Im Naked, Ain't Going Out");
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
