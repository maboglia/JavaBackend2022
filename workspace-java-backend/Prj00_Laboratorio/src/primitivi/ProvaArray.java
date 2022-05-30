package primitivi;

public class ProvaArray {

	public static void main(String[] args) {

		int[] voti = new int[10];
		
		voti[0] = 23;
		voti[1] = 24;
		voti[2] = 25;
		voti[3] = 26;
		voti[4] = 27;
		voti[5] = 23;
		voti[6] = 24;
		voti[7] = 25;
		voti[8] = 26;
		voti[9] = 27;

		int[] voti2 = {23, 24, 25, 25 , 27, 23, 24, 25, 25 , 27 };
		
		double totale = 0;
		
		for (int i = 0; i < voti2.length; i++) {
			System.out.println(voti2[i]);
			totale += voti2[i];
			
		}//fine for

		System.out.println("la media è: " + (totale/voti2.length));
		
	}

}
