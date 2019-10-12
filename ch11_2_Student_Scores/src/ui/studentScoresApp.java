package ui;

import java.util.Arrays;

import biz.Student;
import util.Console;

public class studentScoresApp {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Student Scores App");
		
		int nbr = Console.getInt("How Many Students?" , 0 , 501);
		
		Student[] studentsArray = new Student[nbr];
		
		for (int i=0; i < nbr; i++ )  {
			String lastName = Console.getString("Student Last Name: ");
			String firstName = Console.getString("Student First Name: ");
			int score = Console.getInt("Score: ", -1, 101);
			Student s = new Student(firstName, lastName, score);
			studentsArray[i] = s;

		}
		
		System.out.println("SUMMARY");
		Arrays.sort(studentsArray);
		for (Student s: studentsArray) {
			System.out.println(s);
		}
		

		
		System.out.println("Bye");

	}

}
