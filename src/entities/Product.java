package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public void addProduct(int quantity) {
		
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		
		this.quantity -= quantity;
	}


	public double totalInStock() {
		
		double total = 0.0;
		
		total = this.quantity * this.price;
		
		return total;
	}
	
	@Override
	public String toString() {
		return "Product \n"
				+ "Name= " + getName() 	+ "\n"
				+ "Price= " + getPrice()	+ "\n"
				+ "Quantity= " + getQuantity() + "\n"
				+ "Total in Stock= " + totalInStock();
				
			
	}
	
	
	
	
}
