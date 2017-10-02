package com.niit.foodshope.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Supplier {
	@Id
	private String id ;
	private String name;
	private String address;
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setSname(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
