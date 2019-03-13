package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Aop-config.xml");
        Book book= applicationContext.getBean(Book.class);
        Chair chair= applicationContext.getBean(Chair.class);
       System.out.println("-------------------------------------------------------------------------");
        book.printBookDetails();
        System.out.println("-------------------------------------------------------------------------");
        book.setId(1099);
        System.out.println("-------------------------------------------------------------------------");
        book.printBookDetails();
        System.out.println("-------------------------------------------------------------------------");


        System.out.println("-------------------------------------------------------------------------");
        book.getCurrentDiscount();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(chair.statement());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(chair.getNumber());
        System.out.println("-------------------------------------------------------------------------");

        System.out.println(chair.ioException());


    }
}
