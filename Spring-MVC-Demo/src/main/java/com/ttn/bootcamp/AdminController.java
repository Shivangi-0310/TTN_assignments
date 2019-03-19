package com.ttn.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class AdminController {
    @RequestMapping("/admin")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("adminDisplay.jsp");
        return modelAndView;
    }
}
