package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Tennista;

public class TennistaDAO {

	
	private final String HOST = "jdbc:mysql://localhost:3306/java_2022";
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn = null;
	
	private Statement stat;//contenitore per le query
	private PreparedStatement ps;
	private ResultSet rs;
	
	public TennistaDAO() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("connesso");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("NON connesso");
		}
	}
	
	
	private void connetti() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("connesso");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Tennista> getTennisti(){
		
		List<Tennista> tennisti = new ArrayList<>();//contenitore vuoto
		
		try {
			String sql = "select * from wimbledon";
			this.stat = this.conn.createStatement();
			
			this.rs = this.stat.executeQuery(sql);
			
			while(this.rs.next()) {
				
				int id = this.rs.getInt("id");
				String anno = this.rs.getString(2);
				String nome = this.rs.getString(3);
				String nazio = this.rs.getString(4);
				
				Tennista t = new Tennista();
				
				t.setId(id);
				t.setAnno(anno);
				t.setNome(nome);
				t.setNazionalita(nazio);
				
				tennisti.add(t);//aggiungo il tennista
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tennisti;//contenitore pieno
	}
	
}
