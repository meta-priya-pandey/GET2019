package com.metacube.shoppingCart.model;

/**
 * @author Priya
 * Model Class for User
 *
 */
public class User {
	private static int userId = 0;
	private String name;

	public User() {
	}

	public User(String name) {
		super();
		userId = userId++;
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}