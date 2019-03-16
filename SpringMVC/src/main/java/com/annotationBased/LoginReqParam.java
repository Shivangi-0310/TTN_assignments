package com.annotationBased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
// Qiestion 8. Use @RequestParam annotation to access the
// firstname and lastname in formData action of StudentController.
@Controller
@RequestMapping("/student")
public class LoginReqParam {
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.GET)
    ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("submitForm");
        return modelAndView;
    }
    @RequestMapping(value = "/student.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("username") String username, @RequestParam("lastname") String lastname )
    {
        return "username "+ username+" lastname "+lastname;
    }
}
