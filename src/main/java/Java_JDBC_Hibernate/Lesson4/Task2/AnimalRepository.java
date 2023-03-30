package Java_JDBC_Hibernate.Lesson4.Task2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AnimalRepository {
    private EntityManagerFactory emf;
    private EntityManager em;

    public AnimalRepository(){
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public Animal getByID(int id){
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();
        emf.close();
        return animal;
    }

    public void add(Animal animal){
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
        emf.close();
    }

    public void remove(Animal animal){
        em.getTransaction().begin();
        em.remove(animal);
        em.getTransaction().commit();
        emf.close();
    }

    @SuppressWarnings(value = "unchecked")
    public List<Animal> getAnimalList(){
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT * FROM animals");
        List<Animal> animalList = query.getResultList();
        em.getTransaction().commit();
        emf.close();

        return animalList;
    }
}
