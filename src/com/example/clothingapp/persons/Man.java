package com.example.clothingapp.persons;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Man extends Person {
    public boolean hasTattoo;
    public String tattoColor(String str) {
        if (this.hasTattoo) {
            return this.firstName + " " + this.lastName + "'s tattoo Color is " + str;
        } else {
            return this.firstName + " " + this.lastName + " Don't Have Tattoo";
        }
    }
}
