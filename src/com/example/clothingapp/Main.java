package com.example.clothingapp;

import com.example.clothingapp.clothes.man_cloths.downDress.DownDress;
import com.example.clothingapp.clothes.man_cloths.hats.Hat;
import com.example.clothingapp.clothes.man_cloths.shoes.Shoes;
import com.example.clothingapp.clothes.man_cloths.shoes.Sneakers;
import com.example.clothingapp.clothes.man_cloths.topDress.TopDress;
import com.example.clothingapp.clothes.man_cloths.topDress.*;
import com.example.clothingapp.clothes.man_cloths.downDress.*;
import com.example.clothingapp.clothes.man_cloths.hats.*;
import com.example.clothingapp.clothes.woman_cloths.topDress.*;
import com.example.clothingapp.clothes.woman_cloths.downDress.*;
import com.example.clothingapp.clothes.woman_cloths.shoes.*;
import com.example.clothingapp.clothes.woman_cloths.hats.*;

import com.example.clothingapp.persons.Man;
import com.example.clothingapp.persons.Woman;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

/**
 * Created by simonyan_51 on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Man man1 = new Man(
                "Gnel",
                "Simonyan",
                18,
                "Blonde",
                "Blue",
                180,
                69,
                true,
                "Black"
        );
        com.example.clothingapp.clothes.man_cloths.shoes.Shoes shoes = new Sneakers(
                "Nike",
                "White",
                43,
                25000.00,
                true,
                "Summer",
                "Casual"
        );
        com.example.clothingapp.clothes.man_cloths.topDress.TopDress topDress = new TShirt(
                "Billionaire",
                "Black",
                34,
                20000.00,
                true,
                "Short Sleeve"
        );

        com.example.clothingapp.clothes.man_cloths.downDress.DownDress jeans = new Jeans(
                "Billionaire",
                "Black",
                28,
                23500.00,
                true,
                "Skinny Fit"
        );

        com.example.clothingapp.clothes.man_cloths.hats.Hat cap = new Cap(
                "New York",
                "Black",
                15,
                8000.00,
                false,
                "Snap Back"
        );

        Cat cat = new Cat(
                "Oliver",
                3,
                "Female",
                "White",
                false
        );

        Dog dog = new Dog(
                "Sharik",
                3,
                "Female",
                "White",
                true
        );

        man1.setShoes(shoes);
        man1.setDownDress(jeans);
        man1.setTopDress(topDress);
        man1.setHat(cap);
        man1.setDog(dog);
        man1.setCat(cat);
        man1.draw();
        man1.goOut();

        Woman woman1 = new Woman(
                "Anonymous",
                "Grigoryan",
                18,
                "Black",
                "Dark Brown",
                165,
                50,
                false,
                "Black",
                false
        );

        com.example.clothingapp.clothes.woman_cloths.downDress.DownDress pants = new Pants(
                "Pull & Bear",
                "Black",
                25,
                25000.00,
                true,
                "Skinny Fit"
        );
        com.example.clothingapp.clothes.woman_cloths.topDress.TopDress shirt = new Shirt(
                "Tommy Hillfigger",
                "Blue",
                19,
                35000.00,
                true,
                "Long Sleeve"
        );

        com.example.clothingapp.clothes.woman_cloths.hats.Fedora fedora = new Fedora(
                "D&G",
                "Black",
                13,
                65000.00,
                true,
                "Fedora"
        );

        Cabloo cabloo = new Cabloo(
                "Pull & Bear",
                "White",
                38,
                35000.00,
                true,
                "Summer",
                "Classic"
        );

        woman1.setDog(dog);
        woman1.setCat(cat);
        woman1.setDownDress(pants);
        woman1.setHat(fedora);
        woman1.setTopDress(shirt);
        woman1.setShoes(cabloo);
        woman1.draw();
        woman1.goOut();
    }
}
