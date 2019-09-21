package ch_04_01_TableOfPowers;

import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Table of Powers");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		

			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Enter an Integer");
				int number = sc.nextInt();
				System.out.println("Number\tSquares\tCubed");
				System.out.println("======\t======\t======");
					for (int i = 1; i< number; i++) {
						System.out.println(i + "\t" + i*i + "\t" + i*i*i);
				}
					
					System.out.println("Do you want to continue (y/n): ");
					choice =sc.next();
				
			}
			
			sc.close();
			System.out.println("Goodbye");
				
	}
	
}

