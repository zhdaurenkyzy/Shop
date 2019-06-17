package com.company.Store;

public class Products {

    private String nameProduct;
    private double price;

    Products(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    protected Products(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    
    public double getPrice() {
        return price;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
