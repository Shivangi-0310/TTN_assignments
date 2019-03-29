import com.hibernate.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Author author = new Author();
        author.setId(1);
        author.setFirstname("Shivangi");
        author.setLastname("Jain");
        author.setAge(23);

        Author author1 = new Author();
        author1.setId(2);
        author1.setFirstname("Aakash");
        author1.setLastname("Sharma");
        author1.setAge(23);

        Author author2 = new Author();
        author2.setId(3);
        author2.setFirstname("Nayva");
        author2.setLastname("Sharma");
        author2.setAge(21);

        Author author3 = new Author();
        author3.setId(4);
        author3.setFirstname("Samyra");
        author3.setLastname("Mudgal");
        author3.setAge(25);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        CRUD operation

//        Create operation
        session.save(author);
        session.save(author1);
        session.save(author2);
        session.save(author3);

//        Read operation
        Author author4 = session.get(Author.class, 4);

//        Update operation
        author4.setFirstname("Anviksha");
        session.save(author4);

//        delete operation
        session.delete(author2);
        session.getTransaction().commit();
        session.close();

        System.out.println(author4);
    }

}
