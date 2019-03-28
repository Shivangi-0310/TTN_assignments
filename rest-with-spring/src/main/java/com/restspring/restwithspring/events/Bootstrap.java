package com.restspring.restwithspring.events;

import com.restspring.restwithspring.entities.Student;
import com.restspring.restwithspring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Bootstrap {

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        System.out.println("---saving data for student entity---");
        List<Student> students = getStudentList();
        studentRepository.saveAll(students);

    }

    public List<Student> getStudentList() {
        return Arrays.asList(Student.createStudent("aakash", "10th", 23, "Delhi", 99),
                Student.createStudent("samayra", "11th", 23, "Punjab", 91),
                Student.createStudent("yashu", "9th", 20, "Haryana", 90),
                Student.createStudent("ankit", "9th", 19, "Chandigarh", 89),
                Student.createStudent("pushkar", "12th", 17, "Bangaluru", 79),
                Student.createStudent("nisha", "8th", 16, "Guwahati", 87),
                Student.createStudent("chotu", "7th", 11, "Delhi", 98),
                Student.createStudent("navya", "8th", 12, "Delhi", 89));

    }
}
