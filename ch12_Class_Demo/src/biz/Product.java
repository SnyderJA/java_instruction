package biz;

public class Product {

	// Defining some variables
	private String code;
	private String description;
	private double price;


	
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	// Building a constructor
	//public Product() {
	//	code = "";
	//	description = "";
	//	price = 0.0;
	//}

	// Getter
	public String getCode() {
		return code;
	}

	// SETTER
	public void setCode(String code) {
		this.code = code;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		String message = "Code: " + code + "\n" + "Description: " + description + "\n" + "Price: " + price;
		return message;
	}
	/*
	 * SETTER alternate using "this keyword" public void setCode(String code) {
	 * this.code = code; }
	 */

}
