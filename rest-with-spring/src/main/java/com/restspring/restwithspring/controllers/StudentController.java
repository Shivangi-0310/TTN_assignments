package com.restspring.restwithspring.controllers;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restspring.restwithspring.entities.Student;
import com.restspring.restwithspring.entities.StudentV1;
import com.restspring.restwithspring.entities.StudentV2;
import com.restspring.restwithspring.exception.StudentAlreadyExistsException;
import com.restspring.restwithspring.exception.StudentNotFoundException;
import com.restspring.restwithspring.services.StudentService;
import com.restspring.restwithspring.version.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;

@RestController

public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    String getString(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("hello world ");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("nice.day.message", null, locale);
    }

    @GetMapping("/i18")
    String helloWorld() {
        return messageSource.getMessage("nice.day.message", null, LocaleContextHolder.getLocale());
    }


    @GetMapping("/studentfilters")
    MappingJacksonValue getStudent() {
        Iterable<Student> student = studentService.findAll();
        SimpleBeanPropertyFilter simpleBeanPropertyFilter =
                SimpleBeanPropertyFilter.filterOutAllExcept("name", "standard", "age", "city", "percentage");

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("myFilter", simpleBeanPropertyFilter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(student);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
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
    @PostMapping(value = "/studentposts")
    ResponseEntity<Student> saveStudent1(@Valid @RequestBody Student student) {
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


    //URI versioning
    @GetMapping("/students/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("aakash");
    }

    @GetMapping("/students/V2")
    StudentV2 getStudentV2() {
        return new StudentV2(new Name("aakash", "sharma"));
    }

    //    parameter versioning
    @GetMapping(value = "/students/param", params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("aakash");
    }

    @GetMapping(value = "/students/param", params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2(new Name("aakash", "sharma"));
    }

    //header versioning

    @GetMapping(value = "/students/header", headers = "API-VERSION=1")
    StudentV1 getPersonHeader1() {
        return new StudentV1("aakash");
    }

    @GetMapping(value = "/students/header", headers = "API-VERSION=2")
    StudentV2 getPersonHeader2() {
        return new StudentV2(new Name("aakash", "sharma"));
    }

}
