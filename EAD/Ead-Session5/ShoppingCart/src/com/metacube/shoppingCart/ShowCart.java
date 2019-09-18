package com.metacube.shoppingCart;

import java.util.Map;
import java.util.Scanner;

import com.metacube.shoppingCart.controller.AppController;
import com.metacube.shoppingCart.model.Product;
import com.metacube.shoppingCart.model.User;

/**
 * @author Priya
 * This Class is a view to the user.
 *
 */
public class ShowCart {

	/**
	 * Prints Cart Items of a User
	 */
	public static void showCart() {
		System.out.print("Name  ");
		System.out.println("Hi" + AppController.showUser().getName() + "!");
		System.out.println("Cart :");
		System.out.print("Name  ");
		System.out.print("Price  ");
		System.out.println("Quantity");
		for (Map.Entry<Product, Integer> map : AppController.showCart().entrySet()) {
			System.out.print(map.getKey().getName() + "  ");
			System.out.print(map.getKey().getPrice() + "  ");
			System.out.println(map.getValue());
		}
	}

	public static void main(String[] args) {

		try {
			String name;
			int option;
			String productName;
			int quantity;
			boolean flag = true;
			Scanner sc = new Scanner(System.in);
			Scanner scInt = new Scanner(System.in);
			System.out.println("Welcome To Shopping Cart Application!");
			System.out.println("Enter Your Name : ");
			name = sc.next();
			AppController.setUser(new User(name));

			System.out.println("List of Products");
			for (Product p : AppController.showStock()) {
				System.out.println(p.getProductCode() + " " + p.getName() + " " + p.getPrice());
			}

			while (flag) {
				System.out.println("Please Select Your Choice!");
				System.out.println("1.Add Product To Cart");
				System.out.println("2.Delete Product From Cart");
				System.out.println("3.Show Cart");
				System.out.println("4.Generate Bill");
				System.out.println("5.Exit");
				option = scInt.nextInt();

				switch (option) {
				case 1:
					System.out.println("Enter Name of product");
					productName = sc.next();
					System.out.println("Enter Quantity");
					quantity = scInt.nextInt();
					AppController.addProductToCart(productName, quantity);
					System.out.println(productName + " Added!");
					break;
				case 2:
					System.out.println("Enter Name of product");
					productName = sc.next();
					System.out.println("Enter Quantity(To delete Enter 0)");
					quantity = scInt.nextInt();
					AppController.deleteProductFromCart(productName, quantity);
					System.out.println(productName + " Updated!");
					break;
				case 3:
					ShowCart.showCart();
					break;
				case 4:
					System.out.println("Total Bill : " + AppController.showBill());
					break;
				case 5:
					flag = false;
					System.out.println("Thank You For Shopping!");
					break;
				default:
					System.out.println("Please Enter proper choice!");
				}

			}

			sc.close();
			scInt.close();
		} catch (Exception e) {
			System.out.println("Please Enter properly!");
		}
	}
}