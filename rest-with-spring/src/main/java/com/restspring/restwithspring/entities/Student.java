package com.restspring.restwithspring.entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
// uncomment for static filtering--->
//@JsonIgnoreProperties(value = {"id"})


// uncomment to run Question 6 dynamic filtering
//@JsonFilter("myFilter")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Size(min = 4, message = "name should have atleast 4 characters")
    private String name;

    private String standard;

    private Integer age;

    private String city;

    private Integer percentage;

    public Student() {
    }

    public Student(@Size(min = 4, message = "name should have atleast 4 characters") String name, String standard,
                   Integer age, String city, Integer percentage) {
        this.name = name;
        this.standard = standard;
        this.age = age;
        this.city = city;
        this.percentage = percentage;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public static Student createStudent(String name, String standard, Integer age, String city, Integer percentage) {
        Student student = new Student();
        student.setName(name);
        student.setStandard(standard);
        student.setAge(age);
        student.setCity(city);
        student.setPercentage(percentage);
        return student;
    }
}
