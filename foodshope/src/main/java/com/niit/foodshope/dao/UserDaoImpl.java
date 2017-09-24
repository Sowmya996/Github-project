package com.niit.foodshope.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodshope.model.Products;
import com.niit.foodshope.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory factory;
	private User user;
	
	@Transactional
	public int addUser(User user) {
		Session session=factory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    tx.begin();
	    session.saveOrUpdate(user);
	    tx.commit();
		return 0;
	}
	@Transactional
	public User getUser(int userid) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria c=session.createCriteria(User.class);
		c.add(Restrictions.eq("id",userid));
		User user=(User)c.uniqueResult();
		tx.commit();
		return user;
	}
	@Transactional
	public void updateUser(User user) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
	}	
	@Transactional
	public List<User> viewUsers() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria c=session.createCriteria(User.class);
		List<User> user =c.list();
		tx.commit();
		return user;
	}	
}
