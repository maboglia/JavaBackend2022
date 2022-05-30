package primitivi;

public class Caratteri {

	public static void main(String[] args) {
		
		
		char c1 = '1';
		char c2 = 'a';
		
		char dollaro = '\u0024';
		char lambda = '\u03BB';
		char star = '\u2735';

		System.out.println(star);
		
		for(int i = 0; i < 1500; i++) {
			
			char carattere = (char) i;
			
			System.out.println("" + i + ": " +carattere);

			if (i == 255) {
				System.out.print("-----------------\n\n");
				
				System.out.println("\tfine tabella ASCII");
				System.out.println("-----------------");
			}
		
		}
		
		
		
		
	}
	
	
}
