package ui;

import java.util.List;

import biz.Product;
import db.DAO;
import db.ProductTextFile;
import util.Console;

public class ProductManagerApp {

	private static DAO<Product> productFile = new ProductTextFile();

	public static void main(String[] args) {

		System.out.println("Welcome to the Product Manager \n");
		displayMenu();

		String choice = "";
		while (choice.equalsIgnoreCase("exit")) {
			choice = Console.getString("Enter a command: ");

			switch (choice) {
			case "list":
				displayAllProducts();
				break;

			case "add":
				addProduct();
				break;

			case "delete":
				deleteProduct();
				break;

			case "help":
				displayMenu();
				break;

			case "exit":
				System.out.println("Goodbye");
				break;
			}

		}

	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list  - List all products");
		System.out.println("add   - Add a product");
		System.out.println("del   - Delete a product");
		System.out.println("help  - Show this menu");
		System.out.println("exit  - Exit this application");
	}

	private static void displayAllProducts() {
		System.out.println("PRODUCTS LIST");

		List<Product> products = productFile.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
			sb.append(p.getCode() + "\t");
			sb.append(p.getDescription() + "\t");
			sb.append(p.getPrice() + "\n");

		}

		System.out.println(sb);

	}

	private static void addProduct() {
		String code = Console.getString("Enter product code: ");
		String description = Console.getString("Enter description: ");
		double price = Console.getDouble("Enter price");

		Product p = new Product(code, description, price);
		boolean wasSuccessful = productFile.add(p);

		if (wasSuccessful) {
			System.out.println("Successfully added " + description);

		}

	}

	private static void deleteProduct() {
		String code = Console.getString("Product code to delete: ");
		Product p = productFile.get(code);

		if (p != null) {
			productFile.delete(p);
		} else {
			System.out.println("No product found for code " + code);
		}

	}

}
