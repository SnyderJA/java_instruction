package biz;


public class Student implements Comparable {

	
	private String lastName;
	private String firstName;
	private int score;
	
	
	
	public Student() {
		super();
	}


	public Student(String lastName, String firstName, int score) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}



	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public int compareTo(Object o) {
		Student s2 = (Student)o;
		int i = 0;
		i=this.lastName.compareToIgnoreCase(s2.lastName);
		if (i==0)
			i = this.firstName.compareToIgnoreCase(s2.firstName);
		return 0;
	}


	@Override
	public String toString() {
		return lastName+", "+firstName+": "+score;
	}
	


}

// Define instance variables, define constructors, define getters/setters, define tString
