package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController

public class HomeController {

    @GetMapping("/")
    public String index(){
        System.out.println("--------------index method call----------");
        return "index";
    }

   @GetMapping("/login")
    public String login(){
        System.out.println("--------------login method call----------");
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        System.out.println("--------------register method call----------");
        return "register";
    }
}
