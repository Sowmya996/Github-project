package com.niit.foodshope.dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodshope.model.Products;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public void addProduct(Products product){
		Session session=factory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    tx.begin();
	    session.saveOrUpdate(product);
	    tx.commit();
	}
	@Transactional
	public Products getProduct(int productId) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Products.class);
		cr.add(Restrictions.eq("id",productId));
		Products product=(Products)cr.uniqueResult();
		tx.commit();
		return product;

	}
	@Transactional
	public List<Products> viewProducts() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Products.class);
		List<Products> products =cr.list();
		tx.commit();
		return products;

	}
    @Transactional
	public List<Products> showProducts() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Products.class).setProjection(Projections.property("name"));
		List<Products> products = cr.list();
		tx.commit();
		return products;
	}
    @Transactional
	public void deleteProduct(int id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(getProduct(id));
		tx.commit();	
	}
}
