package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Main {
    @Autowired
    UserData userData;

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("JDBC-template-config.xml");
        UserData userData = applicationContext.getBean(UserData.class);
        System.out.println("-------------------------------------------------------");
        userData.countUser();
        System.out.println("-------------------------------------------------------");
        System.out.println(userData.getUserName());
        System.out.println("-------------------------------------------------------");

//        User User= new User();
//        User.setUsername("Ankit");
//        User.setPassword("195844");
//        User.setName("ank");
//        User.setAge(19);
//        User.setDob(new Date(1989,05,16));
//        userData.insertUser(User);
        System.out.println("-------------------------------------------------------");

        userData.queryForMapUser();
        System.out.println("-------------------------------------------------------");

        userData.listUser();
        System.out.println("-------------------------------------------------------");

        System.out.println(userData.getUser());
        System.out.println("-------------------------------------------------------");

       userData.hqlDemo();
        System.out.println("-------------------------------------------------------");

    }
}
