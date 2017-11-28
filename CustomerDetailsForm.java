public class CustomerDetailsForm extends Form{
	private Contact poc;
	private Contact poc2;
	private Contact poc3;
	private Contact poc4;
	private String customerNotes;
	private boolean customerOwnBuilding;
	private boolean multitenantBuilding;
	private String propertyName;
	private String buildingOwners;
	private String propertyMgmtCo;
	private Contact bulidingPoc;
	private Contact buildingPoc2;
	private String notes;

	public CustomerDetailsForm(){
		this.poc = new Contact();
		this.poc2 = new Contact();
		this.poc3 = new Contact();
		this.poc4 = new Contact();
		this.bulidingPoc = new Contact();
		this.buildingPoc2 = new Contact();
	}

	////////////Setters////////////////
	public void setCostomerNotes(String customerNotes){
		this.customerNotes = customerNotes;
	}
	public void setCustomerOwnBuilding(boolean customerOwnBuilding){
		this.customerOwnBuilding = customerOwnBuilding;
	}
	public void setMultitenantBuilding(boolean multitenantBuilding){
		this.multitenantBuilding = multitenantBuilding;
	}
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}
	public void setBuildingOwners(String buildingOwners){
		this.buildingOwners = buildingOwners;
	}
	public void setPropertyMgmtCo(String propertyMgmtCo){
		this.propertyMgmtCo = propertyMgmtCo;
	}
	public void setNotes(String notes){
		this.notes = notes;
	}
	///////////////Getters///////////////
	public String getCustomerNotes(){
		return this.customerNotes;
	}
	public boolean getCustomerOwnBuilding(){
		return this.customerOwnBuilding;
	}
	public boolean getMultitenantBuilding(){
		return this.multitenantBuilding;
	}
	public String getPropertyName(){
		return this.propertyName;
	}
	public String getBuildingOwners(){
		return this.buildingOwners;
	}
	public String getPropertyMgmtCo(){
		return this.propertyMgmtCo;
	}
	public String getNotes(){
		return this.notes;
	}
	public Contact getPoc(){
		return this.poc;
	}
	public Contact getPoc2(){
		return this.poc2;
	}
	public Contact getPoc3(){
		return this.poc3;
	}
	public Contact getPoc4(){
		return this.poc4;
	}
	public Contact getBulidingPoc(){
		return this.bulidingPoc;
	}
	public Contact getBuildingPoc2(){
		return this.buildingPoc2;
	}

}