package game;

import java.util.Scanner;
import java.lang.*;
import fixtures.Fixture;
import fixtures.Room;
import game.Player;
import game.RoomManager;
import java.util.ArrayList;

public class Game {
	
	
private static RoomManager roomManager = new RoomManager(3);
private static boolean running = true;
	
public static void main(String[] args) {
	
	
	roomManager.init();
	
	//System.out.println("this is just calling the starting room " + roomManager.getStartingRoom().getName());
	
	Player player = new Player();
	
	
	player.setCurrentRoom(roomManager.getStartingRoom());
	
	
	
	
	while (running) {
	printRoom(player);
	printRoomExits(player);
	
	printInteractableObjects(player.getCurrentRoom());
	
	//player is currently not passing anything to the parse method 
	//do i need to pass the current room and make an object out of that?
	
	//need to figure out how to let the printRoom know which room is the current room 
	
	//the player keeps track of the current room so I need a way so translate that 
		
	
	parse(collectInput(player), player);
	
	}
}
/*
 * might be useful to make a get room method that already does the checks and returns the room
 */


public static void printInteractableObjects(Room room) {
	//might have to check here with a compare and match system 
	for (Fixture interactable: room.getItems()) {
		
        System.out.println("These are the Items you can interact with: " + interactable.getName());
        
        //need to figure out how to get a list of the interactables in a room as data so i can compare 
        //could also translate that to the getRooms() method to make a better method for that 
        //I just need to be able to select one for now until I fine tune it
        //String[] fixtures = interactable.getName();
     }
}

public static void interactInput(Player player, Room room, String details) {
	
	
//for (Fixture interactable: room.getItems()) {
		
	for(int i = 0; i < room.getItems().length + 1; i++) {
		
        //ystem.out.println("Interactable Items " + room.getItems()[i].getName());
	
        String selection = room.getItems()[i].getName().toUpperCase();
		  
		  if (details.equals(selection)) {
			  System.out.println(room.getItems()[i].getLongDesc());
			  //parse(collectInput(player), player);
			  //printRoom(player);
			  //printRoomExits(player);
				
			  //printInteractableObjects(player.getCurrentRoom());
			  break;
		  }
		  else {
			  
		  }
		  
	}
}



public static void roomInput(Room room, String details, Player player) {
	
	
	
for(int i = 0; i < roomManager.getRooms().length + 1; i++) {
		
	
        String selection = roomManager.getRooms()[i].getName().toUpperCase();
       
        //need to have a check somewhere to make sure its actually a part of the exit rooms
		  
		  if (details.equals(selection)) {
			  
			  System.out.println(roomManager.getRooms()[i].getLongDesc());
			  player.setCurrentRoom(roomManager.getRooms()[i]);
			  collectInput(player);
			  break;
		  } else if(details.equals(player.getCurrentRoom().getName().toUpperCase())){
			  System.out.println("Youre Already in this room. Try interacting or selecting another room");
			  
			  //collectInput(player);
			  
			  
		  }
		  else {
			  i = i;
		  
		  }
		  
	}
	
}

public static void printRoomExits(Player player) {
	
	for (Room exits: player.getCurrentRoom().getExits()) {
		
        System.out.println("Rooms: " + exits.getName());
     }
	

	
}


	private static void printRoom(Player player) {
		//method that will print the prompt to the console for the players 
		//current room
		
		
		// i have to add SYSO for each individual part of the object because println doesnt just print the whole object 
		
		System.out.println(player.getCurrentRoom().getName());
		
		//shit might have over written some stuff
		
		
	}
	
	private static String[]  collectInput(Player player) {
		
		
		Scanner scanner = new Scanner(System.in);  
		
		/*
		printRoom(player);
		printRoomExits(player);
		printInteractableObjects(player.getCurrentRoom());
		*/
		System.out.println("please enter a command");
		
		
		//need to implement a method that prints out the exits for that particular room 
		//System.out.println("these are the current options for exits " );
		
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
				
				
				
				roomInput(player.getCurrentRoom(), details, player);
				
				/*printRoomExits(player);
				
				printInteractableObjects(player.getCurrentRoom());*/
				
			} else if (action == "INTERACT") {
				// What to do when the 'action' specified is to interact
				//need to implement interactivity but after i get this stuff done
				
				//part of my attempt to start adding interactivity
				//idea so far is to come up with an algorithm that just loops through and checks each time if the strings match
				//doesnt need to be crazy efficient itll loop through like 5 items 
				
								
				interactInput(player, player.getCurrentRoom(), details);
				
				
				
			} else if (action == "QUIT") {
				//just a substitute for now 
				System.exit(0);
			}
			
			
			//System.out.println(player.getCurrentRoom().getExits()[1].getName());
			
			
			//this needs to be its own method
			//pretty sure i moved these but they are going to stay here
			
			//player.setCurrentRoom(roomManager.getRooms()[1]);
			
			
		}
		
	}

