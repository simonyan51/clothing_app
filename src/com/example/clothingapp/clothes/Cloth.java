package com.example.clothingapp.clothes;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public class Cloth {

    public Cloth(String brand, String color, int size, double price, boolean has) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.has = has;
    }

    public String name;
    public String color;
    public int size;
    public String brand;
    public double price;
    public boolean has;

}
