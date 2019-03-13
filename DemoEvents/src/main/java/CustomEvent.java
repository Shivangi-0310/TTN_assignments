import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    CustomEvent(Object object)
    {
        super(object);
    }
}
