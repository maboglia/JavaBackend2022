package primitivi;

public class CicloWhile {

	public static void main(String[] args) {


		boolean gira = true;
		
		
		while (gira) {
			System.out.println("ciao");
			
			if (Math.random() < 0.05) {
				gira = false;
				System.out.println("ho finito di girare :)");
			}
		
		}
		

	}

}
