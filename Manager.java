package packetlayer.controller;

import packetlayer.Input;
import packetlayer.Output;

public class Manager {
	private Input input;
	private Output output;
	
	public void setInput(Input in){
		this.input = in; //Gets Input device from MainApp.
	}
	public void setOutput(Output out){
		this.output = out; //Gets Output device from MainApp.
	}
	
	public void initialize(){
		//Initializes everything in manager.
	}
}
