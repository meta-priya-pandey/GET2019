package shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Priya Pandey
 * Shopping cart class generates the bill according to the product quantity and price.
 * Shopping cart class lets the user to add item in their cart.
 * Shopping cart class lets user to remove item in their cart.
 */
public class ShoppingCart {
List<Products> items = new ArrayList<Products>();
	
	/**
	 * Adds the item in the cart.
	 * @param id
	 * @param price
	 * @param quantity
	 * @return item
	 */
	public void addItem(int id, double price, int quantity)
	{
		int update = 0;
		for(Products i : items)
		{
			if(i.getId()==id)
			{
				update = 1;
				int q = i.getQuantity();
				i.setQuantity(quantity + q);
				break;
			}
		}
		if(update == 0)
		{
			Products item = new Products(id, price, quantity);
			items.add(item);
		}
	}
	
	/**
	 * Removes the item in the cart.
	 * @param id
	 */
	public void removeItem(int id)
	{
		for(Products i:items)
		{
			if(id==i.getId())
			{
				items.remove(i);
				break;
			}
		}
	}
	
	/**
	 * Generates the total bill amount.
	 */
	public void generateBill()
	{
		double sum=0;
		System.out.println("Product id\t\tprice\t\tquantity\ttotal");
		for(Products i:items)
		{
			i.showItem();
			sum += i.total();
		}
		System.out.println();
		System.out.println("Grand Total:  " + sum);
	}
}