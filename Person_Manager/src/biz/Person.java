package biz;

public class Person {
	
	
	String firstName;
	String lastName;

	
	
	public Person(String first, String last) {
		firstName = first;
		lastName = last;
	
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	

	
	
	
	
	
	
	


}
