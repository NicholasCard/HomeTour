package fixtures;

public abstract class Fixture {
	
	/*
	 * Abstract class that is used for anything that is looked at or 
	 * interacted with
	 */
	/*
	 * questions that come to mind
	 * is there supposed to be a constructor in the Fixture abstract class?
	 * 	do research on this
	 * 
	 * 
	 */
	
	String name;
	String shortDescription;
	String longDescription;
//is this correct ?
	public Fixture(String name, String shortDescription, String longDescription) {
		// TODO Auto-generated constructor stub
		
		
		//do more research on why this works
		//i do really want to analyze this project and make improvements to it 
		//make time eaxh day to do that 
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		
		//this is printing all of the rooms because they are all being initialized at the same time
		
		//System.out.println(name + "\n" + shortDescription + "\n" + longDescription);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDesc() {
		return shortDescription;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDescription = shortDesc;
	}
	public String getLongDesc() {
		return longDescription;
	}
	public void setLongDesc(String longDesc) {
		this.longDescription = longDesc;
	}
	
	
	
	
}
