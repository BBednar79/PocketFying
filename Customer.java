package packetlayer.entities;

public class Customer {
	
	private Form[] forms = new Form[8];
	
	public Customer(){
	//Forms should probably be created here.
	}
	
	
	public Form[] getForms(){
		return forms;
	}
}
