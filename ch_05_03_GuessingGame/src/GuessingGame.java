import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Guessing Game");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm Thikning of a number from 1 to 100");
			System.out.println("Enter your quess!: ");

			// guessing game logic
			int guess = sc.nextInt();
			int min = 1;
			int max = 100;
			int range = max - min + 1;
			int number = (int) (Math.random() * range) + min;

			while (guess != number) {
				if(guess >= number + 10 
				

			}

		}
		sc.close();
	}
}
