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
		
	
	parse(collectInput(player), player);
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

public static void interactInput(Room room, String details) {
	
	
//for (Fixture interactable: room.getItems()) {
		
	for(int i = 0; i < room.getItems().length-1; i++) {
		
        System.out.println("These are the Items: " + room.getItems()[i].getName());
	
        String selection = room.getItems()[i].getName().toUpperCase();
		  
		  if (details.equals(selection)) {
			  System.out.println(room.getItems()[i].getLongDesc());
			  break;
		  }
		  else {
			  System.out.println("couldnt find it");
			  i++;
			  
		  }
		  
		  
	}
}

public static void roomInput(Room room, String details, Player player) {
	
	
    
        // Creating ArrayList
        ArrayList<String> roomList = new ArrayList<>();
 
        // adding elements of array
        // to ArrayList
        for (Room i : player.getCurrentRoom().getExits()) {
            roomList.add(i.getName().toUpperCase());
 
            System.out.println("HEY THIS IS THE ROOM LIST BOI" + roomList);
            
            
        // returning index of the element
        int roomIndex = roomList.indexOf("KITCHEN");
        System.out.println(roomIndex);
        
        System.out.println(roomManager.getRooms()[roomIndex]);
        
        player.setCurrentRoom(roomManager.getRooms()[roomIndex]);
        collectInput(player);
    }
   
}
    
	
		
	



public static void printRoomExits(Player player) {
	
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
	
	private static String[]  collectInput(Player player) {
		
		
		Scanner scanner = new Scanner(System.in);  
		
		printRoom(player);
		printRoomExits(player);
		printInteractableObjects(player.getCurrentRoom());
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
				
				//can do the same thing 
				
				
				//trying switch case system but it doesnt seem to be working the way it needs to 
				/*switch(details) {
				case "up":
					player.setCurrentRoom(roomManager.getRooms()[0]);
					collectInput(player);
					break;
					
				case "down":
					player.setCurrentRoom(roomManager.getRooms()[1]);
					collectInput(player);
					
					
				case "left":
					player.setCurrentRoom(roomManager.getRooms()[2]);
					collectInput(player);
					break;
					
				case "right":
					player.setCurrentRoom(roomManager.getRooms()[3]);
					collectInput(player);
					break;
				}*/
				
				roomInput(player.getCurrentRoom(), details, player);
				
				
				
			} else if (action == "INTERACT") {
				// What to do when the 'action' specified is to interact
				//need to implement interactivity but after i get this stuff done
				
				//part of my attempt to start adding interactivity
				//idea so far is to come up with an algorithm that just loops through and checks each time if the strings match
				//doesnt need to be crazy efficient itll loop through like 5 items 
				
				//String[] stuff = printInteractableObjects(player.getCurrentRoom());
				
				interactInput(player.getCurrentRoom(), details );
				collectInput(player);
				
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

