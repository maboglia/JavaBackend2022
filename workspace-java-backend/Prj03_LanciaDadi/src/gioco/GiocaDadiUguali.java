package gioco;

public class GiocaDadiUguali {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		Dado d3 = new Dado();
		
		
		
		final int NUM_LANCI = 100000;
		int successi = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
			int r1 = d1.lancia();
			int r2 = d2.lancia();
			int r3 = d3.lancia();
			
//			System.out.println("Dado 1: " + r1);
//			System.out.println("Dado 1: " + r2);
		
		if (r1 == r2  && r2 == r3 ) {
			System.out.println("hai vinto");
			successi++;
		}
			
		}//fine ciclo for
		long stop = System.currentTimeMillis();
		
		System.out.println("hai vinto " + successi + " volte");
		System.out.println("L'elaborazione è durata " + (stop-start));
		
		

	}

}
