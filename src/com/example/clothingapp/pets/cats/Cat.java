package com.example.clothingapp.pets.cats;

import com.example.clothingapp.pets.Pet;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Cat extends Pet {
    @Override
    public void noise() {
        super.noise();
        System.out.println("Meowing");
    }
}
