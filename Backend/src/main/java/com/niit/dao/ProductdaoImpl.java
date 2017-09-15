package com.niit.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.niit.model.Product;

public class ProductdaoImpl implements Productdao {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	public void save(Product p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.flush();
		session.close();
	}

	public List<Product> list() {
		Session session = this.sessionFactory.openSession();
		List<Product> productList = session.createQuery("from Product").list();
		return productList;
	}
	

}
