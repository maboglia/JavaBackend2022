package agenda;

public class Pagina {

	String giorno;
	Impegno[] impegni;

	public Pagina(String giorno, Impegno[] impegni) {
		this.giorno = giorno;
		this.impegni = impegni;
	}
	
	public String stampaPagina() {
		
		String pagina = "Pagina del giorno " +  giorno;
		
		for (int i = 0; i < impegni.length; i++) {
			
			pagina += "\n" + impegni[i].descrizione;
		}
		
		return pagina;
	} 
	
}
