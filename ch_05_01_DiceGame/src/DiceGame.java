
import java.util.Scanner;


public class DiceGame {

	public static void main(String[] args) {
		
		

		System.out.println("Dice Game, Just Roll With It");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Roll that dice? (Y/N) ");
			choice = sc.next();

			/*int max = 66;
			int min = 11;
			int range = max - min + 1;*/

			int dice1 = rollDie();
			int dice2 = rollDie();
			int sum = dice1 + dice2;
			
			System.out.println("Dice 1: " + dice1);
			System.out.println("Dice 2: " + dice2);
			System.out.println("Total: " + sum);
			if (dice1 == 1 && dice2 == 1) {
				System.out.println("SNAKE EYES");
			}
			if (dice1 == 6 && dice2 == 6) {
				System.out.println("BOX CARS");
			}

		}
		sc.close();

	}

	
	private static int rollDie() {
		int die = (int)(Math.random()*6) +1;
		return die;
	}
}



