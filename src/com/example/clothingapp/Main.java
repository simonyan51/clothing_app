package com.example.clothingapp;

import com.example.clothingapp.clothes.man_cloths.ManCloth;
import com.example.clothingapp.persons.Man;
import com.example.clothingapp.pets.Pet;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Man bob = new Man();
        bob.setFirstName("Bob");
        bob.setLastName("Smith");
        bob.setAge(18);
        bob.setWeight(69);
        bob.setHeight(180);
        bob.setHairColor("Blonde");
        bob.setEyeColor("Blue");
        bob.setCat(new Cat("Oliver"));
        bob.setDog(new Dog("Sharik"));
        bob.hasTattoo = true;
        bob.tattoColor("Black");
        ManCloth cloths = new ManCloth();
        bob.draw();
    }
}
