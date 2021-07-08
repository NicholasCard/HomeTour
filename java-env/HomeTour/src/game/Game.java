package game;

import java.util.Scanner;

import fixtures.Room;
import game.Player;
import game.RoomManager;

public class Game {
	
	

	/*
	 * This class stores the main method and is the ONLY class with it
	 * This is where the game loop goes and will 
	 * 
	 * -Display the prompt
	 * -collect input
	 * -parse the input
	 */
	
	private static RoomManager roomManager = new RoomManager(3);
	
	
public static void main(String[] args) {
	
	
	roomManager.init();
	
	System.out.println("this is just calling the starting room " + roomManager.getStartingRoom().getName());
	
	Player player = new Player();
	
	player.setCurrentRoom(roomManager.getStartingRoom());
	System.out.println(player.getCurrentRoom().getName());
	
	
	//player is currently not passing anything to the parse method 
	//do i need to pass the current room and make an object out of that?
	
	//need to figure out how to let the printRoom know which room is the current room 
	
	//the player keeps track of the current room so I need a way so translate that 
		
	
	parse(collectInput(), player);
	}


/*
 * This method is used to print a list of all exits connected to
 * a Room. This method is based on the arbitrary way that the 
 * connections to rooms are established. In the case of the example
 * the Room class has a 'getExit' method which can be used to 
 * arbitrarily determine a string associated with an exit (i.e.
 * North/South/East/West), and we print this information using
 * this method
 */
public static void printRoomExits(Player player) {
	// TODO: Implement Method
	//just threw around the arbitrarily word around and doesnt give much description
	
	
	
	/*
	 * this method needs to use the getExits method to grab the exits from the room they are currently in
	 * 
	 * getExits is in the Room class so it should be associated with the room
	 */
	
	for (Room exits: player.getCurrentRoom().getExits()) {
		
        System.out.println("These are the exits: " + exits.getName());
     }
	
	//System.out.println(player.getCurrentRoom().getExits());
	
	//player.getCurrentRoom().getExits()[1].getName();
	
}


	private static void printRoom(Player player) {
		//method that will print the prompt to the console for the players 
		//current room
		
		
		// i have to add SYSO for each individual part of the object because println doesnt just print the whole object 
		
		System.out.println(player.getCurrentRoom().getName());
		
		//shit might have over written some stuff
		
		
	}
	
	private static /*String[]*/ String collectInput() {
		/*method that uses a scanner like object to collect console input 
		 * from the player and then divides the input into multiple parts
		 * -An Action
		 * -The target of the action
		 * for example Go East is the command
		 * -East is the target
		 * -Go is the command
		 */
		
		//does this go in the collectInput method or the main method?
		Scanner scanner = new Scanner(System.in);  
		
		System.out.println("please enter a command");
		
		
		
		//need to implement a method that prints out the exits for that particular room 
		System.out.println("these are the current options for exits " );
		String command = scanner.nextLine();
		System.out.println("you typed " + command);
		//this needs to be a String[] but just to test
		return command;
		
	} 
		
		private static void parse(/*String[]*/ String command, Player player) {
			/*
			 * method that will take the output of collectInput() method, and player object
			 * the first index passed in String[] should be the action so you can
			 * switch on that and handle the target differently for each case
			 * the player object is there so you can modify it if needed like changing the players current room
			 */
			
			//the parameters also needs to be a String[] but im just testing how these functions work for now
			
			//still have to figure out how to make the player an object that can change the starting room
			System.out.println("hey this is the parse method");
			
			
			System.out.println("this is the printRoomExits Attempt: ");
			
			//System.out.println(player.getCurrentRoom().getExits()[1].getName());
			
			player.setCurrentRoom(roomManager.getRooms()[1]);
			printRoomExits(player);
			printRoom(player);
			
		}
		
	}

