package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.Category;

public interface CategoryDao {
	
	public void addCategory(Category category);
	public List<Category> viewCategories();
	public Category viewCategory(int Id);
	public void deleteCategory(int Id);
}
