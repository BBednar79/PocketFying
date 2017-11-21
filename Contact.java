public class Contact extends Person{
	private String phone;
	private String title;
	private String email;
	private String address;
	private String resellerFee;

///////////Constructors /////////////////	
	public Contact(){
	}
	//////////////Name, Title, Phone, Email //////////////////
	public Contact(String name, String title, String phone, String email ){
		super(name);
		this.title = title;
		this.phone = phone;
		this.email = email;
	}
	//////////////Name, address, phone/////////////////
	public Contact(String name, String address, int phone){
		super(name);
		this.address = address;
		this.phone = Integer.toString(phone);
	}
	//////////// Name, phone, email////////////////
	public Contact(String name, int phone, String email){
		super(name);
		this.phone = Integer.toString(phone);
		this.email = email;
	}
	public Contact(String name, int phone, String email, String resellerFee){
		super(name);
		this.phone = Integer.toString(phone);
		this.email = email;
		this.resellerFee = resellerFee;
	}

/////////////////Setters///////////////////
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
	public void setResellerFee(String resellerFee){
		this.resellerFee = resellerFee;
	}
////////////////Getters//////////////////
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
	public String getResellerFee(){
		return this.resellerFee;
	}
}