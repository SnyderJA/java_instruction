package ch11_2_Student_Scores;


public class Student implements Comparable<Student> {

	Student[] studentArray = new Student[100];
	
	String lastName;
	String firstName;
	int score;
	
	
	public Student(String firstName, String lastName, int score) {
		this.firstName = null;
		this.lastName = null;
		this.score = 0;
		
		
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
	public int compareTo(Student o) {
		return 0;
	}


	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", score=" + score + "]";
	}
	


}
