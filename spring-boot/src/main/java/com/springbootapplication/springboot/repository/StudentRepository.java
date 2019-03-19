package com.springbootapplication.springboot.repository;


import com.springbootapplication.springboot.entity.Student;
import org.springframework.data.repository.CrudRepository;

//Question 7.
public interface StudentRepository extends CrudRepository<Student, Integer> {
}