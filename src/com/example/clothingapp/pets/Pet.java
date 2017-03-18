package com.example.clothingapp.pets;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Pet {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;
    public void noise() {
        System.out.print(this.name + " is ");
    }
}
