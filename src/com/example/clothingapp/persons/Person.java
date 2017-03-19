package com.example.clothingapp.persons;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.pets.cats.Cat;
import com.example.clothingapp.pets.dogs.Dog;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public String hairColor;
    public String eyeColor;
    public int height;
    public int weight;
    public Cat cat;
    public Dog dog;

    public Person(String firstName, String lastName, int age, String hairColor, String eyeColor, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    public void draw() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Hair Color: " + this.hairColor);
        System.out.println("Eye Color: " + this.eyeColor);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);


        if (dog.has) {
            System.out.println("\n \nDog:");
            System.out.println("Type: " + this.dog.type);
            System.out.println("Name: " + this.dog.name);
            System.out.println("Age: " + this.dog.age);
            System.out.println("Gender: " + this.dog.gender);
            System.out.println("Color: " + this.dog.color);
        } else {
            System.out.println("\n \nDon't Have Dog");
        }
        if (cat.has) {
            System.out.println("\n \nCat:");
            System.out.println("Type: " + this.cat.type);
            System.out.println("Name: " + this.cat.name);
            System.out.println("Age: " + this.cat.age);
            System.out.println("Gender: " + this.cat.gender);
            System.out.println("Color: " + this.cat.color);
        } else {
            System.out.println("\n \nDon't Have Cat");
        }
    }


    public boolean hasPets() {
        if (this.dog != null || this.cat != null) {
            return true;
        }
        return false;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
