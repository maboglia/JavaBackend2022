package model;

public abstract class Oggetto {

	private static int counter= 1;
	
	private int id;
	private String nome;
	private double prezzo;
	
	protected String tipo;
	
	public Oggetto(String nome, double prezzo) {
		this.id = counter++;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTipo() {
		return tipo.toUpperCase();
	}

	@Override
	public String toString() {
		return "Oggetto [id=" + id + ", nome=" + nome + ", prezzo=" + prezzo + ", tipo=" + tipo + "]";
	}

	
	
}
