package model;

import java.io.Serializable;

public class Tennista implements Serializable, Comparable<Tennista>{

	private int id;
	private String anno;
	private String nome;
	private String nazionalita;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNazionalita() {
		return nazionalita;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	@Override
	public String toString() {
		return "Tennista [id=" + id + ", anno=" + anno + ", nome=" + nome + ", nazionalita=" + nazionalita + "]";
	}
	@Override
	public int compareTo(Tennista o) {
		return this.nome.compareTo(o.nome);
	}
	
}
