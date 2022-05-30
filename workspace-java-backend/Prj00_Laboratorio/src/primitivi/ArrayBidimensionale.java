package primitivi;

public class ArrayBidimensionale {

	public static void main(String[] args) {

		final int RIGHE = 3;
		final int COLONNE = 3;

		char[][] matrix = new char[RIGHE][COLONNE];

		
		matrix[0][0] = 'X';
		matrix[0][1] = 'O';
		matrix[0][2] = 'X';
		
		matrix[1][0] = 'O';
		matrix[1][1] = 'O';
		matrix[1][2] = 'X';
		
		matrix[2][0] = 'X';
		matrix[2][1] = 'X';
		matrix[2][2] = 'O';
		
		for (int i = 0; i < RIGHE; i++) {
			
			for (int j = 0; j < COLONNE; j++) {
				System.out.print( " " + matrix[i][j] +" | " );
			}
			System.out.println();
			System.out.println("--------------");
			
			
		}//ciclo delle righe
		
		
		
		

	}

}
