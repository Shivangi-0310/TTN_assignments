package com.thymeleafdemo.springthymeleafdemo.controller;


import com.thymeleafdemo.springthymeleafdemo.model.Employee;
import com.thymeleafdemo.springthymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {

    private final EmployeeService employeeService;

    @Autowired
    public HomeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/th/home")
    public String getHelloPage(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employeeTable", employeeService.getEmployeeList());
        return "First";
    }

    @RequestMapping(value = "/th/save-employee", method = RequestMethod.POST)
    public String getEmployeeDetails(@ModelAttribute("employee") Employee emp) {

        System.out.println(emp);
        return "redirect:/th/home";
    }


}
