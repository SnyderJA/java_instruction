import java.util.Scanner;

public class PrintWorldApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the console demo app");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
	
		
		System.out.println("Enter a number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter a another number: ");
		int number2 = sc.nextInt();

		
		System.out.print("Enter a double: ");
		double decimal = sc.nextDouble();
		
		int sum = number1 + number2; 
		
		if (decimal + sum > 50.0) {
			System.out.println(decimal + " is grater than 50.0");
		}else if (decimal + sum < 50.0) {
			System.out.println(decimal + " is greater thatn 50.0");
		}else {
			System.out.println(decimal + "is 50.0");
		
		}
		
		System.out.println("Your total is: " +sum);
		
		System.out.print("Continue? (y\\n); ");
		choice = sc.nextLine();
		
		//end loop
		
		System.out.println("Thanks for the Playing");
		
		sc.close();
		

		}
	}
}

