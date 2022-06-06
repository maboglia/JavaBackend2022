package cicli;

public class ProvaFor {

	public static void main(String[] args) {


		int volte = 10;
		int punteggio = 0;
		
		for (int i = 0; i < volte; i++) {
			if (Math.random() > 0.5) {
				System.out.println("canestro!!!");
				punteggio++;
			}
		}
		
		System.out.println("hai tirato " + volte + " volte.");
		System.out.println("hai totalizzato " + punteggio + " punti!");
		
	}

}
