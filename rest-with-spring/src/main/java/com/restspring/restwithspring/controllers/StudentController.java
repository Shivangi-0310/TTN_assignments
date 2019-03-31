package com.restspring.restwithspring.controllers;

import com.restspring.restwithspring.entities.Student;
import com.restspring.restwithspring.exception.StudentAlreadyExistsException;
import com.restspring.restwithspring.exception.StudentNotFoundException;
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


//    retrieve all students
    @GetMapping("/students")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


//    retrieve student by id
    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            // throwing custom exception
            throw new StudentNotFoundException("student does not exists");
        }
        return student;
    }


//    save student
    @PostMapping("/students")
    Student saveStudent(Student student) {
        studentService.saveStudent(student);
        return student;
    }

//    delete student by id
    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Integer id) throws Exception {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            throw new Exception("all exception handled");
        }
        studentService.deleteStudent(student);
    }


//    enhanced post request with URI status code
    @PostMapping(value = "/studentpost")
    ResponseEntity<Student> saveStudent1(@RequestBody Student student) {
        studentService.saveStudent(student);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(student.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/students/{id}/{name}")
    public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable Integer id, @PathVariable String name) {

        Student student5 = studentService.getStudentById(id);

        if (student5 == null) {
            throw new StudentNotFoundException("student not found");
        }
        student5.setName(name);

        studentService.saveStudent(student5);

        return ResponseEntity.noContent().build();
    }


}
