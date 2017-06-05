package com.example.model;


import com.google.common.collect.Lists;

import java.util.List;

public class Shop {

    private int id;
    private String name;
    private String password;
    List<Product> shopProductList = Lists.newArrayList();

    public Shop(int id, String name, String passwoed) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getShopProductList() {
        return shopProductList;
    }

    public void setShopProductList(List<Product> shopProductList) {
        this.shopProductList = shopProductList;
    }
}
