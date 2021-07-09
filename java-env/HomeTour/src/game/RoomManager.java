package game;

import fixtures.Appliances;
import fixtures.Electronics;
import fixtures.Furniture;

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
				"Living Room",
				"A cozy little room for relaxing",
				"The long description that ill put here eventually" + "\n"
				);
		
		this.rooms[0] = livingRoom;
		
		Room kitchen = new Room(
				"Kitchen",
				"room for cooking",
				"The kitchen man what more can you ask for" + "\n"
				);
		
		this.rooms[1] = kitchen;
		
		Room bedroom = new Room(
				"Bedroom",
				"this is where i sleep",
				"this is the bedroom where i sleep and have existential crisis"
				);
		this.rooms[2] = bedroom;
		
		
		//sets the exits when moved 
		//just work with the 3 total rooms rn 
		
		//Im guessing I have to define all of the exits for each room here but that shouldnt be hard 
		
		
		
		// the nulls should be replaced with directions or what room is where but I need to define this for each room
		
		Room[] livingRoomExits = {kitchen, bedroom};
		livingRoom.setExits(livingRoomExits);
		
		Room[] kitchenExits = {livingRoom, bedroom};
		kitchen.setExits(kitchenExits);
		
		Room[] bedroomExits = {livingRoom, kitchen};
		bedroom.setExits(bedroomExits);
		// need to set the other rooms here somehow.
		//can probably just make one of these for every room and make sure I keep track of where you can back track
		
		
		// i want to have better objects primarily drawers 
		//also would be cool to add dnd checks to investigating certain things but thats for another time
		
			Appliances refridgerator = new Appliances("Fridge", "An old 1950s Steel Fridge", "Long Description");
			Appliances minifridge = new Appliances("MiniFridge", "Tiny coke MiniFridge", "Always stocked with coke a cola and jack");
			
			
			Furniture couch = new Furniture("Couch", "A nice suede couch", "fairly uncomfortable for no reason besides it fits the aestatic");
			Furniture recliner = new Furniture("Recliner", "A rather comfy recliner", "A comfy elegent looking recliner that always has a minifridge stocked beside it");
			Furniture bed = new Furniture("Bed", "Just a bed", "this is where I have all of my existential crisis");
			
			Electronics tv = new Electronics("Flat Screen TV", "has finger prints on the screen", "has a remote lying around somewhere");
			
			
			kitchen.setItems(refridgerator);
			livingRoom.setItems(minifridge, couch, recliner, tv);
			bedroom.setItems(bed);
		
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
