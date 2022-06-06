package cicli;

public class ProvaWhile {
		
		static int volte = 0;
		static int punteggio = 0;
		
	public static void main(String[] args) {


		
		
		gioca();
		System.out.println("--------------------------");
		gioca();
		
		
	}

	private static void stampa() {
		System.out.println("hai tirato " + volte + " volte.");
		System.out.println("hai totalizzato " + punteggio + " punti!");
	}

	private static void gioca() {
		
		while (punteggio < 10) {
			
			volte++;
			
			if (Math.random() > 0.5) {
				System.out.println("canestro!!!");
				punteggio++;
			}
			
		}
		
		stampa();
	}
	
}
