package ui;

import java.util.Random;

import util.Console;

public class GuessingGameApp {

	public static void main(String[] args) {
		
		

		System.out.println("Welcome to the number guessing game\n");
		System.out.println("Try to guess the number I am thinking\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

		int guess = 0;
		int count = 0;
		// Generate random integer
		int randNum = (getRandomNumberInRange(1, 100));

		while (guess != randNum) {
			
			guess = Console.getInt("Enter your guess: ");
			// count the number of guesses
			count++;
			// Determine how far away from the random number they are
			int diff = (guess - randNum);
			//so I debug the diff System.out.println(diff);
			

			// Determine how close to the guess they are.
			if (diff > 10) {
			System.out.println("Your guess is way too high");
			}
			else if (diff > 0) {
			System.out.println("Your guess it too high");
			}
			else if (diff < -10) {
			System.out.println("Your guess is way too low");
			}
			else if (diff < 0) {
			System.out.println("Your guess is too low");
			}
		}
		// Determine which messages to display based on number of guesses.
		if (count <= 3) {
		System.out.println("Great Work, it took you " + count + " guesses!");
		}
		else if (count <= 7) {
		System.out.println("Not to bad! it took you " + count + " guesses!");
		}
		else if (count > 7) {
		System.out.println("What took so long, it took you " + count + " guesses!");
		}
		
		choice = Console.getString("Would you like to play again (Y/N): \n");		

	}
		
		System.out.println("Goodbye, Thanks for playing");
		
	}

	private static int getRandomNumberInRange(int min, int max) {

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
