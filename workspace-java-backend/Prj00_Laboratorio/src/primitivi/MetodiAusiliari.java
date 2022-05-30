package primitivi;

import java.util.Scanner;

public class MetodiAusiliari {

	public static void main(String[] args) {
		
		int a = askUser();
		int b = askUser();
		
		
		System.out.println(addizione(a, b));

	}


	public static int askUser() {
		System.out.println("Inserisci un numero INTERO!!!!");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}


	public static double addizione(int a, int b) {
		return a + b;
	}

}
