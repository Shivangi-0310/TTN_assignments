package com.annotationBased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//Question 5. Create one more action which sends Model HelloWorld to the jsp file.
@Controller
@RequestMapping("/country")
public class Country {
    @RequestMapping("/dynamic")
    ModelAndView index(){
        System.out.println("dcgdcg");
        ModelAndView modelAndView =new ModelAndView("country");
        modelAndView.addObject("msg", "hello world");
        return modelAndView;
    }
}
