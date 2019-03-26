package com.springbootapplication.springboot.controller;
//Question1.

import com.springbootapplication.springboot.entity.Student;
import com.springbootapplication.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Question 1.
//Question 7.
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    //Question 6.
    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("INFO: default page");
        return "Hello World";
    }

    @GetMapping("/getStudentDetails")
    public List<Student> getStudentDetails() {

        logger.info("INFO: get students");
        return studentService.getStudentList();
    }
}
