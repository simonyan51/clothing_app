package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.ManCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Man extends Person {

    public boolean hasTattoo = false;
    public String tattooColor;
    public void tattoColor(String str) {
        if (this.hasTattoo) {
            this.tattooColor = str;
        }
    }

    @Override public void draw() {
        super.draw();
        if (hasTattoo) {
            System.out.println(this.firstName + " " + this.lastName + " Has Tattoo, Which color is " + this.tattooColor);
        }
        if (this.goOut()) {
            System.out.println(this.firstName + " " + this.lastName + " Wears " + this.shoes + " Shoes, " + this.downDress + " Down Dress, \n "
                    + this.topDress + " TopDress and " + this.hat + " hat.");
            System.out.println("I look great, going out");
        } else {
            System.out.println("Sorry, Im Naked, Ain't Going Out");
        }
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
