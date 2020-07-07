package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
  
	private static ConnectionManager instance = null;

	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/autobusi?allowPublicKeyRetrieval=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	
	private Connection connection = null;

	
	

	
	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	private boolean openConnection() {
		try {
			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	public Connection getConnection() throws ClassNotFoundException {
		if (connection == null) {
			if (openConnection()) {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Konekcija otvorena.");
				return connection;
			} else {
				return null;
			}
		}
		return connection;
	}

	public void close() {
		System.out.println("Konekcija zatvorena.");
		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
		}
	}
}


