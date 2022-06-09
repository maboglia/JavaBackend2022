package collezioni;

import java.util.ArrayList;

public class ProvaLista {

	public static void main(String[] args) {


		ArrayList<String> nani = new ArrayList<>();
		
		nani.add("pisolo");//0
		nani.add("eolo");
		nani.add("mammolo");
		nani.add("gongolo");
		nani.add("brontolo");
		nani.add("cucciolo");
		nani.add("dotto");//6
		nani.add(new String("dotto"));//7
		
		nani.get(0);
		
		nani.size();//quanti elementi contenuti

		for (int i = 0; i < nani.size(); i++) {
			System.out.println(nani.get(i));
		}
		
		nani.remove("cucciolo");
		//nani.remove(7);
		
		
		
		System.out.println("-----------------------------------");
		
		for (String nano : nani) {
			System.out.println(nano);
		}
		
	}

}
