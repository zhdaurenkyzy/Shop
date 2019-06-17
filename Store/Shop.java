package com.company.Store;

import java.util.ArrayList;

public class Shop {
    Products ball = new Products("ball, 100");
    Products raquet = new Products("ball, 100");
    Products shoes = new Products("ball, 100");
    Products tennis = new Products("ball, 100");

    private ArrayList<Products> productsList = new ArrayList<>();

    {
        productsList.add(ball);
        productsList.add(raquet);
        productsList.add(shoes);
        productsList.add(tennis);

    }

    public Products getProductsList(int i) {
        return productsList.get(i);
    }
}
