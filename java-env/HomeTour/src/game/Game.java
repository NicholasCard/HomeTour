package game;

import java.util.Scanner;

import fixtures.Fixture;
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
	
	
	
	printRoomExits(player);
	printRoom(player);
	printInteractableObjects(player.getCurrentRoom());
	
	//player is currently not passing anything to the parse method 
	//do i need to pass the current room and make an object out of that?
	
	//need to figure out how to let the printRoom know which room is the current room 
	
	//the player keeps track of the current room so I need a way so translate that 
		
	
	parse(collectInput(), player);
	}

/*
 * might be useful to make a get room method that already does the checks and returns the room
 */


public static void printInteractableObjects(Room room) {
	//might have to check here with a compare and match system 
	for (Fixture interactable: room.getItems()) {
		
        System.out.println("These are the Items: " + interactable.getName());
        
        //need to figure out how to get a list of the interactables in a room as data so i can compare 
        //could also translate that to the getRooms() method to make a better method for that 
        //I just need to be able to select one for now until I fine tune it
        //String[] fixtures = interactable.getName();
     }
}


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
	
	private static String[]  collectInput() {
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
		
		//figure this out in a bit
		//printRoomExits(player);
		String command = scanner.nextLine();
		
		String[] commands = command.split(" ");

		for (String c : commands)
		  System.out.println(c);
		
		System.out.println("you typed " + command);
		//this needs to be a String[] but just to test
		return commands;
		
	} 
		
		private static void parse(String[] commands, Player player) {
			/*
			 * method that will take the output of collectInput() method, and player object
			 * the first index passed in String[] should be the action so you can
			 * switch on that and handle the target differently for each case
			 * the player object is there so you can modify it if needed like changing the players current room
			 */
			
			//the parameters also needs to be a String[] but im just testing how these functions work for now
			
			String action = commands[0].toUpperCase().intern();
			
			String details = null;
			
			if (commands.length > 1) {
				details = commands[1].toUpperCase().intern();
			}

			if (action == "GO" | action == "MOVE") {
				// What to do when the 'action' specified is to move
				
				//maybe implement a case here 
				switch(details) {
				case "LEFT":
					System.out.println("You went Left");
					player.setCurrentRoom(roomManager.getRooms()[1]);
					System.out.println(player.getCurrentRoom().getName());
					break;
				case "RIGHT":
					System.out.println("You went Right");
					player.setCurrentRoom(roomManager.getRooms()[2]);
					System.out.println(player.getCurrentRoom().getName());
					break;
				}
				
			} else if (action == "INTERACT") {
				// What to do when the 'action' specified is to interact
				//need to implement interactivity but after i get this stuff done
				
				//part of my attempt to start adding interactivity
				//idea so far is to come up with an algorithm that just loops through and checks each time if the strings match
				//doesnt need to be crazy efficient itll loop through like 5 items 
				
				//String[] stuff = printInteractableObjects(player.getCurrentRoom());
				switch(details) {
				case "FRIDGE":
					//this should be stored in the interactables like description of what action is taken when selecting it
					//could get more specific with what actions you can take but thats for later
					System.out.println("You open the fridge and see that there are some leftovers that might be a little too old");
					break;
				}
			} else if (action == "QUIT") {
				//just a substitute for now 
				System.exit(0);
			}
			
			
			
			//the stuff below needs to be refactored somewhere else 
			
			//still have to figure out how to make the player an object that can change the starting room
			System.out.println("hey this is the parse method");
			
			
			
			
			//System.out.println(player.getCurrentRoom().getExits()[1].getName());
			
			
			//this needs to be its own method
			//player.setCurrentRoom(roomManager.getRooms()[1]);
			
			
		}
		
	}

