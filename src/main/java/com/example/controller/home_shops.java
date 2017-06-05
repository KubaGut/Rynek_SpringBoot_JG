package com.example.controller;

import com.example.model.Shop;
import com.example.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/home")
public class home_shops {

    private final MainService mainService;

    @Autowired
    public home_shops(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/shops/login")
    public String addShop(@RequestParam("Login") String login, @RequestParam("Password") String password, RedirectAttributes redirectAttributes) {
        //Shop shop = new Shop(0, login, password);
        //mainService.addShop(shop);
        //redirectAttributes.addAttribute("shop", shop);
        return "shops";
    }

}
