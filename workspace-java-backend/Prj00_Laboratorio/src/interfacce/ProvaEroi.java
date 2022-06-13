package interfacce;

import java.util.ArrayList;
import java.util.List;

public class ProvaEroi {

	public static void main(String[] args) {


		Vampiro v1 = new Vampiro("dracula");
		Vampiro v2 = new Vampiro("voldemort");
		
		
		Zombie z1 = new Zombie("piero zombie");

		List<Mostruoso> eroi = new ArrayList<>();
		
		eroi.add(v1);
		eroi.add(v2);
		eroi.add(z1);
		
		for (Mostruoso superEroe : eroi) {
			superEroe.spaventa();
		}
		
	}

}
