package com.hibernate.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class NewAuthor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE)
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
    private Address address;

    @ElementCollection
    private List<String> subjectList;

    //Uncomment for one to one (Question 14) -->
    /*@OneToOne
    @JoinColumn(name = "Book_join_column")
    private Book book;*/

    //Uncomment for one to many (Question 16 unidirectional and bidirectional)
    /*@OneToMany //( unidirectional and bidirectional)
    @JoinTable(joinColumns = @JoinColumn(name="Author_ID")
            ,inverseJoinColumns = @JoinColumn(name = "Book_ID"))
    private Collection<Book> book= new HashSet<>();*/

    //Uncomment for one to many (Question 16 without additional table)

    /*@OneToMany(mappedBy = "author")
    private Collection<Book> book= new HashSet<Book>();*/

    @ManyToMany
    private List<Book> books = new ArrayList<Book>();


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

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    //    uncomment for one to one >>>

   /* public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/


// comment  for one to many unidirectional , bidirectional and without adding additional table>>>
    /*public Collection<Book> getBookList() {
        return book;
    }

    public void setBookList(Collection<Book> vehicle) {
        this.book = vehicle;
    }*/

    @Override
    public String toString() {
        return "NewAuthor{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", subjectList=" + subjectList +
                ", books=" + books +
                '}';
    }
}
