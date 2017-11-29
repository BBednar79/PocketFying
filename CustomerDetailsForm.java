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

	////////Constructor////////////
	public CustomerDetailsForm(){
		this.poc = new Contact();
		this.poc2 = new Contact();
		this.poc3 = new Contact();
		this.poc4 = new Contact();
		this.bulidingPoc = new Contact();
		this.buildingPoc2 = new Contact();
	}

	/**
	 * @param bandwidthReq
	 * @param poc
	 * @param poc2
	 * @param poc22
	 * @param poc3
	 * @param poc4
	 * @param customerNotes
	 * @param customerOwnBuilding
	 * @param multitenantBuilding
	 * @param propertyName
	 * @param buildingOwners
	 * @param propertyMgmtCo
	 * @param bulidingPoc
	 * @param buildingPoc2
	 * @param notes
	 */
	public CustomerDetailsForm(String bandwidthReq, Contact poc, Contact poc2, Contact poc22, Contact poc3,
			Contact poc4, String customerNotes, boolean customerOwnBuilding, boolean multitenantBuilding,
			String propertyName, String buildingOwners, String propertyMgmtCo, Contact bulidingPoc,
			Contact buildingPoc2, String notes) {
		super(bandwidthReq, poc);
		poc = poc2;
		poc2 = poc22;
		this.poc3 = poc3;
		this.poc4 = poc4;
		this.customerNotes = customerNotes;
		this.customerOwnBuilding = customerOwnBuilding;
		this.multitenantBuilding = multitenantBuilding;
		this.propertyName = propertyName;
		this.buildingOwners = buildingOwners;
		this.propertyMgmtCo = propertyMgmtCo;
		this.bulidingPoc = bulidingPoc;
		this.buildingPoc2 = buildingPoc2;
		this.notes = notes;
	}

	////////////Setters////////////////
	public void setCustomerNotes(String customerNotes){
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
	public void setPoc(Contact poc) {
		this.poc = poc;
	}

	public void setPoc2(Contact poc2) {
		this.poc2 = poc2;
	}

	public void setPoc3(Contact poc3) {
		this.poc3 = poc3;
	}

	public void setPoc4(Contact poc4) {
		this.poc4 = poc4;
	}

	public void setBulidingPoc(Contact bulidingPoc) {
		this.bulidingPoc = bulidingPoc;
	}

	public void setBuildingPoc2(Contact buildingPoc2) {
		this.buildingPoc2 = buildingPoc2;
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