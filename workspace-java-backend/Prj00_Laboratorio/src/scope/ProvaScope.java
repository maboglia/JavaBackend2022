package scope;

public class ProvaScope {

	static String saluto;//una sola e appartiene alla classe 
	String salutoEng;
	
	
	public static void main(String[] args) {
		System.out.println(ProvaScope.saluto);
		
		ProvaScope ps = new ProvaScope();
		System.out.println(ps.salutoEng);
		ps.saluta();
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
		for (int i = 0; i < args.length; i++) {
			
		}
	}
	
	public void saluta() {
		
		String saluto;
//		System.out.println(saluto);
		System.out.println(ProvaScope.saluto);
	}
	

}
