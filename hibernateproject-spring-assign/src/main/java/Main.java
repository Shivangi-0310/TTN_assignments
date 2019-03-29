import com.hibernate.entity.Address;
import com.hibernate.entity.Author;
import com.hibernate.entity.Book;
import com.hibernate.entity.NewAuthor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Address class>>>
        Address address = new Address();
        address.setStreetNo(19);
        address.setLocation("Noida");
        address.setState("Uttar Pradesh");


//        List of subjects>>>
        List<String> subject = new ArrayList<>();
        subject.add("english");
        subject.add("java");
        subject.add("database");

//        ------------------------------------------------

//        AUTHOR class>>>

//      Uncomment *setId* to run Question 1-8
        Author author = new Author();
//        author.setId(1);
        author.setFirstname("Shivangi");
        author.setLastname("Jain");
        author.setAge(23);
        author.setDob(new Date(19950710));
        author.setAddress(address);
        author.setSubjectList(subject);

        Author author1 = new Author();
//        author1.setId(2);
        author1.setFirstname("Aakash");
        author1.setLastname("Sharma");
        author1.setAge(23);
        author1.setDob(new Date(199510911));
        author1.setAddress(address);
        author1.setSubjectList(subject);

        Author author2 = new Author();
//        author2.setId(3);
        author2.setFirstname("Nayva");
        author2.setLastname("Sharma");
        author2.setAge(21);
        author2.setDob(new Date(19990719));
        author2.setAddress(address);
        author2.setSubjectList(subject);

        Author author3 = new Author();
//        author3.setId(4);
        author3.setFirstname("Samyra");
        author3.setLastname("Mudgal");
        author3.setAge(25);
        author3.setDob(new Date(19910615));
        author3.setAddress(address);
        author3.setSubjectList(subject);

        Author author5 = new Author();
//        author5.setId(5);
        author5.setFirstname("Ankit");
        author5.setLastname("Mudgal");
        author5.setAge(30);
        author5.setDob(new Date(19890515));
        author5.setAddress(address);
        author5.setSubjectList(subject);

//        Book class>>>
        Book book = new Book();
        book.setBookName("Head First");

        Book book1 = new Book();
        book1.setBookName("Herbert Schildt");

        Book book2 = new Book();
        book2.setBookName("Let us C");

        Book book3 = new Book();
        book2.setBookName("Thinking by java");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book);
        bookSet.add(book1);

        Set<Book> bookSet1 = new HashSet<>();
        bookSet1.add(book2);
        bookSet1.add(book3);


//        NewAuthor Class>>>

        //uncomment setBook for one to one relationship
        NewAuthor newAuthor = new NewAuthor();

        newAuthor.setFirstname("Shivangi");
        newAuthor.setLastname("Jain");
        newAuthor.setAge(23);
        newAuthor.setDob(new Date(19950710));
        newAuthor.setAddress(address);
        newAuthor.setSubjectList(subject);
//        newAuthor.setBook(book);
        newAuthor.setBookList(bookSet);

        NewAuthor newAuthor1 = new NewAuthor();
        newAuthor1.setFirstname("Aakash");
        newAuthor1.setLastname("Sharma");
        newAuthor1.setAge(23);
        newAuthor1.setDob(new Date(199510911));
        newAuthor1.setAddress(address);
        newAuthor1.setSubjectList(subject);
//        newAuthor1.setBook(book1);
        newAuthor1.setBookList(bookSet1);


        NewAuthor newAuthor2 = new NewAuthor();
        newAuthor2.setFirstname("Nayva");
        newAuthor2.setLastname("Sharma");
        newAuthor2.setAge(21);
        newAuthor2.setDob(new Date(19990719));
        newAuthor2.setAddress(address);
        newAuthor2.setSubjectList(subject);
//        newAuthor2.setBook(book2);


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        CRUD operation

//        Create operation
        session.save(author);
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author5);

        session.save(newAuthor);
        session.save(newAuthor1);
        session.save(newAuthor2);

        session.save(book);
        session.save(book1);
        session.save(book2);
        session.save(book3);

//        Read operation
        Author author4 = session.get(Author.class, 4);

//        Update operation
        author4.setFirstname("Anviksha");
        session.save(author4);

//        delete operation
        session.delete(author2);
        session.getTransaction().commit();
        session.close();

//        uncomment to run create-drop->
//        sessionFactory.close();

        System.out.println(author4);
    }

}
