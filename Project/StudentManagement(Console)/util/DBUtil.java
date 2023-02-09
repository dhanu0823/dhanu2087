package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {// Utility class for database connection
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="nDhan@0#7";
private static final String DB_URL ="jdbc:mysql://localhost:3306/studentapplication?"
		+ "autoReconnect=true&useSSL=false";
	private static Connection connection = null;
	static{ // Load the database driver and establish a connection to the database
		try {
			Class.forName(DB_DRIVER_CLASS);
		connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
}  // Return the database connection
	public static Connection getConnection(){
		return connection;  
	}
}


