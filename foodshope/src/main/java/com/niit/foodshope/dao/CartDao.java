package com.niit.foodshope.dao;

import java.util.List;

import com.niit.foodshope.model.Cart;
import com.niit.foodshope.model.CartItem;
import com.niit.foodshope.model.User;


public interface CartDao {
	public void addCartItem(CartItem cartItem);
	public void deleteCartItem(int cartId,int productId);
	public void deleteCart(int cartId);
	public Cart getCart(User user);
	public void updateCart(Cart cart);
	public List<CartItem> viewCart(User user);
	public List<CartItem> getCart(int productId,int cartId);
	

}
