package com.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private Integer streetNo;

    private String Location;

    private String state;

    public Integer getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(Integer streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNo=" + streetNo +
                ", Location='" + Location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
