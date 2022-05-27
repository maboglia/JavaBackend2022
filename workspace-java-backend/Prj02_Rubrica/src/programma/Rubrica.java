package programma;

public class Rubrica {

	String nomeRubrica;
	Contatto[] schedario = new Contatto[11];
	
	public void stampaRubrica() {
		for (int i = 0; i < schedario.length; i++) {
			if (schedario[i] != null)
			System.out.println(schedario[i].stampaContatto());
		}
	}
	
}
