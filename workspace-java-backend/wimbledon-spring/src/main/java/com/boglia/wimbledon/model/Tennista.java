package com.boglia.wimbledon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wimbledon")
public class Tennista implements Serializable, Comparable<Tennista>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String anno;
	
	private String tennista;
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
	
	public String getTennista() {
		return tennista;
	}
	public void setTennista(String tennista) {
		this.tennista = tennista;
	}
	public String getNazionalita() {
		return nazionalita;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	@Override
	public String toString() {
		return "Tennista [id=" + id + ", anno=" + anno + ", nome=" + tennista + ", nazionalita=" + nazionalita + "]";
	}
	@Override
	public int compareTo(Tennista o) {
		return this.tennista.compareTo(o.tennista);
	}
	
}
