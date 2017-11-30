package packetlayer.controller;

import java.util.ArrayList;

import packetlayer.Input;
import packetlayer.Output;
import packetlayer.entities.Customer;

public class Manager {
	private Input input;
	private Output output;
	
	public void setInput(Input in){
		this.input = in; //Gets Input device from MainApp.
	}
	public void setOutput(Output out){
		this.output = out; //Gets Output device from MainApp.
	}
	
	public ArrayList<Customer> searchCustomer(String name){
		return input.searchCustomer(name);
	}
	
	public void initialize(){
		//Initializes everything.
	}
}
