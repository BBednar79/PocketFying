import java.util.ArrayList;

public class Customer {
	
	private ArrayList<Form> forms;
	private String name;
	private String email;
	
	public Customer(String name, String email){
		this.name = name;
		this.email = email;
		this.forms = new ArrayList<Form>();
	}
	
	
	public ArrayList<Form> getCustomerForms(){
		return this.forms;
	}
}
