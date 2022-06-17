package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String URL = "jdbc:mysql://localhost:3306/java_2022";
	private final String USER = "app_java2022";
	private final String PASS = "java_2022!";
	private Connection conn = null;
	
	private void connetti() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Siamo connessi!");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Non siamo connessi: " + e.getMessage());
		}
	}
	
	public Connection getConn() {
		if (conn == null)
			connetti();
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
}
