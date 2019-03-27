package com.springthymeleafproject.springthymeleaf.practicecontroller;

import com.springthymeleafproject.springthymeleaf.practicemodel.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class DemoController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseBody
    public String show() {
        return "hello";
    }

    @RequestMapping(value = "/demoModel", method = RequestMethod.GET)
    public String show(Model model) {
        return "hello";
    }

    @RequestMapping(value = "/modelAtrribute", method = RequestMethod.GET)
    public String assignValue(Model model) {
        model.addAttribute("name", "yashu");
        return "thymeleafFile";
    }

    @RequestMapping(value = "/userAndList")
    public ModelAndView showDetails() {
        List<Integer> digits= Arrays.asList(1,2,3,4,5);
        ModelAndView modelAndView= new ModelAndView("thymeleafFile");
        modelAndView.addObject("digits",digits);
        modelAndView.addObject("user", new User("shivangiJ", 23, "abc@abc.com"));
        return modelAndView;
    }
}
