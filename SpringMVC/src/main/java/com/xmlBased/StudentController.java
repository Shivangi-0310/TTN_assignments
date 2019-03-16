package com.xmlBased;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 // Question 1. Implement AbstractController in StudentController. create a mapping index.html for it and render
 // index.jsp view from it which displays messages "Hello from index.gsp"
public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Shivangi");
        ModelAndView modelAndView = new ModelAndView("Student1");
        //this Student is a jsp file which is passed as view name in model and view
        //the name of view should be same as view name, jsp file and bean file
        return modelAndView;
    }
}
