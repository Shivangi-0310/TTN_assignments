package com.restspring.restwithspring.controllers;

import com.restspring.restwithspring.entities.Student;
import com.restspring.restwithspring.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController

public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    String getString() {
        return "welcome user";
    }

    //retrieve all students
    @GetMapping("/students")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //retrieve student by id
    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    //save student
    @PostMapping("/students")
    Student saveStudent(Student student) {
        studentService.saveStudent(student);
        return student;
    }

    //delete student by id
    @PostMapping("/students/{id}")
    void deleteStudent(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id);
        studentService.deleteStudent(student);
    }


    //enhanced post request with URI status code
    @PostMapping(value = "/studentpost",headers = "Accept=application/xml")
    ResponseEntity<Student> saveStudent1(@RequestBody Student student) {
        studentService.saveStudent(student);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(student.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }
    


}
