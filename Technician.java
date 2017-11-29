public class Technician extends Person{
	private String start;
	private String end;
	private String hrs;

	////////Constructor///////
	public Technician(String name, String start, String end, String hrs){
		super(name);
		this.start = start;
		this.end = end;
		this.hrs = hrs;
	}
	public Technician(){};

	//////Setters///////
	public void setStart(String start){
		this.start = start;
	}
	public void setEnd(String end){
		this.end = end;
	}
	public void setHrs(String hrs){
		this.hrs = hrs;
	}

	////////Getters/////////
	public String getStart(){
		return this.start;
	}
	public String getEnd(){
		return this.end;
	}
	public String getHrs(){
		return this.hrs;
	}
}