package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Restaurant-Config.xml");
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant= applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant1= applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant2= applicationContext.getBean("expressTeaRestaurant",Restaurant.class);
        restaurant2.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant3= applicationContext.getBean("restaurantWithTea",Restaurant.class);
        restaurant3.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant4= applicationContext.getBean("restaurantWithHotTea",Restaurant.class);
        restaurant4.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant5= applicationContext.getBean("restaurantWithBlackTea",Restaurant.class);
        restaurant5.getHotDrink().prepareHotDrink();
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant6= applicationContext.getBean("restaurantWithHotDrink",Restaurant.class);
        System.out.println(restaurant6);
        System.out.println("------------------------------------------------------------");
        Restaurant restaurant7= applicationContext.getBean("restaurantWithHotDrink1",Restaurant.class);
        System.out.println(restaurant7);
        System.out.println("------------------------------------------------------------");

    }

}
