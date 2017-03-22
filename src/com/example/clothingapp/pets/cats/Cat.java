package com.example.clothingapp.pets.cats;

import com.example.clothingapp.pets.Pet;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Cat extends Pet {
    public Cat(String name, int age, String gender, String color, boolean has) {
        this.setType("Cat");
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setColor(color);
        this.setHas(has);
    }

}
