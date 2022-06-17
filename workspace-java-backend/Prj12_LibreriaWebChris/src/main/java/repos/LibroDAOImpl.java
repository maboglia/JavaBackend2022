package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Connessione;
import model.Libro;

public class LibroDAOImpl implements LibroDAO {

	
	private Connessione miaConn;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public LibroDAOImpl() {
		
		this.miaConn = new Connessione();
		this.conn = miaConn.getConn();
		
	}
	
	@Override
	public List<Libro> getLibri() {
		List<Libro> libriTemp = new ArrayList<>(); // contenitore vuoto
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL); //query
			this.rs = this.ps.executeQuery();//eseguo
			
			while (this.rs.next()) { // scorro result set
				
				Libro l = new Libro(); //creo libro
				l.setId(rs.getInt(1));//metto valori
				l.setTitolo(rs.getString(2));
				l.setPrezzo(rs.getInt(3));
				l.setPagine(rs.getInt(4));
				l.setEditore(rs.getInt(5));
				
				libriTemp.add(l);//aggiungo il libro all'array
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return libriTemp; //ritorno l'array.
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLibro(Libro l) {

		
		try {
			
			
			this.ps = this.conn.prepareStatement(ADD_LIBRO);
			this.ps.setString(1,l.getTitolo());
			this.ps.setDouble(2, l.getPrezzo());
			this.ps.setInt(3, l.getPagine());
			this.ps.setInt(4, l.getEditore());
			
			this.ps.execute();//eseguo
			
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} //query
		
	}
	
	
	
	
	

}
