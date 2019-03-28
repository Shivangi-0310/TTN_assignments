package com.thymeleafdemo.springthymeleafdemo.controller;


import com.thymeleafdemo.springthymeleafdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HomeController {



    @RequestMapping("/th/home")
    public String getHelloPage(Model model) {
        model.addAttribute("employee", new Employee());
        return "First";
    }

    @RequestMapping(value = "/th/save-employee", method = RequestMethod.POST)
    public String getEmployeeDetails(@ModelAttribute("employee") Employee emp) {

        System.out.println(emp);
        return "redirect:/th/home";
    }


}
