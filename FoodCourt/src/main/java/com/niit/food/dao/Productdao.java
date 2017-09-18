package com.niit.food.dao;

import java.util.List;

import com.niit.food.model.Products;

public interface Productdao {
	public abstract boolean addProduct(Products product);
	public abstract List<Products> viewProducts();
	public abstract boolean deleteProduct(int id);
	public Products getProduct(int productid);
}
