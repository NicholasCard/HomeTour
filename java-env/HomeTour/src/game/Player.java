package game;

import fixtures.Room;

public class Player {

	/*
	 * represents the player moving through these rooms
	 * 
	 * has the property
	 */
	
	//do i need a constructor for player?
	//issue is that i need a parameter Player player and im not quite sure what that means
	
	
	//how do i access the current room with the player object
private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom; //should be the room that the player is currently in 
	}
	
	public void setCurrentRoom(Room currentRoom) {
		//need to figure out how to actually invoke this method to let the player move 
		this.currentRoom = currentRoom; //method that actually changes the room after a choice 
	}
}
