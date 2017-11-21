

public abstract class Form {
	private String bandwidthreq;
	private String ipAmount;
	private Contact poc;

	public Form(){
		this.poc = new Contact();
	}
	//////getter and setters///////////
	public void setbandwidthReq(String bandwidthreq){
		this.bandwidthreq = bandwidthreq;
	}
	public void setIpAmount(String ipAmount){
		this.ipAmount = ipAmount;
	}
	public String getbandwidthReq(){
		return this.bandwidthreq;
	}
	public String getIpAmount(){
		return this.ipAmount;
	}
	public Contact getPoc(){
		return this.poc;
	}

}
