package collezioni;

import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {


		TreeSet<String> nani = new TreeSet<>();
		
		nani.add("Pisolo");//0
		nani.add("eolo");
		nani.add("mammolo");
		nani.add("gongolo");
		nani.add("brontolo");
		nani.add("cucciolo");
		nani.add("dotto");//6
		nani.add("dotto");//7
		
		
		
		nani.size();//quanti elementi contenuti

//		for (int i = 0; i < nani.size(); i++) {
//			System.out.println(nani.get(i));
//		}
		
		//nani.remove("cucciolo");
		//nani.remove(7);
		
		
		
		System.out.println("-----------------------------------");
		
		for (String nano : nani) {
			System.out.println(nano);
		}
		
	}

}
