public abstract class Plan {
	private String details;
	private String name;
	private int maxCost;
 	private int minCost;
 	private boolean isMonthly;

	public Plan(String name, String details, int maxCost, int minCost, boolean isMonthly){
		this.name = name;
		this.details = details;
		this.maxCost= maxCost;
 		this.minCost = minCost;
 		this.isMonthly = isMonthly;
	}
	public Plan(){
		
	}

	//////////////Setters///////////////
	public void setDetails(String details){
		this.details=details;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMaxCost(int maxCost){
 		this.maxCost=maxCost;
 	}
 	public void setMinCost(int minCost){
 		this.minCost = minCost;
 	}
 	public void setIsMonthly(boolean isMonthly){
 		this.isMonthly=isMonthly;
 	}
 	///////////////Getters///////////////
	public String getName(){
		return this.name;
	}
	public String getDetails(){
		return this.details;
	}
	public int getMaxCost(){
 		return this.maxCost;
 	}
 	public int getMinCost(){
 		return this.minCost;
 	}
 	public boolean getIsMonthly(){
 		return this.isMonthly;
 	}
}