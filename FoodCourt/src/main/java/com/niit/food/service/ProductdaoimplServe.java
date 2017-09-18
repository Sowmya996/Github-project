package com.niit.food.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.niit.food.dao.Productdao;
import com.niit.food.model.Products;

public abstract class ProductdaoimplServe implements ProductdaoServe{
	@Autowired
	private Productdao dao;
	public boolean addProduct (Products product) {
		
		return dao.addProduct(product);		
	}
	public List<Products> viewProducts(){
		
		return dao.viewProducts();
	}
	public boolean deleteProduct(int id) {
		
		return dao.deleteProduct(id);
	}
	public Products getProduct(int productid) {
		
		return dao.getProduct(productid);
	}
}
