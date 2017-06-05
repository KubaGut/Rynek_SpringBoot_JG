package com.example.model;

/**
 * Created by Gutek on 2017-06-04.
 */
public class Order {

    private int customerId;
    private Product product;

    public Order(int customerId, Product product) {
        this.customerId = customerId;
        this.product = product;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(int customerId) {
        this.customerId = customerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
