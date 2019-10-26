import util.Console;

public class ProductManagerApp {

	
	private static DAO<Product> productFile = new ProductTextFile();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Product Manager \n");
		displayMenu();
		
		
		String choice = "";
		while (choice.equalsIgnoreCase("exit")) {
			choice = Console.getString("Enter a command: "); 
			
		}
		
		
		

		
		

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list  - List all products");
		System.out.println("add   - Add a product");
		System.out.println("del   - Delete a product");
		System.out.println("help  - Show this menu");
		System.out.println("exit  - Exit this application");
		
		
		
		private static void displayAllProducts() {
			System.out.println("PRODUCTS LIST");
			
			List<Products> products = productFile.getAll();
		}


}
