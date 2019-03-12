package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Restaurant-config.xml");
        Restaurant restaurant= applicationContext.getBean("restaurant", Restaurant.class);
        restaurant.getHotDrinks().prepareDrinks();

    }
}
