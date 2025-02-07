package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.Entity.Books;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class BooksHelper implements Methods {
private SessionFactory sessionFactory;
public BooksHelper() { sessionFactory = HibernateUtil.getSessionFactory();}

    @Override
    public void add(Books books) {
    try (Session session = sessionFactory.openSession()){
        Transaction tx = session.beginTransaction();
        session.save(books);
        tx.commit();
    } catch (HibernateException e) {}

    }

    @Override
    public void remove(Books books) {

    }

    @Override
    public List<Books> getBooksOver150pages() { // Должен возвращать List<Books>
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Books> query = builder.createQuery(Books.class);
            Root<Books> root = query.from(Books.class);

            query.select(root)
                    .where(builder.greaterThan(root.get("pageCount"), 150));

            return session.createQuery(query).getResultList(); // Возвращает список
        }



    }
}
