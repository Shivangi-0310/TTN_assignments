package com.restspring.restwithspring.services;

import com.restspring.restwithspring.entities.Student;
import com.restspring.restwithspring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.isPresent() ? studentOptional.get() : null;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }
}
