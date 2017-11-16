package packetlayer;

import java.util.ArrayList;

import packetlayer.entities.Customer;

public class Data implements Input{
	
	public Customer getCustomer(String name){
		return new Customer(name, name);
	}

	@Override
	public ArrayList<Customer> searchCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDatabase(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyUsername(String username) {
		for 
		if(username == realUser){
			return true;
		}else{
			returnn false;
		}
	}

	@Override
	public boolean verifyPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
