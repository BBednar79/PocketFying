public class DistSiteInstallation{
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
	private boolean[] installChecklistNames;
	private String maximumCapacity;
	private String notes;
	
	public DistSiteInstallation() {
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
	public boolean[] getInstallChecklistNames() {
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
}