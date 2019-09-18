package com.metacube.shoppingCart.dao;

import java.util.Map;

import com.metacube.shoppingCart.model.Product;
import com.metacube.shoppingCart.model.User;

/**
 * @author Priya
 *
 */
public interface CartOperationsInterface {
	public void addProduct(String productName, int quantity);

	public void deleteProduct(String productName, int quantity);

	public Map<Product, Integer> showCart();

	public double showBill();

	public void setUser(User user);

	public User showUser();
}