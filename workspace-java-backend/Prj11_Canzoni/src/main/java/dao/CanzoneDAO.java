package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.Connessione;
import model.Canzone;

public class CanzoneDAO {
	private Connessione conn;
	private Statement stat;
	private ResultSet rs;
	private Connection c;
	
	public CanzoneDAO() {
		this.conn = new Connessione();
		this.c = this.conn.getConn();
	}
	
	//1 Create
	public void addCanzone(Canzone c) {
		try {
			String sql = "INSERT INTO canzoni (titolo) VALUES ('" + c.getTitolo() + "')";
			this.stat = this.c.createStatement();
			int i = this.stat.executeUpdate(sql); //ALT + SHIFT + L: extract local variable
			System.out.println("Aggiunta " + i + " canzone");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//2 Read
	public List<Canzone> getCanzoni() {
		List<Canzone> canzoni = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM canzoni";
			this.stat = this.c.createStatement();
			this.rs = this.stat.executeQuery(sql); //ALT + SHIFT + L: extract local variable
			
			while (this.rs.next()) {
				Canzone c = new Canzone(rs.getInt("id"), 
										rs.getString("titolo"), 
										rs.getString("cantante"), 
										rs.getString("genere"),
										rs.getInt("anno"));
				canzoni.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return canzoni;
	}
	
	//3 Update
	
	
	//4 Delete
	
	public static void main(String[] args) {
		CanzoneDAO cd = new CanzoneDAO();
		cd.addCanzone(new Canzone(0, "Highway to Hell", null, null, 0));
		System.out.println(cd.getCanzoni());
	}
}
