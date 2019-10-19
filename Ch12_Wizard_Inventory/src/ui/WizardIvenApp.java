package ui;

import java.util.ArrayList;

import util.Console;

public class WizardIvenApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Wizard Inventory Game\n");
		String menu = "show - Show all items\n" + "grab - Grab an item\n" + "edit - Edit an item\n"
				+ "drop - Drop and item\n" + "exit - Exit the game\n";
		System.out.println(menu);
		String choice = "";

		ArrayList<String> inventory = new ArrayList<String>();
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");

		while (!choice.equalsIgnoreCase("exit")) {
			choice = Console.getString("Command: ");

			switch (choice) {
			case "show":
				show(inventory);
				continue;
				
			case "grab":
				if(inventory.size() >= 4) {
					System.out.println("Inventory is full");
					continue;
				}
				String newItem = Console.getString("Name: ");
				inventory.add(newItem);
				continue;
				
			case "edit" :
				int itemNum = Console.getInt("Item number: ", 0, inventory.size() + 1);
				String newName = Console.getString("New Name: "); 
				inventory.set(itemNum -1 , newName);
				continue;
				
			case "drop" :
				int itemNum2 = Console.getInt("Item number: ", 0, inventory.size() + 1);
				System.out.println(inventory.get(itemNum2 -1 ) + " was dropped.");
				inventory.remove(itemNum2 - 1 );
				continue;
				
			case "exit" :
				System.out.println("Goodbye");
				break;

			default:
				System.out.println("You must make a selection from the menu");
				continue;

			}

		}

	}

	private static void show(ArrayList<String> inventory) {
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println((i + 1) + ") " + inventory.get(i));

		}

	}

}
