import com.hibernate.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Author author = new Author();
        author.setId(1);
        author.setFirstname("Shivangi");
        author.setLastname("Jain");
        author.setAge(23);
        author.setDob(new Date(19950710));

        Author author1 = new Author();
        author1.setId(2);
        author1.setFirstname("Aakash");
        author1.setLastname("Sharma");
        author1.setAge(23);
        author1.setDob(new Date(199510911));

        Author author2 = new Author();
        author2.setId(3);
        author2.setFirstname("Nayva");
        author2.setLastname("Sharma");
        author2.setAge(21);
        author2.setDob(new Date(19990719));

        Author author3 = new Author();
        author3.setId(4);
        author3.setFirstname("Samyra");
        author3.setLastname("Mudgal");
        author3.setAge(25);
        author3.setDob(new Date(19910615));

        Author author5 = new Author();
        author5.setId(5);
        author5.setFirstname("Ankit");
        author5.setLastname("Mudgal");
        author5.setAge(30);
        author5.setDob(new Date(19890515));

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
        sessionFactory.close();

        System.out.println(author4);
    }

}
