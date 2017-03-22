package com.example.clothingapp.clothes;

/**
 * Created by simonyan_51 on 18.03.2017.
 */
public abstract class Cloth {

    protected Cloth(String brand, String color, int size, double price, boolean has) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.has = has;
    }

    private String name;
    private String color;
    private int size;
    private String brand;
    private double price;
    private boolean has;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHas() {
        return has;
    }

    public void setHas(boolean has) {
        this.has = has;
    }
}
