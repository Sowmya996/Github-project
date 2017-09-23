package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.Products;

public interface ProductDao {
	public void addProduct(Products product);
	public List<Products> viewProducts();
	public void deleteProduct(int id);
	public Products getProduct(int productid);

}
