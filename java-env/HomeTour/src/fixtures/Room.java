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
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription); //what is this class calling to?
		//this.exits = new Room[?]; //size is my choice based on rooms
	}
	
	public Room exits;
	
	//public  Room[] getExits() {
		
	//}
	
	//public Room getExit(String direction) {
		
	//}
}
