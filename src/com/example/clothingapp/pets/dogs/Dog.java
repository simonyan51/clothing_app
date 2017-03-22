package com.example.clothingapp.pets.dogs;

import com.example.clothingapp.pets.Pet;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Dog extends Pet {

    public Dog(String name, int age, String gender, String color, boolean has) {
        this.setType("Dog");
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setColor(color);
        this.setHas(has);
    }
}
