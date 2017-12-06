package packetlayer;
import java.sql.*;
import java.util.ArrayList;

import packetlayer.entities.*;

public class Database implements Input{
	private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    public final String CAT = "dog";
    
    public Database() {
    	 try {
    	     Class.forName("com.mysql.jdbc.Driver");
    	     connection = DriverManager.getConnection("jdbc:mysql://66.6.115.212:443/am_packetLayer", "root", "");
    	     statement = connection.createStatement();
    	 } catch (Exception ex) {
    	     System.out.println("Error: " + ex);
    	     
    	 }
    }    
    public void writeData(){
    	try {
    		String query = "";
    		 // String query = "UPDATE `User_List` SET `Password` = '"+ CAT+ "' WHERE `User_List`.`UserNumber` = 3";
    		PreparedStatement preparedStmt = connection.prepareStatement(query);

    	 /*     preparedStmt.setString (1, CAT);
    	      preparedStmt.setString (2, "jand");
    	      preparedStmt.setInt (3, 1);*/
    	      
    	      preparedStmt.execute();

    	}catch(Exception ex){
    		System.out.println(ex);
    	}
    }
    	    
    public void getData() {
    	 try {
    	     String query = "select * from User_List";
    	     resultSet = statement.executeQuery(query);
    	     System.out.println("Records from Database");
    	     while (resultSet.next()) {
    	    	 String userNumber = resultSet.getString("UserNumber");
    	    	 String userName = resultSet.getString("UserName");
    	    	 String password = resultSet.getString("Password");
    	    	 String userLevel = resultSet.getString("UserLevel");

    	    	 System.out.println("User Number " + userNumber + userName + password + userLevel);
    	     }
    	     
    	 } catch(Exception ex) {
    	     System.out.println(ex);
    	 }
    }
    
    public static void main(String[] args){
    	Database data = new Database();
    	data.addSalesForms(new ArrayList<SalesForm>());
    }
    
    private Object convertBool(Object cur, boolean di){
    	if (di){
    		return cur;
    	}
    	return null;
    }
    
