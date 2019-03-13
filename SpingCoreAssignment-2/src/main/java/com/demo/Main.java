package com.demo;

import com.demo1.Point;
import com.demo1.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("Restaurant-config.xml");
        Restaurant restaurant = applicationContext.getBean("restaurantWithTea",Restaurant.class);
        restaurant.getHotDrink().prepareDrink();
        Restaurant restaurant1 = applicationContext.getBean("expressTea", Restaurant.class);
        restaurant1.getHotDrink().prepareDrink();
        Triangle triangle = applicationContext.getBean("triangle", Triangle.class);
        System.out.println(triangle);
        applicationContext.registerShutdownHook();
        Triangle triangle2 = (Triangle) applicationContext.getBean("triangle");
        triangle2.show();
    }
}
