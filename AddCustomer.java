package desktopgui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import packetlayer.entities.Customer;

public class AddCustomer extends JFrame{
	private Customer customer;
	
	public AddCustomer(int x,int y,int width,int height){
		super("Add Customer");
		setLocation(x, y);
		setSize(width, height);
		JPanel panel = new JPanel();
		panel.setLayout (null); 
		
	}
	
	public Customer getCustomer(){
		return customer;
	}
}
