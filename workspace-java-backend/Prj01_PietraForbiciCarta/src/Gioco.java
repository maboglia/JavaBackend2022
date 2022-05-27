import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {

		String sceltaUmano = sceltaUmano();
		String sceltaPC = sceltaCasuale();
		
		String result = valutaScelte(sceltaUmano, sceltaPC);
		
		System.out.println("scelta umano: " + sceltaUmano);
		System.out.println("scelta pc: " + sceltaPC);
		System.out.println(result);
		
	}

	private static String sceltaUmano() {
		String risposta = null;
		System.out.println("UMANO! scegli tra ");
		System.out.println("pietra");
		System.out.println("forbici");
		System.out.println("carta");
		
		Scanner input = new Scanner(System.in);
		
		risposta = input.nextLine();
		
		return risposta;
	}

	private static String valutaScelte(String sceltaUmano, String sceltaPC) {
		String risposta = null;
		
		if (sceltaUmano.equals(sceltaPC)) {
			risposta = "pareggio";
		} else {
			
			//1 umano pietra vince se pc = forbici
			if (sceltaUmano.equals("pietra")) {
				if (sceltaPC.equals("forbici")) {
					risposta = "Vince UMANO";
				} else {
					risposta = "Vince PC";
				}
			} else if (sceltaUmano.equals("forbici")) {
				//2 umano forbici vince se pc = carta
				if (sceltaPC.equals("carta")) {
					risposta = "Vince UMANO";
				} else {
					risposta = "Vince PC";
				}
			} else {
				//3 umano carta vince se pc = pietra
				if (sceltaPC.equals("pietra")) {
					risposta = "Vince UMANO";
				} else {
					risposta = "Vince PC";
				}
			}
			
		}
		
		return risposta;
	}

	private static String sceltaCasuale() {
		
		String risposta = null;
		
		double casuale = Math.random();
		
		if (casuale < 0.3333) {
			risposta = "pietra";
		} else if (casuale < 0.6666) {
			risposta = "forbici";
		} else {
			risposta = "carta";
		}
		
		return risposta;
	}

}
