package com.example.service;


import com.example.model.Customer;
import com.example.model.Order;
import com.example.model.Product;
import com.example.model.Shop;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;
import com.example.repository.ProductRepository;
import com.example.repository.ShopRepository;
import com.google.common.collect.Lists;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    private final ShopRepository shopRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public MainService(ShopRepository shopRepository, ProductRepository productRepository,
                       OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.shopRepository = shopRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    public void addShop(Shop shop){
        shopRepository.save(shop);
    }
    public void deleteShop(Shop shop) {
        shopRepository.delete(shop);
    }
    public Shop findShopByName(String shopName) {
       return shopRepository.findShopByName(shopName);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }
    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
    //public void editProduct(int id) {
     //   shopRepository.editProduct(shopid, quantity,price);
    //}

    public void addCustomer (Customer customer) {
        customerRepository.save(customer);
    }
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
    //public void editCustomer(int id, String name, String password){
     //   shopRepository.editCustomer(id, name, password);
    //}
    public List<Customer> getCustomerList(){
        return (List) customerRepository.findAll();
    }

    public boolean addOrder(Order order) {
        for (Product p : productRepository.findAll()) {
            if (p.getId() == order.getProductId()) {
                if (p.getQuantity() >= order.getQuantity()) {
                    orderRepository.save(order);
                    // edit shop -> product shopRepository.
                    return true;
                } else return false;
            } else return false;
        }
        return true;
    }

    public List<Shop> getShopsList(){
        return (List) shopRepository.findAll();
    }
    public List<Product> getProductsList(){
        return (List) productRepository.findAll();
    }
    public List<Product> getProductListbyName (String productName){
        List<Product> productList = new ArrayList();
        for(Product p : productRepository.findAll()){
                if (p.getName().equals(productName)){
                    productList.add(p);
                }
            }
        return productList;
    }
    public List<Product> getProductListbyShop(int shopId){
        return shopRepository.findOne(shopId).getShopProductList();
    }
    public List<Order> getOrdersListByCustomer(int customerId){
        List<Order> ordersList = new ArrayList();
        for(Order o : orderRepository.findAll()){
            if (o.getCustomer().getId().equals(customerId)){
                ordersList.add(o);
            }
        }
        return ordersList;
    }
    public List<Order> getOrdersListByShop (int shopId){
        List<Order> ordersList = new ArrayList();
        for(Order o : orderRepository.findAll()){
            if (o.getShopId() == (shopId)){
                ordersList.add(o);
            }
        }
        return ordersList;
    }
}
