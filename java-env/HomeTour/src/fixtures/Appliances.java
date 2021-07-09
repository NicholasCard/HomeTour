package fixtures;

public class Appliances extends Fixture implements Interactable{

	public Appliances(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		//not sure what else to add here except that interactable is just always a thing? 
		//no appliances should be not interactable?
		
	}

	public void interact() {
		//need to figure out how to implement this method correctly 
		//joseph had an example or 2 but well leave this blank for now
		//could just be a true or false thing but we'll see
	
	}
	
	
}
