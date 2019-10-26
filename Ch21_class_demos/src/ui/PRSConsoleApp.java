package ui;

import java.sql.SQLException;
import java.util.List;

import biz.User;
import db.UserDB;
import util.Console;

public class PRSConsoleApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the PRS Console");

		UserDB udb = new UserDB();

		int command = 0;
		while (command != 99) {
			command = Console.getInt(getMenuDisplay(), 0, 100);
			switch (command) {
			case 1:
				// list
				try {
					List<User> users = udb.list();
					System.out.println("LIst of users:");
					for (User u : users) {
						System.out.println(u);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				// get
				int id = Console.getInt("User ID: ");
				try {
					User u = udb.get(id);
					System.out.println("User retrievd: ");
					System.out.println(u);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				// add
				System.out.println("Add a user: ");
				String un = Console.getString("Username? ");
				String pwd = Console.getString("Password? ");
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String phn = Console.getString("Phone? ");
				String em = Console.getString("Email? ");
				Boolean rvw = false;
				Boolean adm = false;
				User u = new User(un, pwd, fn, ln, phn, em, rvw, adm);
				int rowCount = 0;
				rowCount = udb.addUser(u);
				System.out.println("User add, " + rowCount + " rows affected.");
				break;
			case 4:
				// update
				/*
				 * id = Console.getInt("Enter a user ID to be changed: "); try { u =
				 * udb.get(id); System.out.println("User retrieved: "); System.out.println(u); }
				 * catch (SQLException e) { e.printStackTrace();b
				 * 
				 * }
				 */
					// if user is null, it doesn't exist
					
					// if user is found, proceed with update logic

				
				
				
				
				break;
			case 5:
				// delete
				break;
			case 99:
				// exit
				break;

			default:
				System.out.println("Error. Invalid Command");
				break;

			}

		}

		System.out.println("Goodbye");

	}

	private static String getMenuDisplay() {
		String str = "Menu\n" + "1 - List Users\n" + "2 - Get Users\n" + "3 - Add Users\n" + "4 - Update Users\n"
				+ "5 - Delete Users\n" + "99 - Exit\n" + "Command: ";

		return str;

	}

}
