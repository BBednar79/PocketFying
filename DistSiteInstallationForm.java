public class DistSiteInstallationForm{
	private String date;
	private String name;
	private Technician technician;
	private Technician technician2;
	private Technician technician3;
	private Technician technician4;
	private Technician technician5;
	private Technician technician6;
	private Technician technician7;
	private Technician technician8;
	private boolean[] radioConfigChecklist;
	private String[] radioConfigChecklistNames;
	private boolean[] installChecklist;
	private String[] installChecklistNames;
	private String maximumCapacity;
	private String notes;
	
	///////////Constructor//////////////
	public DistSiteInstallationForm() {
		this.technician = new Technician();
		this.technician2 = new Technician();
		this.technician3 = new Technician();
		this.technician4 = new Technician();
		this.technician5 = new Technician();
		this.technician6 = new Technician();
		this.technician7 = new Technician();
		this.technician8 = new Technician();
		this.radioConfigChecklist = new boolean[8];
		this.radioConfigChecklistNames = new String[] {"Enable System Log","NTP Config", "SSH Port","SNMP Settings","GPS Cords","Timezone","Username/Password", "Host Name within naming PLC convention"};
		this.installChecklist = new boolean[4];
		this.installChecklistNames = new String[]{"Screenshots of Bandwidth", "Rate Limiting","Labeling Gear","Taking pictures"};
	}
	
	/**
	 * @param date
	 * @param name
	 * @param technician
	 * @param technician2
	 * @param technician3
	 * @param technician4
	 * @param technician5
	 * @param technician6
	 * @param technician7
	 * @param technician8
	 * @param radioConfigChecklist
	 * @param installChecklist
	 * @param maximumCapacity
	 * @param notes
	 */
	public DistSiteInstallationForm(String date, String name, Technician technician, Technician technician2,
			Technician technician3, Technician technician4, Technician technician5, Technician technician6,
			Technician technician7, Technician technician8, boolean[] radioConfigChecklist, boolean[] installChecklist,
			String maximumCapacity, String notes) {
		super();
		this.date = date;
		this.name = name;
		this.technician = technician;
		this.technician2 = technician2;
		this.technician3 = technician3;
		this.technician4 = technician4;
		this.technician5 = technician5;
		this.technician6 = technician6;
		this.technician7 = technician7;
		this.technician8 = technician8;
		this.radioConfigChecklist = radioConfigChecklist;
		this.installChecklist = installChecklist;
		this.maximumCapacity = maximumCapacity;
		this.notes = notes;
		this.installChecklistNames = new String[]{"Screenshots of Bandwidth", "Rate Limiting","Labeling Gear","Taking pictures"};
		this.radioConfigChecklistNames = new String[] {"Enable System Log","NTP Config", "SSH Port","SNMP Settings","GPS Cords","Timezone","Username/Password", "Host Name within naming PLC convention"};
	}

	/////////Getters//////////
	public String getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
	public Technician getTechnician() {
		return technician;
	}
	public Technician getTechnician2() {
		return technician2;
	}
	public Technician getTechnician3() {
		return technician3;
	}
	public Technician getTechnician4() {
		return technician4;
	}
	public Technician getTechnician5() {
		return technician5;
	}
	public Technician getTechnician6() {
		return technician6;
	}
	public Technician getTechnician7() {
		return technician7;
	}
	public Technician getTechnician8() {
		return technician8;
	}
	public boolean[] getRadioConfigChecklist() {
		return radioConfigChecklist;
	}
	public String[] getRadioConfigChecklistNames() {
		return radioConfigChecklistNames;
	}
	public boolean[] getInstallChecklist() {
		return installChecklist;
	}
	public String[] getInstallChecklistNames() {
		return installChecklistNames;
	}
	public String getMaximumCapacity() {
		return maximumCapacity;
	}
	public String getNotes() {
		return notes;
	}
	/////////////Settters//////////////
	public void setDate(String date) {
		this.date = date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMaximumCapacity(String maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void setRadioConfigChecklist(boolean change,int index){
		this.radioConfigChecklist[index] = change;
	}
	public void setInstallChecklist(boolean change, int index){
		this.installChecklist[index] = change;
	}
	public void setTechnician(Technician technician) {
		this.technician = technician;
	}
	public void setTechnician2(Technician technician2) {
		this.technician2 = technician2;
	}
	public void setTechnician3(Technician technician3) {
		this.technician3 = technician3;
	}
	public void setTechnician4(Technician technician4) {
		this.technician4 = technician4;
	}
	public void setTechnician5(Technician technician5) {
		this.technician5 = technician5;
	}
	public void setTechnician6(Technician technician6) {
		this.technician6 = technician6;
	}
	public void setTechnician7(Technician technician7) {
		this.technician7 = technician7;
	}
	public void setTechnician8(Technician technician8) {
		this.technician8 = technician8;
	}
	public void setRadioConfigChecklist(boolean[] radioConfigChecklist) {
		this.radioConfigChecklist = radioConfigChecklist;
	}
	public void setInstallChecklist(boolean[] installChecklist) {
		this.installChecklist = installChecklist;
	}
}
