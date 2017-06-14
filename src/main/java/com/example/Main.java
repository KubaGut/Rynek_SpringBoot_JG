package com.example;

import com.example.model.Customer;
import com.example.model.Product;
import com.example.model.Shop;
import com.example.repository.ProductRepository;
import com.example.repository.ShopRepository;
import com.example.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private MainService mainService;

    @Autowired
    public Main(MainService mainService) {
        this.mainService = mainService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        Shop shop1 = new Shop("sklep1", "haslo1", "SHOP");
        Shop shop2 = new Shop("sklep2", "haslo2", "SHOP");

        mainService.addShop(shop1);
        mainService.addShop(shop2);
        //Product product1 = new Product("Marchew", 2.2, 3, mainService.findShopByName("sklep1"));
        //Product product2 = new Product("Ziemniaki", 1.3, 3,  mainService.findShopByName("sklep2"));
        //mainService.addProduct(product1);
        //mainService.addProduct(product2);

        //Customer klient1 = new Customer("klien1", "klient1", "USER");
       // Customer klient2 = new Customer("klien2", "klient2", "USER");
        //mainService.addCustomer(klient1);


        //System.out.println(mainService.getProductsList());
        //System.out.println(mainService.getShopsList());
        //System.out.println(mainService.getCustomerList());

    }

}

