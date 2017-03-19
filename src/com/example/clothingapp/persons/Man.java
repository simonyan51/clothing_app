package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.shoes.*;
import com.example.clothingapp.clothes.man_cloths.topDress.*;
import com.example.clothingapp.clothes.man_cloths.downDress.*;
import com.example.clothingapp.clothes.man_cloths.hats.*;

import com.example.clothingapp.clothes.man_cloths.ManCloth;
/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Man extends Person {

    public Man(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight, boolean hasTattoo, String tattooColor) {
        super(firstName, lastName, age, hairColor, eyeColor, height, weight);
        this.hasTattoo = hasTattoo;
        this.tattooColor = tattooColor;
    }

    public Shoes shoes;
    public TopDress topDress;
    public DownDress downDress;
    public Hat hat;
    public boolean hasTattoo = false;
    public String tattooColor;

    @Override public void draw() {
        super.draw();
        if (hasTattoo) {
            System.out.println("\n \nHas Tattoo");
            System.out.println("Tattoo Color: " + this.tattooColor);
        }
        System.out.println("\n \nShoes:");
        if (this.shoes.has) {
            System.out.println("Brand: " + this.shoes.brand);
            System.out.println("Color: " + this.shoes.color);
            System.out.println("Size: " + this.shoes.size);
            System.out.println("Price: " + this.shoes.price);
            System.out.println("Category: " + this.shoes.category);
            System.out.println("Type: " + this.shoes.type);
            System.out.println("Name: " + this.shoes.name);
            System.out.println("Season: " + this.shoes.season);
            System.out.println("Style: " + this.shoes.style);
        } else {
            System.out.println("No Shoes");
        }

        System.out.println("\n \nDown Dress:");
        if (this.downDress.has) {
            System.out.println("Brand: " + this.downDress.brand);
            System.out.println("Color: " + this.downDress.color);
            System.out.println("Size: " + this.downDress.size);
            System.out.println("Price: " + this.downDress.price);
            System.out.println("Category: " + this.downDress.category);
            System.out.println("Type: " + this.downDress.type);
            System.out.println("Name: " + this.downDress.name);
            System.out.println("Fit: " + this.downDress.fit);
        } else {
            System.out.println("No Down Dress");
        }

        System.out.println("\n \nTop Dress:");
        if (this.downDress.has) {
            System.out.println("Brand: " + this.topDress.brand);
            System.out.println("Color: " + this.topDress.color);
            System.out.println("Size: " + this.topDress.size);
            System.out.println("Price: " + this.topDress.price);
            System.out.println("Category: " + this.topDress.category);
            System.out.println("Type: " + this.topDress.type);
            System.out.println("Name: " + this.topDress.name);
            System.out.println("Sleeves: " + this.topDress.sleeveType);
        } else {
            System.out.println("No Down Dress");
        }

        System.out.println("\n \nHat:");
        if (this.hat.has) {
            System.out.println("Brand: " + this.hat.brand);
            System.out.println("Color: " + this.hat.color);
            System.out.println("Size: " + this.hat.size);
            System.out.println("Price: " + this.hat.price);
            System.out.println("Category: " + this.hat.category);
            System.out.println("Type: " + this.hat.type);
            System.out.println("Name: " + this.hat.name);
            System.out.println("Fit: " + this.hat.style);
        } else {
            System.out.println("No Hat");
        }
    }
    public void goOut() {
        if (this.isDressed()) {
            System.out.println("\n \nI look great, going out");
        } else {
            System.out.println("\n \nSorry, Im Naked, Ain't Going Out");
        }

    }

    public boolean isDressed() {
        if (!this.downDress.has || !this.topDress.has || !this.shoes.has) {
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
