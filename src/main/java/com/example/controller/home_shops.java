package com.example.controller;

import com.example.model.Product;
import com.example.model.Shop;
import com.example.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("/home/shops")
public class home_shops {

    private final MainService mainService;

    @Autowired
    public home_shops(MainService mainService) {
        this.mainService = mainService;
    }

  /*  @PostMapping("/login")
    public String addShop(@RequestParam("Login") String login, @RequestParam("Password") String password, Map<String, Object> model) {
        Shop shop = new Shop(0, login, password);
        mainService.addShop(shop);
        model.put("shop",mainService.getShopsList().get(0));
        return "shops";
    }
  /*  @PostMapping("/addproduct")
    public String addProduct(@RequestParam("name") String name, @RequestParam("price") String price,
                             @RequestParam("quantity") String quantity) {
        Product product = new Product(name, Float.parseFloat(price), Integer.parseInt(quantity), ${shop.id})
        mainService.addProduct(product);
        return "shops";
    }
*/
}
