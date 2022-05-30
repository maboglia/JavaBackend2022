package primitivi;

public class Stringhe {

	public static void main(String[] args) {
		
		String s = "ciao mondo";
		String s2 = "ciao ";
		String s3 = "mondo";
		String s4 = s2 + s3;
		System.out.println(s.equals(s4));
		
		System.out.println(s == s2);
		
		
		
		String s1 = new String("CIAO");
		
		System.out.println(  s.equals(s1)  );
		System.out.println(  s.equalsIgnoreCase(s1)  );
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println(s.isEmpty());
		System.out.println(s.startsWith("ci"));
		
		
	}
	
	
}
