package com.didaz.todos.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descrizione;
	private LocalDate data;
	private boolean completato;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public boolean isCompletato() {
		return completato;
	}
	public void setCompletato(boolean completato) {
		this.completato = completato;
	}
	
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", descrizione=" + descrizione + ", data=" + data + ", completato=" + completato
				+ "]";
	}
	
	
	
	

}
