import java.util.ArrayList;

public class SalesForm extends Form{
	private String name;
	private String date;
	private boolean[] type;
	private String[] typeNames;
	private Contact resellerPoc;
	private Internet internet;
	private Internet backupInternet;
	private Internet publicIps;
	private ManagedServices telephone;
	private WebAndHosting hosting;
	private WebAndHosting webDev;
	private WebAndHosting domainNameSvcs;
	private ManagedServices managedSvcs;
	private ManagedServices consutling;
	private ArrayList<Plan> opportunities;
	private String currentBandwidth;
	private String currentProvider;
	private String currentCharge;
	private String currentTech;
	private boolean[] checkoff;
	private String[] checkoffNames;
	private String notes;
	

/////////////Construtor////////////
	public SalesForm(){
		this.type = new boolean[8];
		this.typeNames = new String[]{"Cold Call","Walkin","Referral","Reseller","Repeat","Unk","Google","BB Now"};
		this.resellerPoc = new Contact();
		this.checkoff = new boolean[5];
		this.checkoffNames = new String[]{"Entered into TowerCoverage", "Serviceability Response","Qoute","Contract Execution","Setup Fee Resceipt"};
		this.opportunities = new ArrayList<Plan>();
	}

//////////////Setters//////////////
	public void setName(String name){
		this.name = name;
	}
	public void setDate(String date){
		this.date = date;
	}
	public void setType(boolean change,int index){
		this.type[index] = change;
	}
	public void addOpportunitiesChecked(Plan opportunity){
		this.opportunities.add(opportunity);
	}
	public void setCurrentBandwidth(String currentBandwidth){
		this.currentBandwidth=currentBandwidth;
	}
	public void setCurrentProvider(String currentProvider){
		this.currentProvider = currentProvider;
	}
	public void setCurrentCharge(String currentCharge){
		this.currentCharge = currentCharge;
	}
	public void setCurrentTech(String currentTech){
		this.currentTech = currentTech;
	}
	public void setCheckoff(boolean change, int index){
		this.checkoff[index] = change;
	}
	public void setNotes(String notes){
		this.notes = notes;
	}


///////////////Getters/////////////////
	public String getName(){
		return this.name;
	}
	public String getDate(){
		return this.date;
	}
	public boolean[] getType(){
		return this.type;
	}
	public String[] getTypeNames(){
		return this.typeNames;
	}
	public Contact getSesellerPoc(){
		return this.resellerPoc;
	}
	public ArrayList<Plan> getOpportunities(){
		return this.opportunities;
	}
	public String getCurrentProvider(){
		return this.currentProvider;
	}
	public String getCurrentCharge(){
		return this.currentCharge;
	}
	public String getCurrentTech(){
		return this.currentTech;
	}
	public boolean[] getCheckoff(){
		return this.checkoff;
	}
	public String[] getCheckoffNames(){
		return checkoffNames;
	}
	public String getNotes(){
		return this.notes;
	}
	public Contact getResellerPoc(){
		return resellerPoc;
	}
}
	