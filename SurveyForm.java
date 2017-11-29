public class SurveyForm {
	private String surveyDate;
	private String surveyTime;
	private String surveyPoc;
	private String name;
	private String date;
	private boolean isDistributionVisible;
	private DistributionPoint distributionPoint;
	private DistributionPoint distributionPoint2;
	private DistributionPoint distributionPoint3;
	private static final int SKID = 0;
	private static final int UNISTRUT = 1;
	private static final int JBRACKET = 2;
	private static final int EXISTINGPOLE = 3;
	private static final int OTHER = 4;
	private int howRadioMounted;
	private String skidSize;
	private String compostionOfAttachPoint;
	private String otherCommunicationsEquip;
	private boolean isRedistributionSite;
	private String howRoofAccessed;
	private String buildingPenetrationMethod;
	private String cableRunPath;
	private String demarcLocation;
	private String whereCPEMounted;
	private boolean[] buildingType;
	private String[] buildingTypeNames;
	private boolean[] pictureChecklist;
	private String[] pictureChecklistNames; 
	private boolean[] installationChecklist;
	private String[] installationChecklistNames;
	private String installersNeeded;
	private String notes;
	
	////////////Constructors///////////////
	public SurveyForm(){
		this.distributionPoint = new DistributionPoint();
		this.distributionPoint2 = new DistributionPoint();
		this.distributionPoint3 = new DistributionPoint();
		this.buildingType = new boolean[7];
		this.buildingTypeNames = new String[]{"Single Tenant","Multifloor","Single Story","Mutitenant","Strip mall","Warehouse","Plant"};
		this.pictureChecklist = new boolean[8];
		this.pictureChecklistNames = new String[]{"Roof","Mounting Location","Penatration Point","Cable run path","Demarc Space","CPE Mounting space","Customer Rack/Datacenter","Power Source"};
		this.installationChecklist = new boolean[29];
		this.installationChecklistNames = new String[]{"Tough Cable","Indoor Cable","Roof Skid","Rubber Mat","Cinder Blocks","Pipe","Unistrut","Unistrut Clamps","Bolts", "Self Tappers","Tapcons",
		"Coax Clamps","Zip Tiles","Anchor Zip Tiles","Wood screws","Lag Bolts","Metal Screws","Hammer Drill","Fish Sticks","Fishing tape", "Router","Switch","Power Strip","Fiber length","Fiber ends"," "," "," "," "};
	}

	

	/**
	 * @param surveyDate
	 * @param surveyTime
	 * @param surveyPoc
	 * @param name
	 * @param date
	 * @param isDistributionVisible
	 * @param distributionPoint
	 * @param distributionPoint2
	 * @param distributionPoint3
	 * @param howRadioMounted
	 * @param skidSize
	 * @param compostionOfAttachPoint
	 * @param otherCommunicationsEquip
	 * @param isRedistributionSite
	 * @param howRoofAccessed
	 * @param buildingPenetrationMethod
	 * @param cableRunPath
	 * @param demarcLocation
	 * @param whereCPEMounted
	 * @param buildingType
	 * @param pictureChecklist
	 * @param installationChecklist
	 * @param installersNeeded
	 * @param notes
	 */
	public SurveyForm(String surveyDate, String surveyTime, String surveyPoc, String name, String date,
			boolean isDistributionVisible, DistributionPoint distributionPoint, DistributionPoint distributionPoint2,
			DistributionPoint distributionPoint3, int howRadioMounted, String skidSize, String compostionOfAttachPoint,
			String otherCommunicationsEquip, boolean isRedistributionSite, String howRoofAccessed,
			String buildingPenetrationMethod, String cableRunPath, String demarcLocation, String whereCPEMounted,
			boolean[] buildingType, boolean[] pictureChecklist, boolean[] installationChecklist,
			String installersNeeded, String notes) {
		super();
		this.surveyDate = surveyDate;
		this.surveyTime = surveyTime;
		this.surveyPoc = surveyPoc;
		this.name = name;
		this.date = date;
		this.isDistributionVisible = isDistributionVisible;
		this.distributionPoint = distributionPoint;
		this.distributionPoint2 = distributionPoint2;
		this.distributionPoint3 = distributionPoint3;
		this.howRadioMounted = howRadioMounted;
		this.skidSize = skidSize;
		this.compostionOfAttachPoint = compostionOfAttachPoint;
		this.otherCommunicationsEquip = otherCommunicationsEquip;
		this.isRedistributionSite = isRedistributionSite;
		this.howRoofAccessed = howRoofAccessed;
		this.buildingPenetrationMethod = buildingPenetrationMethod;
		this.cableRunPath = cableRunPath;
		this.demarcLocation = demarcLocation;
		this.whereCPEMounted = whereCPEMounted;
		this.buildingType = buildingType;
		this.pictureChecklist = pictureChecklist;
		this.installationChecklist = installationChecklist;
		this.installersNeeded = installersNeeded;
		this.notes = notes;
		this.buildingTypeNames = new String[]{"Single Tenant","Multifloor","Single Story","Mutitenant","Strip mall","Warehouse","Plant"};
		this.pictureChecklistNames = new String[]{"Roof","Mounting Location","Penatration Point","Cable run path","Demarc Space","CPE Mounting space","Customer Rack/Datacenter","Power Source"};
		this.installationChecklistNames = new String[]{"Tough Cable","Indoor Cable","Roof Skid","Rubber Mat","Cinder Blocks","Pipe","Unistrut","Unistrut Clamps","Bolts", "Self Tappers","Tapcons",
		"Coax Clamps","Zip Tiles","Anchor Zip Tiles","Wood screws","Lag Bolts","Metal Screws","Hammer Drill","Fish Sticks","Fishing tape", "Router","Switch","Power Strip","Fiber length","Fiber ends"," "," "," "," "};
	}



	////////////Getters///////////
	public String getSurveyDate() {
		return surveyDate;
	}
	public String getSurveyTime() {
		return surveyTime;
	}
	public String getSurveyPoc() {
		return surveyPoc;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public boolean isDistributionVisible() {
		return isDistributionVisible;
	}
	public DistributionPoint getDistributionPoint() {
		return distributionPoint;
	}
	public DistributionPoint getDistributionPoint2() {
		return distributionPoint2;
	}
	public DistributionPoint getDistributionPoint3() {
		return distributionPoint3;
	}
	public int getHowRadioMounted() {
		return howRadioMounted;
	}
	public String getSkidSize() {
		return skidSize;
	}
	public String getCompostionOfAttachPoint() {
		return compostionOfAttachPoint;
	}
	public String getOtherCommunicationsEquip() {
		return otherCommunicationsEquip;
	}
	public boolean isRedistributionSite() {
		return isRedistributionSite;
	}
	public String getHowRoofAccessed() {
		return howRoofAccessed;
	}
	public String getBuildingPenetrationMethod() {
		return buildingPenetrationMethod;
	}
	public String getCableRunPath() {
		return cableRunPath;
	}
	public String getDemarcLocation() {
		return demarcLocation;
	}
	public String getWhereCPEMounted() {
		return whereCPEMounted;
	}
	public boolean[] getBuildingType() {
		return buildingType;
	}
	public String[] getBuildingTypeNames() {
		return buildingTypeNames;
	}
	public boolean[] getPictureChecklist(){
		return pictureChecklist;
	}
	public String[] getPictureChecklistNames(){
		return this.pictureChecklistNames;
	}
	public boolean[] getInstallationChecklist() {
		return installationChecklist;
	}
	public String[] getInstallationChecklistNames() {
		return installationChecklistNames;
	}
	public String getInstallersNeeded() {
		return installersNeeded;
	}
	public String getNotes() {
		return notes;
	}
	
	///////////////Setters////////////////
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}
	public void setSurveyTime(String surveyTime) {
		this.surveyTime = surveyTime;
	}
	public void setSurveyPoc(String surveyPoc) {
		this.surveyPoc = surveyPoc;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDistributionVisible(boolean isDistributionVisible) {
		this.isDistributionVisible = isDistributionVisible;
	}
	public void setDistributionPoint(DistributionPoint distributionPoint) {
		this.distributionPoint = distributionPoint;
	}
	public void setDistributionPoint2(DistributionPoint distributionPoint2) {
		this.distributionPoint2 = distributionPoint2;
	}
	public void setDistributionPoint3(DistributionPoint distributionPoint3) {
		this.distributionPoint3 = distributionPoint3;
	}
	public void setHowRadioMounted(int howRadioMounted) {
		this.howRadioMounted = howRadioMounted;
	}
	public void setSkidSize(String skidSize) {
		this.skidSize = skidSize;
	}
	public void setCompostionOfAttachPoint(String compostionOfAttachPoint) {
		this.compostionOfAttachPoint = compostionOfAttachPoint;
	}
	public void setOtherCommunicationsEquip(String otherCommunicationsEquip) {
		this.otherCommunicationsEquip = otherCommunicationsEquip;
	}
	public void setRedistributionSite(boolean isRedistributionSite) {
		this.isRedistributionSite = isRedistributionSite;
	}
	public void setHowRoofAccessed(String howRoofAccessed) {
		this.howRoofAccessed = howRoofAccessed;
	}
	public void setBuildingPenetrationMethod(String buildingPenetrationMethod) {
		this.buildingPenetrationMethod = buildingPenetrationMethod;
	}
	public void setCableRunPath(String cableRunPath) {
		this.cableRunPath = cableRunPath;
	}
	public void setDemarcLocation(String demarcLocation) {
		this.demarcLocation = demarcLocation;
	}
	public void setWhereCPEMounted(String whereCPEMounted) {
		this.whereCPEMounted = whereCPEMounted;
	}
	public void setInstallersNeeded(String installersNeeded) {
		this.installersNeeded = installersNeeded;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void setBuildingType(boolean change, int index){
		this.buildingType[index] = change;
	}
	public void setInstallationChecklist(boolean change, int index){
		this.installationChecklist[index] = change;
	}
	public void setInstallationChecklistNames(String change, int index){
		this.installationChecklistNames[index] = change;
	}
	public void setPictureChecklist(boolean change, int index){
		this.pictureChecklist[index] = change;
	}

	public void setBuildingType(boolean[] buildingType) {
		this.buildingType = buildingType;
	}

	public void setPictureChecklist(boolean[] pictureChecklist) {
		this.pictureChecklist = pictureChecklist;
	}

	public void setInstallationChecklist(boolean[] installationChecklist) {
		this.installationChecklist = installationChecklist;
	}
	
}