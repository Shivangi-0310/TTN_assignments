package com.springthymeleafproject.springthymeleaf.practicemodel;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    @NotNull
    private String email;

    public User(@NotNull String name, @NotNull Integer age, @NotNull String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
