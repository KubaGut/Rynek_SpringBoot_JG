package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class home {

    @GetMapping()
    public String home(){
        return "home";
    }


    @GetMapping("/shoplist")
    public String shoplist(){
        return "shoplist";
    }
    @GetMapping("/findproducts")
    public String findproducts(){
        return "findproducts";
    }
    @GetMapping("/shops")
    public String shopsLogin(){
        return "shopsLogin";
    }
    @GetMapping("/orders")
    public String ordersLogin(){
        return "ordersLogin";
    }

}
