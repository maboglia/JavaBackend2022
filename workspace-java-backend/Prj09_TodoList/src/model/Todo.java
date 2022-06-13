package model;

import java.time.LocalDate;

public class Todo {

	
	private String descrizione;
	private LocalDate data;
	private boolean completato;
	
	public Todo(String descrizione) {
		super();
		this.descrizione = descrizione;
		this.data = LocalDate.now();
		this.completato = false;
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
		return "Todo [ data=" + data + ", descrizione=" + descrizione + ", completato=" + completato + "]";
	}
	
	
	
	
	
	
}
