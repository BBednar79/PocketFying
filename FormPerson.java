public class FormPerson extends Person{
	private String phone;
	private String title;
	private String email;
	private String address;

///////////Constructors /////////////////	
	public FormPerson(){
	}
	//////////////Name, Title, Phone, Email //////////////////
	public FormPerson(String name, String title, String phone, String email ){
		super(name);
		this.title = title;
		this.phone = phone;
		this.email = email;
	}
	//////////////Name, address, phone/////////////////
	public FormPerson(String name, String address, int phone){
		super(name);
		this.address = address;
		this.phone = Integer.toString(phone);
	}
	//////////// Name, phone, email////////////////
	public FormPerson(String name, int phone, String email){
		super(name);
		this.phone = Integer.toString(phone);
		this.email = email;
	}

//////////Setters and getters/////////////
	public void setName(String name){
		super.setName(name);
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getName(){
		return super.getName();
	}
	public String getPhone(){
		return this.phone;
	}

	public String getTitle(){
		return this.title;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAddress(){
		return this.address;
	}
}