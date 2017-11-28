public class PlottingForm extends Form{
	private String salesperson;
	private static final int YES = 0;
	private static final int NODISTRIBUTIONPOINT = 1;
	private static final int TOPOLOGY = 2;
	private static final int TREES = 3;
	private static final int OTHER = 4;
	private static final int MAYBE = 5;
	private int hitByInfrastructure;
	private String disSite;
	private boolean[] survey;
	private String[] surveyNames;
	private String numPeopleSurvey;
	private String txRadio;
	private String rxRadio;
	private boolean isFedByExistingSector;
	private String expectedMaxThroughput;
	private String expectedRSSI;
	private String partsList;
	private String notes;
	private String estimDistInstallLabor;
	private String estimCPEInstallLabor;

	public PlottingForm(){
		this.survey = new boolean[2];
		this.surveyNames = new String[] {"Onsite survey", "Radio survey"};
	}

	////////////////Setters//////////////////
	public void setSalesPerson(String saleperson){
		this.salesperson = salesperson;
	}
	public void setHitByInfrastructure(int choice){
		this.hitByInfrastructure = choice;
	}
	public void setDisSite(String disSite){
		this.disSite = disSite;
	}
	public void setSurvey(boolean change, int index){
		this.survey[index] = change;
		}
	public void setNumPeopleSurvey(String numPeopleSurvey){
		this.numPeopleSurvey = numPeopleSurvey;
	}
	public void setTxRadio(String txRadio){
		this.txRadio = txRadio;
	}
	public void setRxRadio(String rxRadio){
		this.rxRadio = rxRadio;
	}
	public void setIsFedByExistingSector(boolean isFedByExistingSector){
		this.isFedByExistingSector = isFedByExistingSector;
	}
	public void setExpectedMaxThroughput(String expectedMaxThroughput){
		this.expectedMaxThroughput = expectedMaxThroughput;
	}
	public void setExpectedRSSI(String expectedRSSI){
		this.expectedRSSI = expectedRSSI;
	}
	public void setPartsList(String partsList){
		this.partsList = partsList;
	}
	public void setNotes(String notes){
		this.notes =notes;
	}
	public void setEstimDistInstallLabor(String estimDistInstallLabor){
		this.estimDistInstallLabor = estimDistInstallLabor;
	}
	public void estimCPEInstallLabor(String estimCPEInstallLabor){
		this.estimCPEInstallLabor = estimCPEInstallLabor;
	}

	///////////////Getters//////////////////////
	public String getSalesperson(){
		return this.salesperson;
	}
	public int getHitByInfrastructure(){
		return this.hitByInfrastructure;
	}
	public String getDisSite(){
		return this.disSite;
	}
	public boolean[] getSurvey(){
		return this.survey;
	}
	public String[] getSurveyNames(){
		return this.surveyNames;
	}
	public String getNumPeopleSurvey(){
		return this.numPeopleSurvey;
	}
	public String getTxRadio(){
		return this.txRadio;
	}
	public String getRxRadio(){
		return this.rxRadio;
	}
	public boolean getFedByExistingSector(){
		return this.isFedByExistingSector;
	}
	public String getExpectedMaxThroughput(){
		return this.expectedMaxThroughput;
	}
	public String getExpectedRSSI(){
		return this.expectedRSSI;
	}
	public String getPartsList(){
		return this.partsList;
	}
	public String getNotes(){
		return this.notes;
	}
	public String getEstimDistInstallLabor(){
		return this.estimDistInstallLabor;
	}
	public String getEstimCPEInstallLabor(){
		return this.estimCPEInstallLabor;
	}

}

