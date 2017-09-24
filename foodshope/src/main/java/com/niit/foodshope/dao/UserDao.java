package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.User;

public interface UserDao {
	public int addUser(User user);
	public User getUser(int userid);
	public void updateUser(User user);
	public List<User> viewUsers();

}
