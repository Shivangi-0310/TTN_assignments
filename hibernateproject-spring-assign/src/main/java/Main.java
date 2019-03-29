import com.hibernate.entity.Address;
import com.hibernate.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Address address = new Address();
        address.setStreetNo(19);
        address.setLocation("Noida");
        address.setState("Uttar Pradesh");

        List<String> subject= new ArrayList<>();
        subject.add("english");
        subject.add("java");
        subject.add("database");

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
