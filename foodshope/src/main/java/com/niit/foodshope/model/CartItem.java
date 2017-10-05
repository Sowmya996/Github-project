package com.niit.foodshope.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CartItem {
	@Id
	@NotNull
	private Integer quantity;
	@NotNull
	private Float totatPrice;
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getTotatPrice() {
		return totatPrice;
	}
	public void setTotatPrice(Float totatPrice) {
		this.totatPrice = totatPrice;
	}
	
}
