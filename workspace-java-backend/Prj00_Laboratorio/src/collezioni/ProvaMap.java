package collezioni;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ProvaMap {

	public static void main(String[] args) {
		
		Map<String, String> capoluoghi = new TreeMap<>();
		
		//               Set      Collection
		capoluoghi.put("piemonte", "torino");
		capoluoghi.put("lombardia", "milano");
		capoluoghi.put("toscana", "firenze");
		
		
//		System.out.println(capoluoghi.get("piemonte"));
		
		Set<String> regioni = capoluoghi.keySet();
		Collection<String> valori = capoluoghi.values();
		
		for (String regione : regioni) {
			System.out.println(capoluoghi.get(regione));
		}

		
		for (Entry<String, String> coppia : capoluoghi.entrySet()) {
			System.out.println(coppia.getKey());
			System.out.println(coppia.getValue());
		}
		
	}

}
