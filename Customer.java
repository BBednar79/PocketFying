import java.util.ArrayList;
public class Customer extends Person{
	private ArrayList<Form> formsList;
	private String address;
	private String phone;

	public Customer(String name,String address, String phone){
		super(name);
		this.formsList = new ArrayList<Form>();
		this.address = address;
		this.phone = phone;
	}
	public Customer() {}

	///////////Getters and setters////////////
	public String getName(){
		return super.getName();
	}

	public ArrayList <Form> getFormsList(){
		return this.formsList;
	}
	public String getAddress(){
		return this.address;
	}
	public String getPhone(){
		return this.phone;
	}

	public void setName(String name){
		super.setName(name);
	}

	public void addForms(Form form){
		this.formsList.add(form);
	}

	public void deleteForms(Form form){
		this.formsList.remove(form);
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}


}