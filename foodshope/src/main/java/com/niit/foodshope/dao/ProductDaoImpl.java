package com.niit.foodshope.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodshope.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public void addProduct(Product product){
		Session session=factory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    tx.begin();
	    session.saveOrUpdate(product);
	    tx.commit();
	}
	@Transactional
	public Product getProduct(int pid) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Product.class);
		cr.add(Restrictions.eq("id",pid));
		Product product=(Product)cr.uniqueResult();
		tx.commit();
		return product;

	}
	@Transactional
	public List<Product> viewProducts() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Product.class);
		List<Product> products =cr.list();
		tx.commit();
		return products;

	}
    @Transactional
	public List<Product> showProducts() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Product.class).setProjection(Projections.property("name"));
		List<Product> products = cr.list();
		tx.commit();
		return products;
	}
    @Transactional
	public void deleteProduct(int pid) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(getProduct(pid));
		tx.commit();	
	}
}
