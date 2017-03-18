package com.example.clothingapp.pets.dogs;

import com.example.clothingapp.pets.Pet;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Dog extends Pet {
    @Override
    public void noise() {
        super.noise();
        System.out.println("Barking");
    }
}
