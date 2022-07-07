package collezioni;

import java.util.ArrayList;
import java.util.List;

public class BiglieDAO {

	static List<Biglia> collezione = new ArrayList<>();
	
	static {//blocco static di inizializzazione
		collezione.add(new Biglia(Colore.ROSSO, 10, Materiale.VETRO));
		collezione.add(new Biglia(Colore.GIALLO, 8, Materiale.VETRO));
		collezione.add(new Biglia(Colore.VERDE, 12, Materiale.CERAMICA));
		collezione.add(new Biglia(Colore.BLU, 14, Materiale.VETRO));
		collezione.add(new Biglia(Colore.ROSSO, 6, Materiale.VETRO));
		collezione.add(new Biglia(Colore.GIALLO, 16, Materiale.CERAMICA));
		collezione.add(new Biglia(Colore.VERDE, 4, Materiale.VETRO));
	}
	
	
	
}
