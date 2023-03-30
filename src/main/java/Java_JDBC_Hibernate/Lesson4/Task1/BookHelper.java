package Java_JDBC_Hibernate.Lesson4.Task1;

import Java_JDBC_Hibernate.Lesson4.Task1.Entity.Book;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class BookHelper {
    public SessionFactory sessionFactory;

    public BookHelper(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Book> getBookList(){
        Session session = sessionFactory.openSession();

        CriteriaQuery<Book> cq = session.getCriteriaBuilder().createQuery(Book.class);
        cq.from(Book.class);

        List<Book> bookList = session.createQuery(cq).getResultList();

        session.close();

        return bookList;
    }
    public Book getBookByID(int id){
        Session session = sessionFactory.openSession();

        return session.get(Book.class, id);
    }

    public Book addBook(Book book){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();

        return book;
    }
}
