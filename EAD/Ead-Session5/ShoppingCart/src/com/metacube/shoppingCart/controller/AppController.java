package com.metacube.shoppingCart.controller;

import java.util.List;
import java.util.Map;

import com.metacube.shoppingCart.facade.CartOperations;
import com.metacube.shoppingCart.model.Product;
import com.metacube.shoppingCart.model.User;

/**
 * @author Priya 
 *
 */
public class AppController {
	
	/**
	 * Displays Stock
	 * @return stock
	 */
	public static List<Product> showStock(){
		return CartOperations.showStock();
	}
	
	/**
	 * Adds Product to Cart
	 * @param productName
	 * @param quantity
	 */
	public static void addProductToCart(String productName,int quantity){
		CartOperations.addProductToCart(productName,quantity);	
	}

	/**
	 * Deletes product from Cart
	 * @param productName
	 * @param quantity
	 */
	public static void deleteProductFromCart(String productName,int quantity){
		CartOperations.deleteProductFromCart(productName,quantity);	
	}


	/**
	 * Displays Cart
	 * @return Cart Items
	 */
	public static Map<Product,Integer> showCart(){
		return CartOperations.showCart();	
	}

	/**
	 * Displays Bill
	 * @return total Bill
	 */
	public static double showBill(){
		return CartOperations.showBill();	
	}

	/**
	 * Displays User of a Cart
	 * @return user
	 */
	public static User showUser(){
		return CartOperations.showUser();	
	}

	/**
	 * Adds User 
	 * @param user
	 */
	public static void setUser(User user){
		CartOperations.setUser(user);	
	}
}