package com.niit.dao;

import java.util.List;

import com.niit.model.Product;


public interface Productdao {
	public void save(Product p);

	public List<Product> list();

}
