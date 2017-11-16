package packetlayer;

import java.util.ArrayList;

import packetlayer.entities.Customer;

public interface Input {
	ArrayList<Customer> searchCustomer(String name);
	Customer getCustomer(String name); 
	void updateDatabase(Customer customer);
	boolean verifyUsername(String username);
	boolean verifyPassword(String password);
}
