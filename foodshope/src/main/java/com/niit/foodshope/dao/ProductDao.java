package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.Product;

public interface ProductDao {
	public void addProduct(Product product);
	public List<Product> viewProducts();
	public void deleteProduct(int pid);
	public Product getProduct(int pid);

}
