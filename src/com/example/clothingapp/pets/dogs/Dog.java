package com.example.clothingapp.pets.dogs;

import com.example.clothingapp.pets.Pet;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Dog extends Pet {

    public Dog(String name, int age, String gender, String color, boolean has) {
        this.type = "Dog";
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.has = has;
    }
}
