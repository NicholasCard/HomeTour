package game;

import fixtures.Room;

public class RoomManager {

	/*
	 * this class is responsible for loading rooms into memory when game.Main is executed
	 * it will invoke the init method in this class that will 
	 * -instantiate all our room objects
	 * -link them together as exits
	 * -designate a startingRoom
	 */
	Room startingRoom; //room the player starts in
	Room[] rooms; //all the rooms in the house
	
	/*
	 * have to build the room constructor so it takes 
	 * -shortDescription
	 * -longDescription
	 * -name
	 */
	
	public void init() {
		//Room livingRoom = new Room(
				//"The Living Room",
				//"A cozy little room for relaxing",
				//"The long description that ill put here eventually" + "\n"
				
				//);
		//this.rooms[0] = livingRoom;
		//this.startingRoom = livingRoom;
	}
}