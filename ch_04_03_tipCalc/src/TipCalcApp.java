import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalcApp {

	public static void main(String[] args) {

		System.out.println("Tip Calculator");

		String choice = "y";
		Scanner sc = new Scanner(System.in);

		double tip1 = 0.15;
		double tip2 = 0.20;
		double tip3 = 0.25;

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Cost of Meal: $");
			double cost = sc.nextDouble();

			BigDecimal mealCost = new BigDecimal(cost);
			BigDecimal mealTip1 = new BigDecimal(tip1);
			BigDecimal mealTip2 = new BigDecimal(tip2);
			BigDecimal mealTip3 = new BigDecimal(tip3);

			// Calculate the Tip
			BigDecimal BDmealTip1 = mealTip1.multiply(mealCost)
					.setScale(2, RoundingMode.HALF_UP);
			BigDecimal BDmealTot1 = mealCost.add(BDmealTip1)
					.setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal BDmealTip2 = mealTip2.multiply(mealCost)
					.setScale(2, RoundingMode.HALF_UP);
			BigDecimal BDmealTot2 = mealCost.add(BDmealTip2)
					.setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal BDmealTip3 = mealTip3.multiply(mealCost)
					.setScale(2, RoundingMode.HALF_UP);
			BigDecimal BDmealTot3 = mealCost.add(BDmealTip3)
					.setScale(2, RoundingMode.HALF_UP);

			// Print Calculations
			System.out.println("15%");
			System.out.println("Tip Amount: $" + BDmealTip1);
			System.out.println("Total Amount: $ " + BDmealTot1);
			System.out.println();
			System.out.println("20%");
			System.out.println("Tip Amount: $" + BDmealTip2);
			System.out.println("Total Amount: $ " + BDmealTot2);
			System.out.println();
			System.out.println("25%");
			System.out.println("Tip Amount: $" + BDmealTip3);
			System.out.println("Total Amount: $ " + BDmealTot3);
			
			System.out.println();
			System.out.println();

			System.out.println("Calculate again (Y/N)");		
		choice = sc.next();
		}
		System.out.println("Goodbye");
		sc.close();

	}

}
