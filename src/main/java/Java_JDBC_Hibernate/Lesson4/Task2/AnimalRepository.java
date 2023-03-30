package Java_JDBC_Hibernate.Lesson4.Task2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class AnimalRepository {
    private SessionFactory sessionFactory;

    public AnimalRepository(){
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public Animal getByID(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.find(Animal.class, id);
    }

    public void add(Animal animal){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.persist(animal);
        session.getTransaction().commit();
    }

    public void remove(Animal animal){
        Session session = sessionFactory.getCurrentSession();
        session.remove(session.find(Animal.class, animal.getId()));
    }

    public List<Animal> getAnimalList(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("SELECT * FROM Animal", Animal.class)
                .getResultList();
    }
}
