import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class MPGApp {

	
	
	public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            NumberFormat numFormat = NumberFormat.getNumberInstance();
        
            numFormat.setMaximumFractionDigits(2);
            double mpg = miles/gallons;
           /* System.out.println("Miles per gallon is " +mpg + ".");*/
   
            String mpgCalc = numFormat.format(mpg);
            System.out.println("Miles per gallon is " +mpgCalc + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}


