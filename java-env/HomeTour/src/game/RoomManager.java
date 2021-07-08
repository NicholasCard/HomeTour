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
	private Room startingRoom; //room the player starts in
	
	private Room[] rooms; 
	
	/*
	 * have to build the room constructor so it takes 
	 * -shortDescription
	 * -longDescription
	 * -name
	 */
	
	
	//not sure what this is doing yet
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		
		
		Room livingRoom = new Room(
				"The Living Room",
				"A cozy little room for relaxing",
				"The long description that ill put here eventually" + "\n"
				);
		
		this.rooms[0] = livingRoom;
		
		Room kitchen = new Room(
				"The Kitchen",
				"room for cooking",
				"The kitchen man what more can you ask for" + "\n"
				);
		
		this.rooms[1] = kitchen;
		
		Room bedroom = new Room(
				"The Bedroom",
				"this is where i sleep",
				"this is the bedroom where i sleep and have existential crisis"
				);
		this.rooms[2] = bedroom;
		
		
		//sets the exits when moved 
		//just work with the 3 total rooms rn 
		
		//Im guessing I have to define all of the exits for each room here but that shouldnt be hard 
		
		
		
		// the nulls should be replaced with directions or what room is where but I need to define this for each room
		
		Room[] livingRoomExits = {rooms[1], rooms[2]};
		livingRoom.setExits(livingRoomExits);
		
		Room[] kitchenExits = {rooms[0], rooms[2]};
		kitchen.setExits(kitchenExits);
		// need to set the other rooms here somehow.
		//can probably just make one of these for every room and make sure I keep track of where you can back track
		
		
		//not sure why its not setting the starting room
		this.startingRoom = livingRoom;
		
		
		
		
	}
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	
}
