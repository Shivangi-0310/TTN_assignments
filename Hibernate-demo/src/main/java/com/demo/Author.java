package com.demo;

import javax.persistence.*;
import java.util.*;

// Question 1. Create a class com.demo.Author with instance variables firstName, lastName and age.
// Question 2. Perform CRUD operation for Author class.
// Question 3. Use hbm2ddl create to introduce Date of Birth for Author.
// Question 4. Use hbm2dll update to insert at least 4 records for Author.
//Question 5. Perform hbm2dll create-drop by closing session factory.
//Question 6. Rename all the fields using column annotation.
//Question 7. Mark lastName as @Transient.
//Question 8. Use @Temporal for date of birth of Author.
//Question 9.Generate Id for Author Using IDENTITY and TABLE strategy.
// Question 10. Create a class Address for Author with instance
// variables streetNumber, location, State.
//Question 11. Create instance variable of Address class inside Author
// class and save it as embedded object.
//Question 12. Introduce a List of subjects for author.
//Question 13. Persist 3 subjects for each author.
//Question 14. Create an Entity book with an instance variable bookName.
//Question 15. Implement One to One mapping between Author and Book.
//Question 16. Implement One to Many Mapping between Author and Book(Unidirectional,
// BiDirectional and without additional table ) and  implement cascade save.
//Question 17. Implement Many to Many Mapping between Author and Book.


@Entity
public class Author {
    @Column(name = "Author_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@GeneratedValue(strategy = GenerationType.TABLE)
            Integer id;
    @Column(name = "Author_firstname")
    String firstname;
    @Transient
    String lastname;
    @Column(name = "Author_age")
    Integer age;
    @Column(name = "Author_dob")
    @Temporal(TemporalType.DATE)
    Date dob;
    @Embedded
    Address address;
    @ElementCollection
    Set<String> subjects = new HashSet<String>();

//    @OneToOne
//    @JoinColumn(name = "Book_join_column")
//    Book book;

//    @OneToMany //unidirectional and bidirectional
//    @JoinTable(joinColumns = @JoinColumn(name="Author_id")
//            ,inverseJoinColumns = @JoinColumn(name = "Book_ID"))
//    @OneToMany(mappedBy = "author")  // without additional table
//    Set<Book> book= new HashSet<>();

    @ManyToMany
    List<Book> book = new ArrayList<>();
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Novel> novels = new ArrayList<>();


    public Author() {
    }

    public Author(String firstname, String lastname, Integer age, Date dob, Address address,
                  Set<String> subjects, List<Book> book, List<Novel> novels) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.subjects = subjects;
        this.book = book;
        this.novels = novels;
    }
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

//    public Set<Book> getBook() {
//        return book;
//    }
//
//    public void setBook(Set<Book> book) {
//        this.book = book;
//    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }


    public List<Book> getBookName1() {
        return book;
    }

    public void setBookName1(List<Book> book) {
        this.book = book;
    }

    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
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
                ", subjects=" + subjects +
                ", book=" + book +
                ", novels=" + novels +
                '}';
    }
}
