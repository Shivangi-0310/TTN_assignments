package com.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name = "Book_Name")
    private String bookName;


//    Uncomment for many to one

    /*@ManyToOne
    NewAuthor author;
*/

    @ManyToMany(mappedBy = "books")
    List<NewAuthor> newAuthors = new ArrayList<>();


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    uncomment for many to one
    /*public NewAuthor getAuthor() {
        return author;
    }

    public void setAuthor(NewAuthor author) {
        this.author = author;
    }*/


    public List<NewAuthor> getNewAuthors() {
        return newAuthors;
    }

    public void setNewAuthors(List<NewAuthor> newAuthors) {
        this.newAuthors = newAuthors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", newAuthors=" + newAuthors +
                '}';
    }
}
