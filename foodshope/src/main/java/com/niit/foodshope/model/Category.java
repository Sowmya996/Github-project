package com.niit.foodshope.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id; 
	private String name;
	private String description;
	private MultipartFile categoryImage;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(MultipartFile categoryImage) {
		this.categoryImage = categoryImage;
	}

}
