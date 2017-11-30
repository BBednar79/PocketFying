package packetlayer;
import java.sql.*;

public class Database {
	private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public Database() {
    	 try {
    	     Class.forName("com.mysql.jdbc.Driver");
    	     connection = DriverManager.getConnection("jdbc:mysql://66.6.115.212:443/am_packetLayer", "root", "");
    	     statement = connection.createStatement();
    	 } catch (Exception ex) {
    	     System.out.println("Error: " + ex);
    	     
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
    	     System.out.println("");
    	 } catch(Exception ex) {
    	     System.out.println(ex);
    	 }
    }
    
    public static void main(String[] args){
    	Database data = new Database();
    	data.getData();
    }
}
