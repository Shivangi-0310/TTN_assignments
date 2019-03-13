package events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmployeeEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println( "employee Event triggered>>>>> "+ event);

    }
}
