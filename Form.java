public abstract class Form {
	private String bandwidthReq;
	private Contact poc;

	//////////////Constructors////////////////
	/**
	 * @param bandwidthReq
	 * @param poc
	 */
	public Form(String bandwidthReq, Contact poc) {
		super();
		this.bandwidthReq = bandwidthReq;
		this.poc = poc;
	}
	public Form(String bandwidthReq) {
		this.bandwidthReq = bandwidthReq;
	}

	public Form(){
		this.poc = new Contact();
	}
	
	//////getter and setters///////////
	public void setbandwidthReq(String bandwidthreq){
		this.bandwidthReq = bandwidthreq;
	}
	public String getbandwidthReq(){
		return this.bandwidthReq;
	}
	public Contact getPoc(){
		return this.poc;
	}

}
