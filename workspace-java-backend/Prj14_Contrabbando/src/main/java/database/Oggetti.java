package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.*;


public class Oggetti {

	public static List<Oggetto> deposito = new ArrayList<>();
	public static Map<Integer, Oggetto> mapOggetti = new HashMap<>();
	
	public static void init() {
		
		deposito.clear();
		mapOggetti.clear();
		
		deposito.add(new Libro("Libro rubato a versailles", 100));
		deposito.add(new Libro("Libro sottratto a londra", 150));
		deposito.add(new Libro("Libro del re di spagna", 120));
		deposito.add(new Libro("Libro rubato alla bancarella", 50));
		
		deposito.add(new Disco("disco trovato nel negozio, era per terra", 30));
		deposito.add(new Disco("disco di vasco che deve ancora uscire", 300));
		deposito.add(new Disco("disco di platino di elisa", 3000));
		
		deposito.add(new Opera("La gioconda, su commissione", 1000));
		deposito.add(new Opera("La venere di milo con le braccia", 500));
		deposito.add(new Opera("Il colosseo, pezzi", 600));
		
		for (Oggetto oggetto : deposito) {
			mapOggetti.put(oggetto.getId(), oggetto);
		}
		
	}
	
	
	
}
