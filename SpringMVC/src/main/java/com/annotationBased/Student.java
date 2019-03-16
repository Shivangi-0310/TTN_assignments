package com.annotationBased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
 // Question 6.Use @PathVariable annotation to access firstname and lastname in an action inside StudentController
 // place both the parameters in different arguments and access them.
 //  Question 7. Now place both the arguments inside a Map and access the Map instead.
 // (Hint : check the slide for @PathVariable action returnCountryAndState  shows how to do it with map)

@Controller
@RequestMapping("/studentController")
public class Student {
    @RequestMapping("/student/{firstname}/{lastname}")
    @ResponseBody
    String returnStudentFirstName(@PathVariable("firstname") String firstName,@PathVariable("lastname") String lastname ) {
        return firstName+" "+lastname;
    }
    @RequestMapping("/studentname/{firstname}/{lastname}")
    @ResponseBody
    String returnStudentFirstNameAndLastName(@PathVariable Map<String,String> map)
    {
      return map.get("firstname")+" "+map.get("lastname");
    }
}
