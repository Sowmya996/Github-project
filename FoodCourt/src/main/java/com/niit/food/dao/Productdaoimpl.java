package com.niit.food.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.food.model.Products;

@Repository
public class Productdaoimpl implements Productdao {
	@Autowired
	private SessionFactory Factory;
	@Transactional
	public boolean addProduct(Products product) {
		Session session=Factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.persist(product);
		tx.commit();
		System.out.println("after commit");
		return true;	
	}
	@Transactional
	public List<Products> viewProducts(){
		Session session=Factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		List<Products> list=session.createCriteria(Products.class).list();
		tx.commit();
		return list;		
	}
	@Transactional
	public boolean deleteProduct(int id) {
		System.out.println("Id in deleteProduct(int id):"+id);
	    Session session=Factory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    tx.begin();
	    Query query=session.createQuery("delete from Products where id=:status");
	    query.setInteger("status",id);
	    int rowsDeleted=query.executeUpdate();
	    tx.commit();
	    System.out.println("Rows deleted:"+rowsDeleted);
	    if(rowsDeleted!=1)
	    	return true;
	    else
	    	return false;
	}
	public Products getProduct(int productid) {
		Session s=Factory.getCurrentSession();
		Transaction t=s.beginTransaction(); 
				 return (Products)s.get(Products.class, productid); 
	}
}
