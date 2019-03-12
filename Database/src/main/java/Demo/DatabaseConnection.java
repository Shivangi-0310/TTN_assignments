package Demo;

public class DatabaseConnection {
    int port;
    String name;

    public DatabaseConnection() {
    }

    public DatabaseConnection(int port, String name) {
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
        return "Demo.DatabaseConnection{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
