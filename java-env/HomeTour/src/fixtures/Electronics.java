package fixtures;



	public class Electronics extends Fixture implements Interactable{

		public Electronics(String name, String shortDescription, String longDescription) {
			super(name, shortDescription, longDescription);
			
			
		}
		
		public void onOff() {
			
			//allows electronics to be switched on and off
			//need to research the true false statements here but want to have electronic objects have 
			//a state of on and off
		}

		public void interact() {
			
		
		}
		
		
	}

