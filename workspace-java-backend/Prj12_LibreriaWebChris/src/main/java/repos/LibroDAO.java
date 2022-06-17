package repos;

import java.util.List;

import model.Libro;

public interface LibroDAO {
	
	
	String FIND_ALL = "SELECT * FROM libri";
	String FIND_ONE = "SELECT * FROM libri WHERE id = ?";
	String ADD_LIBRO = "INSERT INTO libri (titolo, prezzo, pagine, editore_id) values (?,?,?,?)";
	
	
	
	// --- CRUD ---
	
	List<Libro> getLibri();
	Libro getLibroById(int id);
	void addLibro(Libro l);

}
