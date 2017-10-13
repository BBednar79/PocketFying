package packetlayer.main;

import packetlayer.Input;
import packetlayer.Output;
import packetlayer.controller.*;

public class MainApp {
	
	
	
	public static void main(String[] args){
		Manager manager = new Manager();
		Input mockData; //Initializes database or mock data.
		Output mockGUI; //Initializes GUI or mock GUI.
		manager.setInput(mockData); //Sets the Input in Manager.
		manager.setOutput(mockGUI); //Sets the Output in Manager.
		manager.initialize(); //Calls Initialize method in Manager.
	}
}
