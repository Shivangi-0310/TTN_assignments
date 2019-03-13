import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

// Question 3 Create a CustomEvent which should get published when you
// invoke connect method of database bean.

public class Database implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    int port;
    String name;

    public Database() {

    } public Database(int port, String name) {
        this.port = port;
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    void connect()
    {
        CustomEvent customEvent= new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("connecting....>>>");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher= applicationEventPublisher;
    }
}
