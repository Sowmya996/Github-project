package com.niit.foodshope.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Component
@Table(name="Product")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id; 
	@Size(min=4,max=20,message="Product Name Should atleast have 4 Char")
	private String Name;
	@NotNull
	private Float Price;
	@Size(min=10,max=50,message="Description Should atleast have 10 Char")
	private String description;
	private Integer available;
	//@NotNull
	//@ManyToOne
	//@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    //private Category categoryId;
	@Transient
	private MultipartFile productImage;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
		
}
