package com.thymeleafdemo.springthymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;

@Controller
public class HomeController {
    @RequestMapping("/th/home")
    public String getHelloPage(Model model) {
        
        return "First";
    }


}
