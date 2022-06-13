package eccezioni;

public class EccezioneArray {

	public static void main(String[] args) {
		
		
		String[] note = {
				"do",
				"re",
				"mi",
				"fa",
				"sol",
				"la",
				"si",
		};
		
		
		for (int i = 0; i < note.length; i++) {
			
			try {
			System.out.println(note[i].toUpperCase());
			
			System.out.println(7/0);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Si è verificato un problema con la posizione dell'elemento " + e.getMessage());
				
			}
			catch (Exception e) {
				System.err.println("Si è verificato un problema generico " + e.getMessage());
			}
			

		}
		
		System.out.println("PROGRAMMA TERMINATO");

	}

}
