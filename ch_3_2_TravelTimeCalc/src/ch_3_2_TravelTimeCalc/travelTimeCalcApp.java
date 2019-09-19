package ch_3_2_TravelTimeCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class travelTimeCalcApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();  //Blank Line
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Miles: ");
			double miles = sc.nextDouble();
			
		System.out.println("Enter Miles Per Hour: ");
			double mph = sc.nextDouble();
			
		System.out.println();  //Blank Line
		
		System.out.println("Estimated Travel Time");
		System.out.println("-----------------------");
		
		NumberFormat numFormat = NumberFormat.getNumberInstance();
		
			double trvl = miles / mph;
			numFormat.setMaximumFractionDigits(2);
			String trvlTime = numFormat.format(trvl);
		
		
		System.out.println("Estimated Travel Time: " + trvlTime + " Hours");
		
		sc.close();
		
		
		
	
		
		
		
		

	}

}
