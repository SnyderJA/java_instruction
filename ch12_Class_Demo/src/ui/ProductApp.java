package ui;

import java.util.ArrayList;
import java.util.List;

import biz.Product;
import util.Console;

public class ProductApp {
	private static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Welcome");
		products.add(new Product("java", "Murach's Java", 57.50));
		products.add(new Product("c#", "Murach's C#", 47.50));

		// list products
		printList(products);

		// add products
		String code = Console.getString("Code: ");
		String desc = Console.getString("Description: ");
		double price = Console.getDouble("Price: ");
		
		Product p = new Product(code, desc, price);
		products.add(p);


		// search for products
		System.out.println("search for product");
		String c = Console.getString("Code?");
		p = getProduct(c);
		System.out.println(p);

		System.out.println("Bye Y'all");

	}

	private static Product getProduct(String code) {
		Product p = null;

		// search the list for the right product
		for (Product prod : products) {
			if (prod.getCode().equalsIgnoreCase(code))
				p = prod;
		}
		return p;
	}

	private static void printList(List<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
