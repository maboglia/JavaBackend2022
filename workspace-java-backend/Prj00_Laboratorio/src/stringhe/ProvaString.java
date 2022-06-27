package stringhe;

import java.util.List;

public class ProvaString {

	
	public static void main(String[] args) {
		
		String s1 = "Ciao";
		String s4 = "Ciao";
		String s2 = " mondo!";
		String s3 = "Ciao mondo!";
		
		
		boolean b = ((s1+s2).equals(s3));
		System.out.println(b);
		
		s1 += "Pippo";
		s1 += "pluto";
		
		StringBuilder sb = new StringBuilder(s1);
		sb.append("pippo");
		sb.append("pluto");
		
		
		List<String> note = List.of("do", "re", "mi", "fa", "sol", "la", "si");
		
		for (String string : note) {
			s1 += string;
		}
		
		for (String string : note) {
			sb.append(string);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
