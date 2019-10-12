package ch11_2_Student_Scores;

public class studentScoresApp {

	public static void main(String[] args) {

		Student newStudent = new Student(null, null, 0);
		String firstName = Console.getString("Students First Name: ");
		String lastName = Console.getString("Students Last Name: ");
		int score = Console.getInt("Student Score: ");	


		

		
		System.out.println(newStudent.toString());
		
		

	}

}
