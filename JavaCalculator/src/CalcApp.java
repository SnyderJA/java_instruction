import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the calculator");

		Scanner sc = new Scanner(System.in);

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			String operator = Console
					.getString("please choose an operator \n A: Additon, S: Subtract, M: Multiply, D: Divide: ");
			int a = Console.getInt("Enter first number: ");
			int b = Console.getInt("Enter second number: ");

			if (operator.equalsIgnoreCase("A"))
				System.out.println("Your Answer: " + Calc.add(a, b));
			else if (operator.equalsIgnoreCase("S"))
				System.out.println("Your Answer: " + Calc.subtract(a, b));
			else if (operator.equalsIgnoreCase("M"))
				System.out.println("Your Answer: " + Calc.multiply(a, b));
			else if (operator.equalsIgnoreCase("D"))
				System.out.println("Your Answer: " + Calc.divide(a, b));

			System.out.println("Try another? (y/n)");
			choice = sc.nextLine();
		}

		sc.close();
	}

}
