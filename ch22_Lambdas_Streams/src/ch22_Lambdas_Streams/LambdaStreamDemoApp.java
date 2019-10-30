package ch22_Lambdas_Streams;

import java.util.ArrayList;
import java.util.List;

public class LambdaStreamDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Lambda / Stream Demo App\n");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "555-5555"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		List<Contact> conatctsWithoutPhone = contactsNoPhone(contacts);
		
		for(Contact c : conatctsWithoutPhone) {
			System.out.println(c.getName());
		}
		
		List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone() == null);
		
		for(Contact c : contactsNoPhone) {
			System.out.println(c.getName());
		}
		
		List<Contact> contactsNoEmail = filterContacts(contacts, c-> c.getEmail() == null);
		
		for(Contact c : contactsNoEmail) {
			System.out.println(c.getName());
		}
		
		}
	
	private static List<Contact> contactsNoPhone(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if(c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		
		return contactsWithoutPhone;
	}
	
	private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		
		for(Contact c : contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
			
		}
		
		return filteredContacts;
	}


}


