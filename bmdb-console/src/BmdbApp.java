import java.sql.Date;
import java.time.LocalDate;

public class BmdbApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the BMDB\n ");
		
		//Using the overload movie constructor.
		String title = Console.getString("Enter a new movie title: ");
		String rating = Console.getString("Enter the movie rating: ");
		int year = Console.getInt("Enter the year released: ");
		String director = Console.getString("Enter the name of the director:");
		Movie movieNew = new Movie(title, rating, year, director);
		System.out.println();  //Line Space
		
		//Using the normal constructor with setters. 
		Actor actorNew = new Actor();
		String firstName = Console.getString("Enter first name of actor: ");
		String lastName = Console.getString("Enter last name of actor: ");
		String gender = Console.getString("Enter gender of the actor: ");
		LocalDate birthDate = Console.getDate("Enter birthdate of actor: ");
		
		actorNew.setFirstName(firstName);
		actorNew.setLastName(lastName);
		actorNew.setGender(gender);
		actorNew.setBirthDate(birthDate);
		
		
		System.out.println(movieNew.toString());
		System.out.println(actorNew.toString());
		
		
		

		
	}

}



