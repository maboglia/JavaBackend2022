package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_NAME = "java_2022";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn;
	
	private void connetti() {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("tutto ok!");
		} catch (SQLException e) {
			System.err.println("è andato tutto storto!!!!");
			System.err.println(e.getMessage());
		}
		
	}
	
	public Connection getConn() {
		if (this.conn==null)
			connetti();
		return conn;//singleton
	}
	
}
