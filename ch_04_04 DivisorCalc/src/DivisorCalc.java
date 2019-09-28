import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {

		System.out.println("Welcome to the Divisor Calc");
		
		
int x, y;
        
        //Reading the input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = (int)scanner.nextInt();
        
        System.out.print("Enter second number:");
        y = (int)scanner.nextInt();
        
        //Closing the scanner to avoid memory leaks
        scanner.close();
        
        //Business Logic to calculate the GCD
        while (x != y) {
        	if(x > y)
                x = x - y;
            else
                y = y - x;
        }

        //displaying the result
        System.out.printf("GCD of given numbers is: %d", y);
    }

}
