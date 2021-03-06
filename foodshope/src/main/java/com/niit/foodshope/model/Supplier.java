package com.niit.foodshope.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull(message="User can not be null")
	@OneToOne
	private User userId;
	@NotNull(message="Product can not be null")
	@ManyToOne
	private Product product;
	@NotNull
	private Integer quantity;
	@Size(min=10,max=50,message="Description Should atleast have 10 Char")
	private String description;
	@Column(columnDefinition="BOOLEAN default 'false'")
	private Boolean freeDelivery;
	@NotNull
	@Column(columnDefinition="Date default getDate()")
	private Date stockDated;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(Boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
