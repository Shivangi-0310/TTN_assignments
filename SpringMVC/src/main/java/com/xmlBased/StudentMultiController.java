package com.xmlBased;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// Question 2.  Now remove AbstractController and useMultiActionController for
// StudentController which contains 2 actions one action renders a jsp view and another action uses
// HttpServletResponse to show the output on the Web browser.

public class StudentMultiController extends MultiActionController {
    public ModelAndView studentDetails(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Student Details");
        ModelAndView modelAndView = new ModelAndView("studentJsp");
        //this employee is a jsp file which is passed as view name in model and view
        //the name of view should be same as view name, jsp file and bean file
        return modelAndView;
    }

    public void studentValues(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("student value");
        response.setContentType("text/html");
        response.getWriter().println("<b>student details</b>");

    }

}
