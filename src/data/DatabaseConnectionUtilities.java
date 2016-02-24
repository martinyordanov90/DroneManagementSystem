package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectionUtilities {
	private static String mURL;
	private static String mUser;
	private static String mPassword;

	public DatabaseConnectionUtilities(){
		mURL = "jdbc:mysql//localhost:3306/drone_management_system";
		mUser = "secretuser";
		mPassword = "verysecretpassword";
	}

	public DatabaseConnectionUtilities(String URL,String user,String password){
		mURL = URL;
		mUser = user;
		mPassword = password;
	}
	
	public static Connection connect (){
		Connection connection = null;
		try {
			connection =  DriverManager.getConnection(mURL, mUser,mPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}
