package com.annotationBased;

import com.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 // Question 9. Create a StudentCO and bind firstname and lastname with instance variable of StudentCO.
@Controller
@RequestMapping("studentCO")
public class StudentCO {
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.GET)
    ModelAndView studentDetails()
    {
        ModelAndView modelAndView= new ModelAndView("submitForm");
        return modelAndView;
    }
    @RequestMapping(value = "/student.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(User user){
        return "username : "+user.getUsername()+ " lastname : "+user.getLastname();
    }

    
}
