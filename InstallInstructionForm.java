public class InstallInstructionForm extends Form{
	private String installDueDate;
	private String installDate;
	private String installTime;
	private String installersNeeded;
	private String ipAddressesNeeded;
	private String bandwidth;
	private String customerPublicIpRange;
	private String vlan;
	private String publicIpGatway;
	private String publicIpSubnetMask;
	private String cpePrivateAddress;
	private String accessPointIp;
	private String apSubnetMask;
	private String apGateway;
	private Contact technicalPoc;
	private Contact facilityAccessPoc;
	private String suppliesNeeded;
	private String additionalInstructions;
	
	//////////
	public InstallInstructionForm() {
		this.technicalPoc = new Contact();
		this.facilityAccessPoc = new Contact();
	}

	///////////Setters and getters/////////////
	
	public String getInstallDueDate() {
		return installDueDate;
	}
	public void setInstallDueDate(String installDueDate) {
		this.installDueDate = installDueDate;
	}
	public String getInstallDate() {
		return installDate;
	}
	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}
	public String getInstallTime() {
		return installTime;
	}
	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}
	public String getInstallersNeeded() {
		return installersNeeded;
	}
	public void setInstallersNeeded(String installersNeeded) {
		this.installersNeeded = installersNeeded;
	}
	public String getIpAddressesNeeded() {
		return ipAddressesNeeded;
	}
	public void setIpAddressesNeeded(String ipAddressesNeeded) {
		this.ipAddressesNeeded = ipAddressesNeeded;
	}
	public String getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}
	public String getCustomerPublicIpRange() {
		return customerPublicIpRange;
	}
	public void setCustomerPublicIpRange(String customerPublicIpRange) {
		this.customerPublicIpRange = customerPublicIpRange;
	}
	public String getVlan() {
		return vlan;
	}
	public void setVlan(String vlan) {
		this.vlan = vlan;
	}
	public String getPublicIpGatway() {
		return publicIpGatway;
	}
	public void setPublicIpGatway(String publicIpGatway) {
		this.publicIpGatway = publicIpGatway;
	}
	public String getPublicIpSubnetMask() {
		return publicIpSubnetMask;
	}
	public void setPublicIpSubnetMask(String publicIpSubnetMask) {
		this.publicIpSubnetMask = publicIpSubnetMask;
	}
	public String getCpePrivateAddress() {
		return cpePrivateAddress;
	}
	public void setCpePrivateAddress(String cpePrivateAddress) {
		this.cpePrivateAddress = cpePrivateAddress;
	}
	public String getAccessPointIp() {
		return accessPointIp;
	}
	public void setAccessPointIp(String accessPointIp) {
		this.accessPointIp = accessPointIp;
	}
	public String getApSubnetMask() {
		return apSubnetMask;
	}
	public void setApSubnetMask(String apSubnetMask) {
		this.apSubnetMask = apSubnetMask;
	}
	public String getApGateway() {
		return apGateway;
	}
	public void setApGateway(String apGateway) {
		this.apGateway = apGateway;
	}
	public Contact getTechnicalPoc() {
		return technicalPoc;
	}
	public void setTechnicalPoc(Contact technicalPoc) {
		this.technicalPoc = technicalPoc;
	}
	public Contact getFacilityAccessPoc() {
		return facilityAccessPoc;
	}
	public void setFacilityAccessPoc(Contact facilityAccessPoc) {
		this.facilityAccessPoc = facilityAccessPoc;
	}
	public String getSuppliesNeeded() {
		return suppliesNeeded;
	}
	public void setSuppliesNeeded(String suppliesNeeded) {
		this.suppliesNeeded = suppliesNeeded;
	}
	public String getAdditionalInstructions() {
		return additionalInstructions;
	}
	public void setAdditionalInstructions(String additionalInstructions) {
		this.additionalInstructions = additionalInstructions;
	}
	

}