import java.text.NumberFormat;
import java.util.Scanner;


public class TemConvertApp {

	public static void main(String[] args) {

		
		System.out.println("Welcome to the Tempature Converter");
		
		System.out.println("");  //blank line
		
		Scanner sc = new Scanner(System.in);
		
		NumberFormat numFormat = NumberFormat.getInstance();
		
		System.out.println("Enter degrees in Celsius:  ");
			double Celsius = sc.nextDouble();
		
		numFormat.setMaximumFractionDigits(2);
			double c = Celsius + 32.0 * 5.0/9.0;
			String convertC = numFormat.format(c);
		
			
		System.out.println("Degrees in Fahrenheit: " + convertC);
		
		System.out.println(""); //blank line
		
						
		System.out.println("Enter degrees in Fahrenheit:  ");
			double Fahrenheit = sc.nextDouble();
			double f = Fahrenheit - 32.0 * 5.0/9.0;
			
			String convertF = numFormat.format(f);
			
			System.out.println("Degrees in Celsius: " + convertF);
			
		sc.close();
			
		
				
		
		

	}

	
	
	
}
