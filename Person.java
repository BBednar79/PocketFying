
//package packetlayer.entities;

public abstract class Person {
	
	private String name;
	

	///Constructors
	public Person(String name){
		this.name = name;
	}

	public Person(){
	}

	////Setter and getters
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}