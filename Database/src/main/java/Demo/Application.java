package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringDatabase-Config.xml");
        System.out.println(applicationContext.getBean(DatabaseConnection.class));
        //System.out.println(applicationContext.getBean("database2"));

    }
}
