package com.example.clothingapp.shop;

import com.example.clothingapp.clothes.Cloth;
import com.example.clothingapp.clothes.man_cloths.downDress.Jeans;
import com.example.clothingapp.clothes.man_cloths.hats.Cap;
import com.example.clothingapp.clothes.man_cloths.topDress.TShirt;
import com.example.clothingapp.clothes.woman_cloths.downDress.Pants;
import com.example.clothingapp.clothes.woman_cloths.topDress.Shirt;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public class Shop {
    public Shop() {
        this.cloths[0] = new Shirt("D&G","White", 16, 23000.56, false, "Long Sleeve");
        this.cloths[1] = new TShirt("Billionaire", "Black", 18, 26853.3, false, "Short Sleeve");
        this.cloths[2] = new Pants("Armani", "Brown", 28, 35685.95, false, "Skinny");
        this.cloths[3] = new Jeans("Billionaire", "Blue", 30, 26850.3, false, "Slim");
        this.cloths[4] = new Cap("Polo", "Black", 15, 13050.8, false, "Snap Back");
        this.countPrice(this.cloths);
    }

    private double totalPrice;
    private Cloth[] cloths = new Cloth[5];

    private void countPrice(Cloth[] cloths) {
        for (Cloth cloth : cloths) {
            this.totalPrice += cloth.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
