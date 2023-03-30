package Java_JDBC_Hibernate.Lesson4.Task1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static SessionFactory factory;

    static {
        factory = new Configuration()
                .configure("BookCFG.xml")
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return factory;
    }
}
