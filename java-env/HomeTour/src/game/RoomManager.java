package game;

import fixtures.Appliances;
import fixtures.Electronics;
import fixtures.Furniture;
import fixtures.PickUpAbles;
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
		
		
		Room parlor = new Room(
				"Parlor",
				"A cozy little room for relaxing",
				"You enter the house and see the parlor as its main attraction. The parlor itself seems very neat like people kept it clean for their guests" + "\n"
				);
		
		this.rooms[0] = parlor;
		
		Room kitchen = new Room(
				"Kitchen",
				"room for cooking",
				"The kitchen which is not as clean as the parlor almost as if house guests were never expected to go in here" + "\n"
				);
		
		this.rooms[1] = kitchen;
		
		Room bedroom = new Room(
				"Bedroom",
				"this is where im going to sleep",
				"Bedroom seems normal enough almost like its a gues room"
				);
		this.rooms[2] = bedroom;
		
		Room dining = new Room(
				"Dining",
				"Where you eat food on the table ",
				"This is the dining room. Where all come to eat and talk."
				);
		this.rooms[3] = dining;
		
		Room stairs = new Room(
				"Stairs",
				"The vehicle used to go up a floor ",
				"They were normal stairs that allow you to go up to the next floor of the house. You cant see all the way up. Even with the lights on"
				);
		this.rooms[4] = stairs;
		
		Room hallway = new Room(
				"Hallway",
				"An upstairs corridoor",
				"Once you go upstairs you are greeted with this fairly narrow hallway with dimly lit lights that hung from the cieling. You only see doors to 2 other rooms."
				);
		this.rooms[5] = hallway;
		
		Room bedroom2 = new Room(
				"Bedroom2",
				"the right side bedroom",
				"This particular bedroom has white walls with a bed right in the middle and a couple of books lying around on the floor"
				);
		this.rooms[6] = bedroom2;
		
		Room bedroom3 = new Room(
				"Bedroom3",
				"The left side bedroom",
				"This particular bedroom has black walls with no bed and a couple of books lying around on the floor. A dresser has been toppled over but no clothes seem to be in it"
				);
		this.rooms[7] = bedroom3;
		
		Room bathroom1 = new Room(
				"Bathroom",
				"Just a bathroom",
				"A bathroom thats very well kept with a cabinet. All that you would expect from a little bathroom"
				);
		this.rooms[8] = bathroom1;
		//sets the exits when moved 
		//just work with the 3 total rooms rn 
		
		//Im guessing I have to define all of the exits for each room here but that shouldnt be hard 
		
		
		
		// the nulls should be replaced with directions or what room is where but I need to define this for each room
		
		Room[] parlorExits = {kitchen, bedroom, stairs, bathroom1};
		parlor.setExits(parlorExits);
		
		Room[] kitchenExits = {parlor, dining};
		kitchen.setExits(kitchenExits);
		
		Room[] bedroomExits = {parlor, kitchen};
		bedroom.setExits(bedroomExits);
		
		Room[] bedroom2Exits = {hallway};
		bedroom2.setExits(bedroom2Exits);
		
		Room[] bedroom3Exits = {hallway};
		bedroom3.setExits(bedroom3Exits);
		
		Room[] hallwayExits = {bedroom2, bedroom3, stairs};
		hallway.setExits(hallwayExits);
		
		Room[] stairsExits = {hallway, parlor};
		stairs.setExits(stairsExits);
		
		Room[] diningExits = { parlor, kitchen};
		dining.setExits(diningExits);
		
		// i want to have better objects primarily drawers 
		//also would be cool to add dnd checks to investigating certain things but thats for another time
		
			Appliances refridgerator = new Appliances("Fridge", "An old 1950s Steel Fridge", "Opening the door you see a lot of leftovers that are probably too old to eat");
			Appliances minifridge = new Appliances("MiniFridge", "Tiny coke MiniFridge", "Always stocked with coke a cola and jack");
			Appliances microwave = new Appliances("Microwave", "Dirty old microwave", "Opening the microwave you see pizza thats probably been there for weeks");
			Appliances dishwasher = new Appliances("Dishwasher", "Little tiny dishwasher", "Stacked to the brim with dishes ");
			Appliances oven = new Appliances("Oven", "Dirty Oven", "Upon inspection its clearly not been cleaned for sometime and the stove on top was charred");
			Appliances sink = new Appliances("Sink", "Normal looking sink from afar", "Upon inspection thehot knog has been nroken off and it is dripping water in a methodical fashion");
			
			Furniture couch = new Furniture("Couch", "A nice suede couch", "fairly uncomfortable for no reason besides it fits the aestatic");
			Furniture recliner = new Furniture("Recliner", "A rather comfy recliner", "A comfy elegent looking recliner that always has a minifridge stocked beside it");
			Furniture bed = new Furniture("Bed", "Just a bed", "seems to be one of the only normal things here");
			Furniture bed2 = new Furniture("Bed", "Just a bed", "Bed is kind of just in the middle of the room. No reason to be but there it is");
			Furniture dresser = new Furniture("Dresser", "A knocked over dresser", "A big dresser that seems to be empty is lying on the floor as if thrown in front of someone");
			Furniture bookshelf = new Furniture("Bookshelf", "Bookshelf with lots of books on it", "The bookshelf has a lot of books on it but all the titles on the spine were scratched off. Picking a book at random you see that all the pages are inked black");
			Furniture toilet = new Furniture("Toilet", "Its a toilet dude", "Entering the bathroom you notice that the toilet seat is up. Savages");
			Furniture table = new Furniture("Dining Room Table", "A Big dining room table", "a big dining room table that could fit up to 8 people but only one chair was at the opposite end");
			Furniture nightstand = new Furniture("Night stand", "A little night stand", "a little night stand with a book and a lamp on it");
			Furniture steps = new Furniture("Steps", "The steps leading up to the second floor", "The wooden steps are very scratched up almost as if someone was dragged up them");
			
			Electronics tv = new Electronics("Flat Screen TV", "has finger prints on the screen", "has a remote lying around somewhere");
			Electronics phone = new Electronics("Phone", "an old  phone", "Looking around on the walls you spot a phone hanging from the wall by its cord and no busy tone");
			Electronics lamp = new Electronics("Lamp", "Still hot", "Inspecting the lamp you see that it is off but still hot. I thought I was alone in here");
			Electronics lights = new Electronics("Hallway Lights", "Rustic looking hallway lights", "Rustic Hallway lights that line the hallway all the way down every 5 feet and you still cant see the end of the hallway");
			
			PickUpAbles nightstandBook = new PickUpAbles("Nightstand Book", "A book on the nightstand", "Picking up the book you realize that the title on the binding is scratched up and when you go to read a page you notice that all of the pages are blacked out");
			PickUpAbles book = new PickUpAbles("Book", "A book on the nightstand", "Picking up the book you realize that the title on the binding is scratched up and when you go to read a page you notice that all of the pages are blacked out");
			
			
			kitchen.setItems(refridgerator, oven, microwave, dishwasher);
			parlor.setItems(minifridge, couch, recliner, tv, phone);
			bedroom.setItems(bed, bookshelf, nightstand, lamp, nightstandBook);
			bedroom2.setItems(bed2, book);
			bedroom3.setItems(dresser);
			bathroom1.setItems(toilet, sink);
			hallway.setItems(lights);
			dining.setItems(table);
			stairs.setItems(steps);
		
		this.startingRoom = parlor;
		
		
		
		
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
