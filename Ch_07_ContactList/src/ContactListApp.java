
public class ContactListApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Contact List application\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String firstName = Console.getString("Enter First Name: ");
			String lastName = Console.getString("Enter Last Name: ");
			String email = Console.getString("Enter Email address: ");
			String phone = Console.getString("Enter phone number: ");
			Contact newContact = new Contact(firstName, lastName, email, phone);

			System.out.println("------------------------------------------");
			System.out.println("----Current Contact-----------------------");
			System.out.println("------------------------------------------");

			System.out.println(newContact.displayContact());

			System.out.println("------------------------------------------");

			Console.getString("Continue? (Y/N)");

		}

	}

}
