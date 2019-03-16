package com.annotationBased;
// Question 4. Create one more annotation based action
// hello inside the StudentController which and use
// @ResponseBody annotation from it to display Hello world.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//all static content
//more than one methods in controller
@Controller
@RequestMapping("/stu")
public class StudentMultipleMethods {
    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello";
    }

    @RequestMapping("/bye")
    ModelAndView bye() {
        System.out.println("hii");
        ModelAndView modelAndView = new ModelAndView("Student1");
        return modelAndView;
    }
}
