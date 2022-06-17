package model;

public class Canzone {

	private int id;
	private String titolo;
	private String cantante;
	private String genere;
	private int anno;

	public Canzone(int id, String titolo, String cantante, String genere, int anno) {
		this.id = id;
		this.titolo = titolo;
		this.cantante = cantante;
		this.genere = genere;
		this.anno = anno;
	}

	public Canzone() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantante=" + cantante + ", genere=" + genere + ", anno="
				+ anno + "]";
	}

	
	
	
	
	
	
}
