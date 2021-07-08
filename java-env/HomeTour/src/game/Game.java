package game;

public class Game {
	
	public static void main(String[] args) {
		
	}

	/*
	 * This class stores the main method and is the ONLY class with it
	 * This is where the game loop goes and will 
	 * 
	 * -Display the prompt
	 * -collect input
	 * -parse the input
	 */
	
	private static void printRoom(Player player) {
		//method that will print the prompt to the console for the players 
		//current room
	}
	
	private static String[] collectInput() {
		/*method that uses a scanner like object to collect console input 
		 * from the player and then divides the input into multiple parts
		 * -An Action
		 * -The target of the action
		 * for example Go East is the command
		 * -East is the target
		 * -Go is the command
		 */
	}
		
		private static void parse(String[] command, Player player) {
			/*
			 * method that will take the output of collectInput(), method, and player object
			 * the first index passed in String[] should be the action so you can
			 * switch on that and handle the target differently for each case
			 * the player object is there so you can modify it if needed like changing the players current room
			 */
		}
		
	}
}
