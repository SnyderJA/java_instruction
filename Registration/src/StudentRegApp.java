import java.util.Scanner;

public class StudentRegApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		
		System.out.println("Enter last Name: ");
		String lastName = sc.next();
		
		System.out.println("Enter Year of Birth");
		int birthYear = sc.nextInt();
		
		System.out.println(firstName +" "+ lastName);
		
		System.out.println("Your Registration is Complete");
		
		System.out.println("your temporary password is: " +firstName +"*" +birthYear);
		
		sc.close();
		
	
	}

}
