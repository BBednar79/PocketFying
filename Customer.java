import java.util.ArrayList;
public class Customer extends Person{
	private ArrayList<Form> formsList;

	public Customer(String name){
		super(name);
		this.formsList = new ArrayList<Form>();
	}

	///////////Getters and setters////////////
	public String getName(){
		return super.getName();
	}

	public ArrayList <Form> getFormsList(){
		return this.formsList;
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

}