package com.example.thymeleaf.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name", "Thymeleaf");
        return "home";  //return home.html
    }

    /*
     * Conditional Statement
     * Elvis operator ?:
     * If unless
     * Switch case
     */

    @GetMapping("/elvis")
    public String elvisExample(Model model) {
        model.addAttribute("isAdmin", false);
        model.addAttribute("gender","F");
        return "elvis";
    }

    @GetMapping("/each")
    public String eachExample(Model model){
        List<String> stringList = List.of("First", "Second", "Third");
        model.addAttribute("list", stringList);
        return "each";
    }

}
