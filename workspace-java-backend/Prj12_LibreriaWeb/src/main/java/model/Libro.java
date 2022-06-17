package model;

//POJO - Plain Old Java Object
//Javabean 
public class Libro {

	private static int counter=1;
	
	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	private int editore;

	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	public Libro(String titolo, double prezzo, int pagine, int editore) {
		this.id = counter++;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
		this.editore = editore;
	}
	public Libro(int id, String titolo, double prezzo, int pagine, int editore) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
		this.editore = editore;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getEditore() {
		return editore;
	}

	public void setEditore(int editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + ", editore="
				+ editore + "]";
	}
	
	
	
	
}
