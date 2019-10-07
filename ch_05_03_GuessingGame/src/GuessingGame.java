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

			int guess;
			int min = 1;
			int max = 100;
			int tries = 0;
			int range = max - min + 1;
			int number = (int) (Math.random() * range) + min;
			boolean win = false;

			while (win == false) {
				//System.out.println("Enter your quess!: ");
				int i = 0;
				boolean isValid = false;
				while (!isValid) {
					System.out.println("Enter your quess!: ");
					if (sc.hasNextInt()) {
						i = sc.nextInt();
								isValid = true;
					}else {
						System.out.println("Number must be a non decimal number, Please try again.");
					}
					sc.hasNextLine();
				}
				return guess;
			}
				
				tries++;

				if (guess == number) {
					win = true;
				} else if (guess >= number + 10) {
					System.out.println("Guess is way to0 high");
				} else if (guess > number) {
					System.out.println("Guess is too high");
				} else if (guess <= number - 10) {
					System.out.println("Guess is too low");
				} else if (guess < number) {
					System.out.println("Guess is too low");
				}

			}

			if (tries == 1)
				System.out.println("Amazing you only needed " + tries + " tries!");
			else if (tries <= 3)
				System.out.println("Great Work! You are a wizard. It only took you " + tries + " tries!");
			else if (tries <= 7)
				System.out.println("Not to bad! It took you " + tries + " tries!");
			else if (tries > 7)
				System.out.println("What took so long? It took you " + tries + " tries!");

			System.out.println("Would you like to play agian (y/n");
			choice = sc.next();

		}
		sc.close();

	}
	
}



