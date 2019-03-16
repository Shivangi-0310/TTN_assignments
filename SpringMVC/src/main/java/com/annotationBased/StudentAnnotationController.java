package com.annotationBased;

// Question 3 Use annotation in StudentController to define a
// default action index which renders a jsp page.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAnnotationController {
    @RequestMapping("/")
    ModelAndView index(){
        System.out.println("Student");
        ModelAndView modelAndView =new ModelAndView("Student1");
        return modelAndView;
    }
}
