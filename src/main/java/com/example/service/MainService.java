package com.example.service;


import com.example.model.Customer;
import com.example.model.Order;
import com.example.model.Product;
import com.example.model.Shop;
import com.example.repository.ShopRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private final ShopRepository shopRepository;

    @Autowired
    public MainService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public void addShop(Shop shop){
        shopRepository.addShop(shop);
    }

    public void deleteShop(Shop shop){
        shopRepository.deleteShop(shop);
    }
    public void editShop(int id, String name, String password ) {
        shopRepository.editShop(id, name, password );
    }
    public void addProduct(Product product){
        shopRepository.addProduct(product);
    }
    public void deleteProduct(Product product){
        shopRepository.deleteProduct(product);
    }

    public void editProduct(int shopid, int quantity, float price) {
        shopRepository.editProduct(shopid, quantity,price);
    }
    public void addCustomer (Customer customer) {
        shopRepository.addCustomer(customer);
    }
    public void editCustomer(int id, String name, String password){
        shopRepository.editCustomer(id, name, password);
    }
    public boolean addOrder(Order order){
        for (Shop s : shopRepository.getListOfShops() ) {
            if (order.getProduct().getShopId() == s.getId()) {
                for (Product p : s.getShopProductList()) {
                    if (order.getProduct().getName().equals(p.getName())) {
                        if (order.getProduct().getQuantity() <= p.getQuantity()) {
                            shopRepository.addOrder(order);
                            return true;
                        }
                        else return false;
                    }
                    else return false;
                }
            }
            else return false;
        }
        return true;
    }
    public List<Shop> getShopsList(){
        return shopRepository.getListOfShops();
    }
    public List<Product> getProductsList(){
        return shopRepository.getListOfProducts();
    }
    public List<Product> getProductListbyId(String productName){
        List<Product> listOfProductByID = Lists.newArrayList();;
        for(Product p:  shopRepository.getListOfProducts()){
                if (productName.equals(p.getName())){
                    listOfProductByID.add(p);
                }
        }
        return listOfProductByID;
    }
    public List<Product> getProductListbyShop(int shopId){
        List<Product> listOfProductByShop = Lists.newArrayList();
        for(Product p:  shopRepository.getListOfProducts()){
            if (shopId == p.getShopId()){
                listOfProductByShop.add(p);
            }
        }
        return listOfProductByShop;
    }
    public List<Order> getOrdersListByCustomer(int customerId){
        List<Order> listOfOrdersByCustomer = Lists.newArrayList();;
        for(Order o : shopRepository.getListOfOrders()){
            if(customerId == o.getCustomerId()) {
                listOfOrdersByCustomer.add(o);
            }
        }

        return listOfOrdersByCustomer;
    }
    public List<Order> getOrdersListByShop (int shopId){
        List<Order> listOfOrdersByShop = Lists.newArrayList();;
        for(Order o : shopRepository.getListOfOrders()){
            if(shopId == o.getProduct().getShopId()) {
                listOfOrdersByShop.add(o);
            }
        }
        return listOfOrdersByShop;
    }
}
