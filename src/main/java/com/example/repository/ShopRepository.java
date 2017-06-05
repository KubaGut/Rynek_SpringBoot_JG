package com.example.repository;


import com.example.model.Customer;
import com.example.model.Order;
import com.example.model.Product;
import com.example.model.Shop;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShopRepository {

    private List<Shop> listOfShops = Lists.newArrayList();
    private List<Product> listOfProducts = Lists.newArrayList();
    private List<Order> listOfOrders = Lists.newArrayList();
    private List<Customer> listOfCustomers = Lists.newArrayList();

    public void addShop(Shop shop){
        listOfShops.add(shop);
    }
    public void deleteShop(Shop shop){
        listOfShops.remove(shop);
        for(Product p : listOfProducts){
            if (p.getShopId() == shop.getId()) {
                listOfProducts.remove(p);
            }
        }
    }
    public void editShop(int id, String name, String password ) {
        for (Shop s : listOfShops) {
            if(s.getId() == id) {
                s.setName(name);
                s.setPassword(password);
            }
        }
    }
    public void addProduct(Product product){
        listOfProducts.add(product);
    }
    public void deleteProduct(Product product){
        listOfProducts.remove(product);
    }
    public void editProduct(int shopid, int quantity, float price) {
        for (Product p : listOfProducts){
            if(shopid == p.getShopId()){
                p.setPrice(price);
                p.setQuantity(quantity);
            }
        }
    }
    public void addCustomer (Customer customer) {
        listOfCustomers.add(customer);
    }
    public void editCustomer(int id, String name, String password){
        for (Customer c: listOfCustomers){
            if(c.getId() == id){
                c.setName(name);
                c.setPassword(password);
            }
        }
    }
    public void addOrder(Order order){
        listOfOrders.add(order);
    }

    public List<Shop> getListOfShops() {
        return listOfShops;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public List<Order> getListOfOrders() {
        return listOfOrders;
    }

    public List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }
}
