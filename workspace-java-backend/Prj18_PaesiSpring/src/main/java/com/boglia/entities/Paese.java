package com.boglia.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paesi")
public class Paese implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String capitale;
	private int popolazione;
	private String bandiera;
	
	
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
	public String getCapitale() {
		return capitale;
	}
	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}
	public int getPopolazione() {
		return popolazione;
	}
	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}
	public String getBandiera() {
		return bandiera;
	}
	public void setBandiera(String bandiera) {
		this.bandiera = bandiera;
	}
	
	
	
	
}
