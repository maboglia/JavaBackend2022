package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Todo;

public class TodoDAO {

	private Connessione connessione = new Connessione();
	private Statement stat;//contenitore per portare istruzioni al db
	private ResultSet rs;//contenitore per risultati che tornano dal db
	
	//CRUD sulla tabella todo
	
	public void addTodo(Todo t) {
		try {
			String sql = "insert into todo (descrizione, data, completato) values( '" + t.getDescrizione() + "',   '" + t.getData() + "',  " + t.isCompletato() +  "   )";
			this.stat = connessione.getConn().createStatement();
			this.stat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Todo> getTodo(){
		List<Todo> todos = new ArrayList<>();
		try {
			String sql = "select descrizione, data, completato from todo";
			this.stat = connessione.getConn().createStatement();
			this.rs = this.stat.executeQuery(sql);
			
			while(this.rs.next()) {
				String desc = this.rs.getString("descrizione");
				String data = this.rs.getString("data");
				boolean completato = this.rs.getBoolean("completato");
				
				Todo t = new Todo(desc);
				t.setCompletato(completato);
				
				todos.add(t);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return todos;
	}
	
	
	
	
	
}
