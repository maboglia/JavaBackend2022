package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String url = "jdbc:mysql://localhost:3306/java_2022";
	private final String user = "app_java2022";
	private final String pass = "java_2022!";
	
	private Connection conn;
	
	private void connetti() {
		//questo è obbligatorio sennò non carica la classe driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			
			this.conn = DriverManager.getConnection(url, user, pass);
			System.out.println("EVVIVA Siamo connessi");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("NOOOO, non siamo connessi" + e.getMessage());

		}
		
	}
	
	public Connection getConn() {
		
		if (conn == null) {
			connetti();
		}
	
		return conn;

	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
	
}
