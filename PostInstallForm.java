
public class PostInstallForm {
	private String customerPublicIpAddressRange;
	private String defaultGateway;
	private String subnetMask;
	private boolean[] engineeringPostInstallChecklist;
	private String[] engineeringPostInstallChecklistNames;
	private boolean[] operationsPostInstallChecklist;
	private String[] operationsPostInstallChecklistNames;
	private boolean[] accountingPostInstallChecklist;
	private String[] accountingPostInstallChecklistNames;
	private boolean[] salesPostInstallChecklist;
	private String[] salesPostInstallChecklistNames;

	//////////////Constructor//////////
	public PostInstallForm(){
		this.engineeringPostInstallChecklist = new boolean[2];
		this.engineeringPostInstallChecklistNames = new String[]{"Customer added to Cacti","Added tp IPAM"};
		this.operationsPostInstallChecklist = new boolean[4];
		this.operationsPostInstallChecklistNames = new String[]{"FCC Form 477 Updated", "Email Distribution List updated","Org. and contacts in ticketing system","Updated Dist. Site Contact List"};
		this.accountingPostInstallChecklist = new boolean[6];
		this.accountingPostInstallChecklistNames = new String[]{"Customer billed","Customer Bandwidth Sheet Updated","Updated Reseller Payables","Paper Contract Filed","Update Sales Report Speadsheet","Updated Dist. Site Payables"};
		this.salesPostInstallChecklist = new boolean[5];
		this.salesPostInstallChecklistNames = new String[]{"Customer Maps updated","Satisfaction Survey Sent","IP Address Info Sheet Sent","Added contacts to Linkedln","Service Commencement Letter Sent"};
	}
	
	/**
	 * @param customerPublicIpAddressRange
	 * @param defaultGateway
	 * @param subnetMask
	 * @param engineeringPostInstallChecklist
	 * @param operationsPostInstallChecklist
	 * @param accountingPostInstallChecklist
	 * @param salesPostInstallChecklist
	 */
	public PostInstallForm(String customerPublicIpAddressRange, String defaultGateway, String subnetMask,
			boolean[] engineeringPostInstallChecklist, boolean[] operationsPostInstallChecklist,
			boolean[] accountingPostInstallChecklist, boolean[] salesPostInstallChecklist) {
		super();
		this.customerPublicIpAddressRange = customerPublicIpAddressRange;
		this.defaultGateway = defaultGateway;
		this.subnetMask = subnetMask;
		this.engineeringPostInstallChecklist = engineeringPostInstallChecklist;
		this.operationsPostInstallChecklist = operationsPostInstallChecklist;
		this.accountingPostInstallChecklist = accountingPostInstallChecklist;
		this.salesPostInstallChecklist = salesPostInstallChecklist;
		this.engineeringPostInstallChecklistNames = new String[]{"Customer added to Cacti","Added tp IPAM"};
		this.operationsPostInstallChecklistNames = new String[]{"FCC Form 477 Updated", "Email Distribution List updated","Org. and contacts in ticketing system","Updated Dist. Site Contact List"};
		this.accountingPostInstallChecklistNames = new String[]{"Customer billed","Customer Bandwidth Sheet Updated","Updated Reseller Payables","Paper Contract Filed","Update Sales Report Speadsheet","Updated Dist. Site Payables"};
		this.salesPostInstallChecklistNames = new String[]{"Customer Maps updated","Satisfaction Survey Sent","IP Address Info Sheet Sent","Added contacts to Linkedln","Service Commencement Letter Sent"};
	}

	///////////Getters///////////////

	public String getCustomerPublicIpAddressRange() {
		return customerPublicIpAddressRange;
	}


	public String getDefaultGateway() {
		return defaultGateway;
	}


	public String getSubnetMask() {
		return subnetMask;
	}


	public boolean[] getEngineeringPostInstallChecklist() {
		return engineeringPostInstallChecklist;
	}


	public String[] getEngineeringPostInstallChecklistNames() {
		return engineeringPostInstallChecklistNames;
	}


	public boolean[] getOperationsPostInstallChecklist() {
		return operationsPostInstallChecklist;
	}


	public String[] getOperationsPostInstallChecklistNames() {
		return operationsPostInstallChecklistNames;
	}


	public boolean[] getAccountingPostInstallChecklist() {
		return accountingPostInstallChecklist;
	}


	public String[] getAccountingPostInstallChecklistNames() {
		return accountingPostInstallChecklistNames;
	}


	public boolean[] getSalesPostInstallChecklist() {
		return salesPostInstallChecklist;
	}


	public String[] getSalesPostInstallChecklistNames() {
		return salesPostInstallChecklistNames;
	}

	//////////////Setters//////////////////
	public void setCustomerPublicIpAddressRange(String customerPublicIpAddressRange) {
		this.customerPublicIpAddressRange = customerPublicIpAddressRange;
	}

	public void setDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	public void setSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
	}
	public void setEngineeringPostInstallChecklist(boolean change, int index){
		this.engineeringPostInstallChecklist[index] = change;
	}
	public void setOperationsPostInstallChecklist(boolean change, int index){
		this.operationsPostInstallChecklist[index]= change;
	}
	public void setAccountingPostInstallChecklist(boolean change, int index){
		this.accountingPostInstallChecklist[index] = change;
	}
	public void setSalesPostInstallChecklist(boolean change, int index){
		this.salesPostInstallChecklist[index] = change;
	}

	public void setEngineeringPostInstallChecklist(boolean[] engineeringPostInstallChecklist) {
		this.engineeringPostInstallChecklist = engineeringPostInstallChecklist;
	}

	public void setOperationsPostInstallChecklist(boolean[] operationsPostInstallChecklist) {
		this.operationsPostInstallChecklist = operationsPostInstallChecklist;
	}

	public void setAccountingPostInstallChecklist(boolean[] accountingPostInstallChecklist) {
		this.accountingPostInstallChecklist = accountingPostInstallChecklist;
	}

	public void setSalesPostInstallChecklist(boolean[] salesPostInstallChecklist) {
		this.salesPostInstallChecklist = salesPostInstallChecklist;
	}
	
}
