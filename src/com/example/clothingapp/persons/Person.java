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
    public String shoes;
    public String topDress;
    public String downDress;
    public String hat;
    public Cat cat;
    public Dog dog;

    public void draw() {
        System.out.println("First Name: " + this.firstName + " Last Name: " + this.lastName + " Age: " + this.age);
        System.out.println(this.firstName + " " + this.lastName + " Has " + this.hairColor + " Hairs, " + this.eyeColor + " Eyes.");
        System.out.println(this.firstName + " " + this.lastName + " Height Is " + this.height + ", Weight " + this.weight);
        System.out.println(this.firstName + " " + this.lastName + " Has " + this.cat.name + " Cat, And " + this.dog.name + " Dog");
    }

    public boolean isDressed() {
        if (this.downDress != null && this.topDress != null && this.shoes != null) {
            return true;
        }
        return false;
    }

    public boolean hasPets() {
        if (this.dog != null || this.cat != null) {
            return true;
        }
        return false;
    }

    public boolean goOut() {
        if (isDressed()) {
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
