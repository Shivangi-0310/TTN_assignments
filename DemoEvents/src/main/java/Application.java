import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("SpringAOP-config.xml");
        ctx.start();
        Database database = ctx.getBean("database", Database.class);
        database.connect();
        ctx.stop();
        ctx.start();
        ctx.close();


    }
}
