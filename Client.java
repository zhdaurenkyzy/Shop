package com.company;

import com.company.Store.Products;
import java.util.HashMap;

public class Client {
    private String name;
    private HashMap<Products, Integer> basket = new HashMap<>();

    Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<Products, Integer> getBasket() {
        return basket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getProductsAndCountFromBasket() {
        for (Products products : basket.keySet()) {
            System.out.print(getName()+  "\nТовар: " + products.getNameProduct());
        }
        for (Integer count : basket.values()) {
            System.out.println("\nКоличество: " + count);
        }
    }
}
