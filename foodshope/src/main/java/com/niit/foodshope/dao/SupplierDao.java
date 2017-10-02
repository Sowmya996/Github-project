package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.Supplier;

public interface SupplierDao {
	public List<Supplier> getAll();
	public void update(Supplier p);
	public Supplier getById(int id);
	public void delete(int id);
	public boolean save(Supplier supplier);
	public Supplier getByName(String sname );
}
