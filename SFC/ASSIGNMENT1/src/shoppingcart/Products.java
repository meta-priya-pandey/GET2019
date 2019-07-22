package shoppingcart;

/**
 * @author Priya Pandey
 * Products class creates the Products according to the user need.
 */
public class Products {
	private int id;
	private double price;
	private int quantity;
	
	/**
	 * @param id
	 * @param price
	 * @param quantity
	 */
	public Products(int id,double price, int quantity)
	{
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Getter for product id.
	public int getId() {
		return id;
	}
	
	//Setter for product id.
	public void setId(int id) {
		this.id = id;
	}
	
	//Getter for product price.
	public double getPrice() {
		return price;
	}
	
	//Setter for product price.
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Getter for product quantity.
	public int getQuantity() {
		return quantity;
	}
	
	//Setter for product quantity.
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Returns the total price value of product.
	public double total()
	{
		return price*quantity;
	}
	
	//Displaying the product price, quantity and total bill.
	public void showItem()
	{
		System.out.println(id+"\t\t\t"+price+"\t\t"+quantity+"\t\t"+total());
	}
}