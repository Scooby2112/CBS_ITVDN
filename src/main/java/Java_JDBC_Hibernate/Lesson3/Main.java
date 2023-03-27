package Java_JDBC_Hibernate.Lesson3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

//        animal.setId(1);
        animal.setAge(16);
        animal.setName("Nika");
        animal.setTail(true);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();
    }
}
