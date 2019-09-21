import java.util.*;

public class FizzBuzzGame {

	public static void main(String[] args) {
		
		
	System.out.println("Welcome to the FIZZBUZZ Game/n");
	System.out.println("Enter number to count up to");
	
	Scanner sc = new Scanner(System.in);
		      
		       int n = sc.nextInt(); 
	
		       for (int i=1; i<=n; i++)                                  
		        { 
		           if (i%15==0)                                                  
		                System.out.println( i + " :FizzBuzz" + " ");  
		      
		           else if (i%5==0)      
		                System.out.println( i + " :Buzz" + " ");  
		  
		           else if (i%3==0)      
		                System.out.println( i + " :Fizz" + " ");  
		  
		           else 
		                System.out.println(i+" ");    
		           
		           sc.close();
		        } 
		    } 
		} 
