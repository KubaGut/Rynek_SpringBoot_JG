package com.example.model;


public class Product {

    private String name;
    private float price;
    private int quantity;
    private int shopId;

    public Product(String name, float price, int quantity, int shopId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}
