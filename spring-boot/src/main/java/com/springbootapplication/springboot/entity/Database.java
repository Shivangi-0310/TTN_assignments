package com.springbootapplication.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Question 4.
@Component
public class Database {
    @Value("${app.port}")
    Integer port;

    @Value("${app.name}")
    String name;

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
}
