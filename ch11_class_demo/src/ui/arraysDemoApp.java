package ui;

import java.util.Arrays;

public class arraysDemoApp {

	public static void main(String[] args) {

		double[] prices = new double[4];
		prices[0] = 14.95;
		prices[1] = 12.95;
		prices[2] = 11.95;
		prices[3] = 9.95;

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		String[] students = { "Brytt", "Anthony", "Jowell", "Fred", "Justin", "Karlee" };
		//old way using a for loop
		for (int i = 0; i < students.length; i++) {
			System.out.println(i + ":" + students[i]);
		}
		// new for each loop way of doing a array
		for (double p: prices) {
			System.out.println(p);
		}
		
		String[] letters = new String[10];
		Arrays.fill(letters, "a");
		
		for (String str: letters) {
			System.out.println(str);
		}
		
		System.out.println("Sorted studuents");
		Arrays.sort(students);
		for (String student: students) {
			System.out.println(student);
		}
		
		Arrays.sort(prices);
		for (double p: prices) {
			System.out.println(p);
		}
		
		//comparing arrays copying
		System.out.println("copy arrays");
		int[] numbers1 = {4, 7, 2, 5, 0};
		int[] numbers2 = numbers1;
		int[] numbers3 = Arrays.copyOf(numbers1, 5);
		
		System.out.println(Arrays.equals(numbers1, numbers2));
		
		numbers2[1] =100;
		for (int i: numbers1) {
			System.out.println(i);
	
			
		}
		

	}

}
