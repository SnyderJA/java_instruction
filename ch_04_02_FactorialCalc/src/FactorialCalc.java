import java.util.Scanner;

public class FactorialCalc {

	public static void main(String[] args) {

		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that's greater than 0 and less than 10: ");
			int n = sc.nextInt();
			long fact = 1;

			for (int i = 1; i <= n; i++) {

				fact = fact * i;
			}

			System.out.println("The factorial of " + n + " is " + fact);
			System.out.println("Do you want to continue (Y/N)");
			choice = sc.next();
		}
		sc.close();

		System.out.println("Goodbye");

	}

}
