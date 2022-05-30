package gioco;

public class Dado {

	int facce = 6;
	
	public int lancia() {
		
		//casting
		int casuale = (int) (Math.random() * facce) + 1;
		
		return casuale;
		
	}
	
	
}
