package view;

import java.util.ArrayList;
import java.util.List;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class GestioneDipp {

	public static void main(String[] args) {
		
		
		List<Dipendente> dipendenti = new ArrayList<>();
		
		dipendenti.add(new Impiegato("pippo", "pippo"));
		dipendenti.add(new Impiegato("pluto", "pluto"));
		dipendenti.add(new Fattorino("paperino", "paperino"));
		dipendenti.add(new Fattorino("qui", "paperino"));
		dipendenti.add(new Fattorino("quo", "paperino"));
		dipendenti.add(new Fattorino("qua", "paperino"));
		dipendenti.add(new Dirigente("giovanni", "verga"));

		
		for (Dipendente dipendente : dipendenti) {
			
			if (dipendente instanceof Fattorino) {
				((Fattorino)dipendente).setnConsegne(100);
				((Fattorino)dipendente).setPagaConsegne(12);
			}
			
			if (dipendente instanceof Impiegato) {
				((Impiegato)dipendente).setOreLavorate(150);
				((Impiegato)dipendente).setPagaBase(15);
			}
			
			if (dipendente instanceof Dirigente) {
				((Dirigente)dipendente).setGiornate(20);
				((Dirigente)dipendente).setPagaGiornata(300);
			}
			
			
		}
		
		
		for (Dipendente dipendente : dipendenti) {
			System.out.println(dipendente);
			System.out.println(dipendente.calcolaPaga());
		}
		

		
		
		
		
	}

}
