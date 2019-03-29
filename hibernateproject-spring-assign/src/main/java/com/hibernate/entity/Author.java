package com.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {

    @Id
    @Column(name = "id")
//    Uncomment *Identity or Table* to run Question 9-->
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy =GenerationType.TABLE)
    private Integer id;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "Lastname")
    @Transient
    private String lastname;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Date_of_Birth")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Embedded
    Address address;

//    Uncomment to run Question 1-8
    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
