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
	
	//////////Construtor/////////////
	public InstallInstructionForm() {
		this.technicalPoc = new Contact();
		this.facilityAccessPoc = new Contact();
	}
	

	/**
	 * @param bandwidthReq
	 * @param poc
	 * @param installDueDate
	 * @param installDate
	 * @param installTime
	 * @param installersNeeded
	 * @param ipAddressesNeeded
	 * @param bandwidth
	 * @param customerPublicIpRange
	 * @param vlan
	 * @param publicIpGatway
	 * @param publicIpSubnetMask
	 * @param cpePrivateAddress
	 * @param accessPointIp
	 * @param apSubnetMask
	 * @param apGateway
	 * @param technicalPoc
	 * @param facilityAccessPoc
	 * @param suppliesNeeded
	 * @param additionalInstructions
	 */
	public InstallInstructionForm(String bandwidthReq, Contact poc, String installDueDate, String installDate,
			String installTime, String installersNeeded, String ipAddressesNeeded, String bandwidth,
			String customerPublicIpRange, String vlan, String publicIpGatway, String publicIpSubnetMask,
			String cpePrivateAddress, String accessPointIp, String apSubnetMask, String apGateway, Contact technicalPoc,
			Contact facilityAccessPoc, String suppliesNeeded, String additionalInstructions) {
		super(bandwidthReq, poc);
		this.installDueDate = installDueDate;
		this.installDate = installDate;
		this.installTime = installTime;
		this.installersNeeded = installersNeeded;
		this.ipAddressesNeeded = ipAddressesNeeded;
		this.bandwidth = bandwidth;
		this.customerPublicIpRange = customerPublicIpRange;
		this.vlan = vlan;
		this.publicIpGatway = publicIpGatway;
		this.publicIpSubnetMask = publicIpSubnetMask;
		this.cpePrivateAddress = cpePrivateAddress;
		this.accessPointIp = accessPointIp;
		this.apSubnetMask = apSubnetMask;
		this.apGateway = apGateway;
		this.technicalPoc = technicalPoc;
		this.facilityAccessPoc = facilityAccessPoc;
		this.suppliesNeeded = suppliesNeeded;
		this.additionalInstructions = additionalInstructions;
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