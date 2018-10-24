package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;

import managers.FileReaderManager;

public class MSSQLConnector {
     
	
	static String dbURL = FileReaderManager.getInstance().getConfigFileReader().getdbURL();
	static String dbUserName = FileReaderManager.getInstance().getConfigFileReader().getdbUserName();
	static String dbPassword = FileReaderManager.getInstance().getConfigFileReader().getdbPassword();

	
	/*

	Method Name:getOTP
	Return Type: String
	Parameter Type: -

	This Method returns OTP from DB


	*/
	
	
	
	public static String getOTP(String userName) {
		String id=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st = null;
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		String getUserIDQuery= "select id from users where user_name="+"'"+userName+"'"+";";
		ResultSet userID = null;
		try {
			userID = st.executeQuery(getUserIDQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(userID.next())
			{
			
			id= userID.getString(1);
			Log.info("user id is "+id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String getOTPQuery = "select * from otp_Details where USER_ID="+id+";";
		ResultSet code = null;
		try {
			code = st.executeQuery(getOTPQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(code.next()) {
			String otp=code.getString(3);
			
			Log.info("otp is "+otp);
			return otp;
			
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    return"";
		
		
		
}
}