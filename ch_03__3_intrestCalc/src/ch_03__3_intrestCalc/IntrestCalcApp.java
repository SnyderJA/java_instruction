package ch_03__3_intrestCalc;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class IntrestCalcApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Interest Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.println("Enter Loan Amount: ");
		//	BigDecimal loanAmt = sc.nextBigDecimal();     
			double loanAmt = sc.nextDouble();			
			
			System.out.println("Enter Interest Rate: ");
			double interestRate = sc.nextDouble();
			
			BigDecimal loanAmtBD = new BigDecimal(loanAmt);
			BigDecimal interestRateBD = new BigDecimal(interestRate);
			
			double interest = loanAmtBD.multiply(interestRateBD).doubleValue();
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			currency.setMaximumFractionDigits(2);
			percent.setMaximumFractionDigits(3);
			
			String loanAmtString = currency.format(loanAmt);
			String interRateString = percent.format(interestRate);
			String interestString = currency.format(interest);
			
			System.out.println("Loan ammount:\t\t\t" + loanAmtString);
			System.out.println("Interest Rate:\t\t" + interRateString);
			System.out.println("Interest \t\t" + interestString);
			
			System.out.println("Do you want to continue (y/n)");
			choice = sc.nextLine();}
			
			
			
	System.out.println("Goodbye");
	
	sc.close();
	
	}
	

}
