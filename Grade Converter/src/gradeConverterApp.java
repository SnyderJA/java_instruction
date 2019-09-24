import java.util.Scanner;

public class gradeConverterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grade Converter\n");

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter Numerical Grade: ");
			int numGrade = sc.nextInt();
			sc.nextLine();

			String letGrade = "";

			if (numGrade >= 88 && numGrade <= 100) {
				letGrade = "A";
			}

			if (numGrade >= 80 && numGrade <= 87) {
				letGrade = "B";
			}

			if (numGrade >= 76 && numGrade <= 79) {
				letGrade = "C";
			}

			if (numGrade >= 60 && numGrade <= 67) {
				letGrade = "D";
			}

			if (numGrade < 60) {
				letGrade = "F";
			}

			System.out.println("Letter Grade: " + letGrade);
			System.out.println("Continue (Y/N) ");
			choice = sc.nextLine();
		}

		sc.close();
		System.out.println("GoodBye");

	}

}
