package veicoli;

import java.util.Scanner;

public class ProvaVeicoli {
	public static void main(String[] args) {
		
		String s = chiedi();
		
		if (s.equals("bici")) {
			
			Bicicletta b =  new Bicicletta("bianco");
			Bicicletta b1 =  new Bicicletta("rosso");
			b.cambia(5);
			b1.cambia(3);
		} else {
			Automobile a = new Automobile("Fiat", "500", 1200);
			Automobile a2 = new Automobile("Peugeot", "205", 1500);
		
		
		
		System.out.println(a.stampa());
		System.out.println(a2.stampa());
		}
		
		
		
		
		
	}
	
	private static String chiedi() {
		
		System.out.println("Quale veicolo vuoi costruire?");
		
		Scanner scan = new Scanner(System.in);
		
		return scan.nextLine();
	}
}
