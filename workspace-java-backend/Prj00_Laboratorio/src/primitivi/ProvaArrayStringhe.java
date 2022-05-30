package primitivi;

public class ProvaArrayStringhe {

	public static void main(String[] args) {

		String[] nani = {
				"cucciolo",
				"eolo",
				"pisolo",
				"dotto",
				"mammolo",
				"gongolo",
				"brontolo",
		};
		
//		for (int i = nani.length -1; i >= 0; i--) {
//			System.out.println(i + ") " +nani[i]);
//		}
		//enhanced for - foreach
		for (String nano : nani) {
			if (nano.length() > 6)
				System.out.println(nano);
		}
		

	}

}
