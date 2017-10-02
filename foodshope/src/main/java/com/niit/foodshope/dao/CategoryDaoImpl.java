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

import com.niit.foodshope.model.Category;

@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDao{
	@Autowired
	private SessionFactory factory;

	@Transactional
	public void addCategory(Category category) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.saveOrUpdate(category);
		tx.commit();

	}
	@Transactional
	public List<Category> viewCategories() {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Category.class);
		List<Category> categories=cr.list();
		tx.commit();
		return categories;

	}
	@Transactional
	public Category viewCategory(int Id) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Category.class);
		cr.add(Restrictions.eq("id",Id));
		return (Category)cr.uniqueResult();

	}
	@Transactional
	public void deleteCategory(int Id) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Category.class);
		cr.add(Restrictions.eq("id",Id));
		Category category=(Category)cr.uniqueResult();
		tx.begin();
		session.delete(category);
		tx.commit();
	}

}


