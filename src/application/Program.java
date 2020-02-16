package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double price;
		int quantity;

		System.out.println("********* Product Stock Program *********");

		System.out.println("First, let's create a product:");
		System.out.println("Please, enter product data");

		System.out.print("Name: ");
		name = sc.next();

		System.out.print("Price: ");
		price = sc.nextDouble();

		System.out.print("Quantity: ");
		quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println("Product successfully created!");
		System.out.println("Product information created: " + product);
		
		System.out.println("Now, let's manipulate the created product.");
		
		menu(product);
		
		sc.close();

	}

	public static void menu(Product product) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		
		System.out.println("Select an option: ");
		System.out.println("1. Add Product");
		System.out.println("2. Remove Product");
		
		
		System.out.print("Option: ");
		int option = sc.nextInt();

		switch (option) {
		
			case 1:
				System.out.println("\nOption: Add new product");
				System.out.print("Quantity to be added: ");
				quantity = sc.nextInt();
				
				product.addProduct(quantity);
				
				System.out.println("Quantity added successfully!");
				System.out.println("Current stock status: " + product);
				
				break;
	
			case 2:
				System.out.println("\nOption: Remove product");
				System.out.println("Enter the quantity: ");
				quantity = sc.nextInt();
				
				product.removeProduct(quantity);
	
				System.out.println("Quantity removed successfully!");
				System.out.println("Current stock status: " + product);
				
				break;
				
			default:
			
				System.out.println("Invalid option!");
				break;
			}

		sc.close();
	}

}
