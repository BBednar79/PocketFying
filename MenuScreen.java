package desktopgui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import packetlayer.entities.Customer;

public class MenuScreen extends JPanel{
	public ArrayList<Customer> customers;
	JButton addCustomerButton;
	JTextField searchBar;
	TextPrompt searchPrompt;
	
	public MenuScreen(){
		this.setLayout(null);
		addCustomerButton = new JButton("Add Customer");
		searchBar = new JTextField(15);
		searchPrompt = new TextPrompt("Search", searchBar);
		searchPrompt.changeAlpha(0.5f);
		this.add(addCustomerButton);
		this.add(searchBar);
	}
	
	public void setButtonBounds(int x, int y, int width, int height){
		addCustomerButton.setBounds(x, y, width, height);
	}
	public void setSearchBarBounds(int x, int y, int width, int height){
		searchBar.setBounds(x, y, width, height);
	}
	public void setButtonFont(int size){
		addCustomerButton.setFont(new Font("Button", Font.PLAIN, size));
	}
	public void setUsernameFont(int size){
		searchBar.setFont(new Font("Search Bar", Font.PLAIN, size));
		searchPrompt.setFont(new Font("Search", Font.PLAIN, size));
	}
	
	
	
	public void addCustomer(){
		AddCustomer addCustomer = new AddCustomer(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
	
	public void addButtonListener(JFrame a){
		addCustomerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				addCustomer();
			}
		});
	}
}
