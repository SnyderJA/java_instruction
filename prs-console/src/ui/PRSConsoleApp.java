package ui;

import java.util.ArrayList;
import java.util.List;

import biz.User;
import util.Console;

public class PRSConsoleApp {

	static List<User> list = new ArrayList<User>();

	public static void main(String[] args) {

		System.out.println("PRS Console\n");

		User u1 = new User(10, "dtrump", "thepres", "Donald", "Trump", "555-555-5555", "dtrump@pres.com", true, false);
		User u2 = new User(222, "jsnyder", "colby", "Justin", "Snyder", "444-444-4444", "jsnyder@email.com", true, true);
		User u3 = new User(8, "asnyder", "champ", "Angie", "Snyder", "333-333-3333", "asnyder@email.com", false, false);
		User u4 = new User();
		u4.setId(44);
		u4.setUserName("adalton");
		u4.setPassword("getbetter");
		u4.setFirstName("Andy");
		u4.setLastName("Dalton");
		u4.setPhoneNumber("777-777-7777");
		u4.setEmail("adalton@bengals.com");
		u4.setReviewer(false);
		u4.setAdmin(false);

		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);

		int command = 0;
		while (command != 99) {
			command = Console.getInt(getMenu(), 0, 100);

			switch (command) {
			case 1:
				// list users
				for (User u : list) {
					System.out.println(u);
				}
				break;

			case 2:
				// Get User
				int uid = Console.getInt("Enter user ID: ");
				User lui = getUser(uid);
				System.out.println(lui);

				break;

			case 3:
				// Add user
				//collect the attributes of the new user
				User u = new User();
				int id = Console.getInt("User Id: ");
				String userName = Console.getString("Username: ");
				String passWord = Console.getString("Password: ");
				String firstName = Console.getString("First Name: ");
				String lastName = Console.getString("Last Name: ");
				String email = Console.getString("Email: ");
				boolean reviewer = true;
				boolean admin = false;

				//set all the variables for the new user
				u.setId(id);
				u.setUserName(userName);
				u.setPassword(passWord);
				u.setFirstName(firstName);
				u.setLastName(lastName);
				u.setEmail(email);
				u.setReviewer(reviewer);
				u.setAdmin(admin);

				list.add(u);

				break;

			case 4:
				// update user

				// ask for user id
				uid = Console.getInt("Enter user ID: ");
				// get user to validate user exist
				lui = getUser(uid);
				// print out user
				System.out.println(lui);
				// if user exists then perform update logic
				if (lui != null) {
					// Collect new password
					String pwd = Console.getString("Enter new password: ");
					// update user with new password
					lui.setPassword(pwd);
				} else {
					// if user does not exists print error and present menu.
					System.out.println("User does not exist");
				}

				break;

			case 5:
				// Delete user
				// ask for user id
				uid = Console.getInt("Enter user ID: ");
				// get user to validate user exist
				lui = getUser(uid);
				// print out user
				System.out.println(lui);
				// if user exists then perform update logic
				if (lui != null) {
					// delete user from ArrayList
					list.remove(lui);
				} else {
					// if user does not exists print error and present menu.
					System.out.println("User does not exist");
				}

				break;

			case 99:
				// exit
				break;

			default:
				// invalid command
				System.out.println("Invalid Command");

			}

		}

		System.out.println("Goodbye");

	}

	private static String getMenu() {
		String menu = "COMNNAD MENU:\n" + 
					"1 - User List\n" + 
					"2 - Get User\n" + 
					"3 - Add User\n" + 
					"4 - Edit User\n" +
					"5 - Delete User\n" + 
					"99 - Exit\n" + "Command: ";

		return menu;
	}

	private static User getUser(int id) {
		User u = null;

		// search the list for the right product
		for (User usr : list) {
			if (usr.getId() == id)
				u = usr;
		}

		return u;
	}

}
