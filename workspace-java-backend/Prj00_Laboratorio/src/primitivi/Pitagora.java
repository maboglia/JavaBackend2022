package primitivi;

public class Pitagora {

	public static void main(String[] args) {

		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			
			
			for (int j = 1; j <= COLONNE; j++) {
				if (i*j % 4 == 0) 
					System.out.print(i*j+ "\t");
				else 
					System.out.print("*" + "\t");
			}
			System.out.println();
			
			
		}
		
		

	}

}
