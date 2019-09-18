package com.metacube.shoppingCart.dao;

import java.util.ArrayList;
import java.util.List;

import com.metacube.shoppingCart.model.Product;

/**
 * @author Priya
 *
 */
public class GetProduct {

	static List<Product> stock = new ArrayList<Product>();

	/**
	 * Adds and Displays Stock
	 * @return stock
	 */
	public static List<Product> showStock() {
		stock.add(new Product(1, "Electronics", "Mixer and Grinder", 5000));
		stock.add(new Product(2, "Electronics", "Washing Machine", 55000));
		stock.add(new Product(3, "Clothing", "Chinos", 1500));
		stock.add(new Product(4, "Clothing", "Jeans", 3500));
		stock.add(new Product(5, "Clothing", "Shirt", 1200));
		return stock;
	}

	/**
	 * Returns Product according to name of Product
	 * @param name
	 * @return product
	 */
	public static Product getProduct(String name) {

		switch (name) {
		case "Mixer and Grinder":
			return stock.get(0);
		case "Washing Machine":
			return stock.get(1);
		case "Chinos":
			return stock.get(2);
		case "Jeans":
			return stock.get(3);
		case "Shirt":
			return stock.get(4);
		default:
			return null;
		}
	}
}