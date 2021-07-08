package fixtures;

public class Room extends Fixture {

	/*
	 * Represents a room in the house and inherits descriptive properties
	 * 
	 * this defines all the rooms that are adjacent to the current room
	 * 
	 * the Room class should always have a constructor that accepts a 
	 * 
	 * -name
	 * -shortDescription
	 * -longDescription
	 * 
	 * might be useful to create a getter not just for all exits but for
	 * a particular exit in a direction
	 * 
	 * 
	 */
	
	private Room[] exits = new Room[4];
	
	private Fixture[] items;
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		
		//this seems to be more of the room and what can be done while in it not where the arrays are stored
		//it is not getting all the rooms i need
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	
	public Room getExit(String direction) { 
		// TODO: Implement Method
		return null;
	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	
	
	
}
