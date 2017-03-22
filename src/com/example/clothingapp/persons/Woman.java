package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.woman_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.woman_cloths.hats.Hat;
import com.example.clothingapp.clothes.woman_cloths.shoes.Shoes;
import com.example.clothingapp.clothes.woman_cloths.topDress.TopDress;
import com.example.clothingapp.clothes.woman_cloths.WomanCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Woman extends Person {

    public Woman(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight, boolean hasMakeup, String lipstickColor, boolean hasEarrings) {
        super(firstName, lastName, age, hairColor, eyeColor, height, weight);
        this.hasMakeup = hasMakeup;
        this.lipstickColor = lipstickColor;
        this.hasEarrings = hasEarrings;
    }

    private Shoes shoes;
    private TopDress topDress;
    private DownDress downDress;
    private Hat hat;
    private boolean hasMakeup;
    private String lipstickColor;
    private boolean hasEarrings;

    private boolean isHasEarrings() {
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

        if (hasMakeup) {
            System.out.println("has Makeup");
        } else {
            System.out.println("No Makeup");
        }

        if (hasEarrings) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " Has Earrings");
        }
        System.out.println("\n \nLipstick Color: " + this.lipstickColor);

        System.out.println("\n \nShoes:");
        if (this.shoes.isHas()) {
            System.out.println("Brand: " + this.shoes.getBrand());
            System.out.println("Color: " + this.shoes.getColor());
            System.out.println("Size: " + this.shoes.getSize());
            System.out.println("Price: " + this.shoes.getPrice());
            System.out.println("Category: " + this.shoes.CATEGORY);
            System.out.println("Type: " + this.shoes.TYPE);
            System.out.println("Name: " + this.shoes.getName());
            System.out.println("Season: " + this.shoes.getSeason());
            System.out.println("Style: " + this.shoes.getStyle());
        } else {
            System.out.println("No Shoes");
        }

        System.out.println("\n \nDown Dress:");
        if (this.downDress.isHas()) {
            System.out.println("Brand: " + this.downDress.getBrand());
            System.out.println("Color: " + this.downDress.getColor());
            System.out.println("Size: " + this.downDress.getSize());
            System.out.println("Price: " + this.downDress.getPrice());
            System.out.println("Category: " + this.downDress.CATEGORY);
            System.out.println("Type: " + this.downDress.TYPE);
            System.out.println("Name: " + this.downDress.getName());
            System.out.println("Fit: " + this.downDress.getFit());
        } else {
            System.out.println("No Down Dress");
        }

        System.out.println("\n \nTop Dress:");
        if (this.downDress.isHas()) {
            System.out.println("Brand: " + this.topDress.getBrand());
            System.out.println("Color: " + this.topDress.getColor());
            System.out.println("Size: " + this.topDress.getSize());
            System.out.println("Price: " + this.topDress.getPrice());
            System.out.println("Category: " + this.topDress.CATEGORY);
            System.out.println("Type: " + this.topDress.TYPE);
            System.out.println("Name: " + this.topDress.getName());
            System.out.println("Sleeves: " + this.topDress.getSleeveType());
        } else {
            System.out.println("No Down Dress");
        }

        System.out.println("\n \nHat:");
        if (this.hat.isHas()) {
            System.out.println("Brand: " + this.hat.getBrand());
            System.out.println("Color: " + this.hat.getColor());
            System.out.println("Size: " + this.hat.getSize());
            System.out.println("Price: " + this.hat.getPrice());
            System.out.println("Category: " + this.hat.CATEGORY);
            System.out.println("Type: " + this.hat.TYPE);
            System.out.println("Name: " + this.hat.getName());
            System.out.println("Fit: " + this.hat.getStyle());
        } else {
            System.out.println("No Hat");
        }
    }

    public void goOut() {
        if (this.isDressed()) {
            if (!this.hasMakeup) {
                System.out.println("No Way, No Makeup!!");
            } else {
                System.out.println("\n \nI look great, going out");
            }
        } else {
            System.out.println("\n \nSorry, Im Naked, Ain't Going Out");
        }

    }



    private boolean isDressed() {
        if (!this.downDress.isHas() || !this.topDress.isHas() || !this.shoes.isHas()) {
            return false;
        }
        return true;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void setTopDress(TopDress topDress) {
        this.topDress = topDress;
    }

    public void setDownDress(DownDress downDress) {
        this.downDress = downDress;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

}
