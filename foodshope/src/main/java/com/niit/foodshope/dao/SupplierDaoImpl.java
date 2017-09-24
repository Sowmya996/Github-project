package com.niit.foodshope.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodshope.model.Supplier;

@Repository("SupplierDAO")
@Transactional
public class SupplierDaoImpl implements SupplierDao{
	@Autowired	
	private SessionFactory sessionFactory;

	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Supplier p) {
		// TODO Auto-generated method stub
		
	}

	public Supplier getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public boolean save(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public Supplier getByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
