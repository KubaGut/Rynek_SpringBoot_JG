package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int shopId;
    private int productId;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
    }

    public Order(Integer shopId, Integer productId, Integer quantity, Customer customer) {
        this.shopId = shopId;
        this.productId = productId;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", shopId=" + shopId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (shopId != order.shopId) return false;
        if (productId != order.productId) return false;
        if (quantity != order.quantity) return false;
        if (!id.equals(order.id)) return false;
        return customer.equals(order.customer);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + shopId;
        result = 31 * result + productId;
        result = 31 * result + quantity;
        result = 31 * result + customer.hashCode();
        return result;
    }

}
