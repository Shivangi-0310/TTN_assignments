package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        ADDRESS CLASS>>>>>>>>>>>>
        Address address1 = new Address();
        address1.setStreetNo(10);
        address1.setLocation("Park Street");
        address1.setState("Seattle");
        Address address2 = new Address();
        address2.setStreetNo(30);
        address2.setLocation("St. Stephen Road");
        address2.setState("New York");
//   --------------------------------------

//        SET OF SUBJECTS>>>>>>>>>>>>>
        Set<String> subjects = new HashSet<>();
        subjects.add("Literature");
        subjects.add("Fiction");
        subjects.add("Biography");
//        ---------------------------------
//      BOOK CLASS ENTITY>>>>>>>>>>>>>
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        book.setBookName("Geetanjali");
        book1.setBookName("Macbeth");
        book2.setBookName("The Game of Logic");
        book3.setBookName("A Tramp Abroad");
        book4.setBookName("Little Dorrit");
        book5.setBookName("Death on the Nile");
        book6.setBookName("Othello");
        book7.setBookName("Alice in Wonderland");
//  -----------------------------------------

//      AUTHOR CLASS ENTITY>>>>>>>>>>>>>

        Author author = new Author();
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();
        Author author4 = new Author();
        Author author5 = new Author();
//   ---------------------------------------
//        cascading
        Novel novel = new Novel();
        novel.setName("novel1");
        Novel novel1 = new Novel();
        novel.setName("novel2");


//   ---------------------------------------
//        bidirectonal one to may
//        book6.setAuthor(author1);
//        book7.setAuthor(author1);
//        book2.setAuthor(author3);
//        book5.setAuthor(author4);
//        book1.setAuthor(author5);


//   --------------------------------------
//      author.setId(1);
        author.setFirstname("Ravindranath");
        author.setLastname("Tagore");
        author.setDob(new Date(19951209));
        author.setAge(23);
        author.setAddress(address1);
        author.setSubjects(subjects);
//        author.setBook(book);
//        author.getBook().add(book);
        author.getBookName1().add(book1);
        author.getBookName1().add(book2);
        author.getBookName1().add(book3);
        author.getNovels().add(novel);
        author.getNovels().add(novel1);

//  ---------------------------------------

//      author1.setId(2);
        author1.setFirstname("William");
        author1.setLastname("Shakespeare");
        author1.setDob(new Date(19941209));
        author1.setAge(24);
        author1.setAddress(address1);
        author1.setSubjects(subjects);
//      author1.setBook(book1);
        author1.getBookName1().add(book3);
        author1.getBookName1().add(book4);
        author1.getBookName1().add(book3);
        author1.getBookName1().add(book7);


//  --------------------------------------

//      author2.setId(3);
        author2.setFirstname("Lewis");
        author2.setLastname("Caroll");
        author2.setDob(new Date(19930902));
        author2.setAge(25);
        author2.setAddress(address1);
        author2.setSubjects(subjects);
//      author2.setBook(book2);
        author2.getBookName1().add(book3);
        author2.getBookName1().add(book2);


//   ------------------------------------

//      author3.setId(4);
        author3.setFirstname("Mark");
        author3.setLastname("Twain");
        author3.setDob(new Date(19921201));
        author3.setAge(26);
        author3.setAddress(address2);
        author3.setSubjects(subjects);
//      author3.setBook(book3);
//      author3.getBook().add(book2);
        author3.getBookName1().add(book4);
        author3.getBookName1().add(book3);


//        -------------------------------
//      author4.setId(5);
        author4.setFirstname("Charles");
        author4.setLastname("Dickens");
        author4.setDob(new Date(19911202));
        author4.setAge(27);
        author4.setAddress(address2);
        author4.setSubjects(subjects);
//      author4.setBook(book4);
//      author4.getBook().add(book1);
        author4.getBookName1().add(book5);
//      author4.getBook().add(book);

//   --------------------------------------


//      author5.setId(6);
        author5.setFirstname("Agatha");
        author5.setLastname("Christie");
        author5.setDob(new Date(19900709));
        author5.setAge(28);
        author5.setAddress(address2);
        author5.setSubjects(subjects);
//      author5.setBook(book5);
//        author5.getBook().add(book2);
        author5.getBookName1().add(book1);


//  ---------------------------------------

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//      create operation
        session.save(author);
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author4);
        session.save(author5);
        session.save(book);
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(book5);
        session.save(book6);
        session.save(book7);
        session.save(novel);
        session.save(novel1);
//      session.persist(author);

//        read operation
//        Author author3 = session.get(Author.class, 1);
//
//        delete operation
//        session.delete(author3);
//
//        update operation
//        author1.setAge(50);
//        session.update(author1);

        session.getTransaction().commit();
        session.close();
//        System.out.println("read operation on author>>>>  " + author);
    }
}
