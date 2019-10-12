
public class RoshamboApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Roshambo Game");

		String name = Console.getString("Enter your Name: ");
		String selection = Console.getString("Select Rock R, Paper P, Scissors S: ", "R", "P", "S");

		Player1 player1 = new Player1();
		player1.setName(name);
		switch (selection) {
		case "R":
			player1.setRoshamboValue(Roshambo.ROCK);
		case "P":
			player1.setRoshamboValue(Roshambo.PAPER);
		case "S":
			player1.setRoshamboValue(Roshambo.SCISSORS);
		}
		System.out.println(player1.getName() + ": " + player1.getRoshamboValue().toString());

		String player = Console.getString("Why would you like to play (Bart B or Lisa L: ", "B", "L");
		Player cpuPlayer = null;
		switch (player) {
		case "B":
			cpuPlayer = new Bart();

		case "L":
			cpuPlayer = new Lisa();

		}

		System.out.println(cpuPlayer.getName() + ": " + cpuPlayer.getRoshamboValue().toString());

	}

}