    private ArrayList<SalesForm> addSalesForms(ArrayList<SalesForm> form){
    	try{
    		String query = "Select * from Sales_Call_Form";
    		resultSet = statement.executeQuery(query);
    		while (resultSet.next()){
    			String name = resultSet.getString("Name");
    			String date = resultSet.getString("Date");
    			String cName = resultSet.getString("CName");
    			String cAddress = resultSet.getString("CAddress");
    			String cPhone = resultSet.getString("C_Phone");
    			String pocName = resultSet.getString("POCName");
    			String pocTitle = resultSet.getString("POCTitle");
    			String poc_Phone = resultSet.getString("POC_Phone");
    			String poc_Email = resultSet.getString("POC_Email");
    			boolean type_CC = resultSet.getBoolean("Type_CC");
    			boolean type_WI = resultSet.getBoolean("Type_WI");
    			boolean type_Ref = resultSet.getBoolean("Type_Ref");
    			boolean type_RS = resultSet.getBoolean("Type_RS");
    			boolean type_Rep = resultSet.getBoolean("Type_Rep");
    			boolean type_Unk = resultSet.getBoolean("Type_Unk");
    			boolean type_G = resultSet.getBoolean("Type_G");
    			boolean type_BBN = resultSet.getBoolean("Type_BBN");
    			String rs_Name = resultSet.getString("RS_Name");
    			String rs_Org = resultSet.getString("RS_Org");
    			String rs_Phone = resultSet.getString("RS_Phone");
    			String rs_Email = resultSet.getString("RS_Email");
    			String rs_Fee = resultSet.getString("RS_Fee");
    			boolean ops_Internet = resultSet.getBoolean("OPS_Internet");
    			boolean ops_BUInternet = resultSet.getBoolean("OPS_BUInternet");
    			boolean ops_PIP = resultSet.getBoolean("OPS_PIP");
    			boolean ops_Tele = resultSet.getBoolean("OPS_Tele");
    			boolean ops_Host = resultSet.getBoolean("OPS_Host");
    			boolean ops_WD = resultSet.getBoolean("OPS_WD");
    			boolean ops_DMS = resultSet.getBoolean("OPS_DMS");
    			boolean ops_MS = resultSet.getBoolean("OPS_MS");
    			boolean ops_Con = resultSet.getBoolean("OPS_Con");
    			String bwr = resultSet.getString("BWR");
    			String curPro  = resultSet.getString("CurPro");
    			String ipCount = resultSet.getString("IPCount");
    			String curMC = resultSet.getString("CurMC");
    			String curBand = resultSet.getString("CurBand");
    			String curTech = resultSet.getString("CurTech");
    			boolean entTowerCover = resultSet.getBoolean("EntTowerCover");
    			boolean servResp = resultSet.getBoolean("ServResp");
    			boolean quote = resultSet.getBoolean("Quote");
    			boolean conExe = resultSet.getBoolean("ConExe");
    			boolean setFeeRec = resultSet.getBoolean("SetFeeRec");
    			String notes = resultSet.getString("Notes");
    			boolean[] type = new boolean[]{type_CC, type_WI, type_Ref, type_RS, type_Rep, type_Unk, type_G, type_BBN};
    			ArrayList<Plan> opportunities = new ArrayList<Plan>();
    			opportunities.add((Plan) this.convertBool(new Internet(), ops_Internet));
    			opportunities.add((Plan) this.convertBool(new Internet(), ops_BUInternet));
    			opportunities.add((Plan) this.convertBool(new Internet(), ops_PIP));
    			opportunities.add((Plan) this.convertBool(new ManagedServices(), ops_Tele));
    			opportunities.add((Plan) this.convertBool(new WebAndHosting(), ops_Host));
    			opportunities.add((Plan) this.convertBool(new WebAndHosting(), ops_WD));
    			opportunities.add((Plan) this.convertBool(new WebAndHosting(), ops_DMS));
    			opportunities.add((Plan) this.convertBool(new ManagedServices(), ops_MS));
    			opportunities.add((Plan) this.convertBool(new ManagedServices(), ops_Con));
    			Contact poc = new Contact(pocName, pocTitle, poc_Phone, poc_Email);
    			Contact re_poc = new Contact(rs_Name, rs_Org, rs_Phone, rs_Email, rs_Fee);
    			boolean[] checkoff = new boolean[]{entTowerCover, servResp, quote, conExe, setFeeRec};
    			form.add(new SalesForm(bwr, poc, name, date, cName, cAddress, cPhone, type, re_poc, opportunities, curBand, curPro, curMC, ipCount, curTech, checkoff, notes));
    			System.out.println(date);
    			System.out.println(name);
    			System.out.println(cName);
    			System.out.println(cAddress);
    			System.out.println(cPhone);
    			System.out.println(type);
    			System.out.println(re_poc);
    			System.out.println(opportunities);
    			System.out.println(curBand);
    			System.out.println(curPro);
    			System.out.println(curMC);
    			System.out.println(ipCount);
    			System.out.println(curTech);
    			System.out.println(checkoff);
    			System.out.println(bwr);
    			System.out.println(poc);
    			System.out.println(notes);
    			
    		}
    	} catch (Exception ex) {
    		System.out.println("Error: " + ex);
   	     
   	 	}
    	return form;
    }	
    
    
	//@Override
	/*public ArrayList<Customer> getCustomers() {
		ArrayList<SalesForm> salesForms = new ArrayList<SalesForm>();
		ArrayList<CPEInstallationForm> cpeForms = new ArrayList<CPEInstallationForm>();
		ArrayList<CustomerDetailsForm> customerDetailsForms = new ArrayList<CustomerDetailsForm>();
		ArrayList<DistSiteInstallationForm> distSiteInstallationForms = new ArrayList<DistSiteInstallationForm>();
		ArrayList<PlottingForm> plottingForms = new ArrayList<PlottingForm>();
		ArrayList<PostInstallForm> postInstallForms = new ArrayList<PostInstallForm>();
		ArrayList<SurveyForm> surveyForms = new ArrayList<SurveyForm>();
		ArrayList<InstallInstructionForm> installInstructionForms = new ArrayList<InstallInstructionForm>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		salesForms = this.addSalesForms(salesForms);
		
		

	}*/
	@Override
	public Customer getCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateDatabase(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean verifyUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean verifyPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
