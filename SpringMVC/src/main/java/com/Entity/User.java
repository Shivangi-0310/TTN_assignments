package com.Entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    String username;
    String lastname;

    public User(String username, String lastname) {
        this.username = username;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
