package gioco;

public class GiocoSomma7 {

	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		for (int i = 0; i < 100; i++) {
			
			int r1 =  d1.lancia();
			int r2 =d2.lancia();
			
			if ( ( r1 + r2)  == 7       ) {
				
				System.out.println("hai vinto con " + r1  + " e " + r2);
			}
			
		} 

	}

}
