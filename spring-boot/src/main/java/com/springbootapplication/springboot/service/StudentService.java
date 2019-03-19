package com.springbootapplication.springboot.service;
//Question1.

import com.springbootapplication.springboot.entity.Student;
import com.springbootapplication.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentList() {
        return Arrays.asList(new Student(101, "Aakash"),
                new Student(102, "yashu"));
    }

}
