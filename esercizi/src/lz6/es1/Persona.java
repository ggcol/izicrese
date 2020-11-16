package lz6.es1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date compleanno;
	
	public Persona (String nome, String cognome, Date compleanno) {
		setNome(nome);
		setCognome(cognome);
		setCompleanno(compleanno);
	}
	
	public Persona() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getFormatedCompleanno() {
		DateFormat dF = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
		return dF.format(compleanno);
	}
	
	public Date getCompleanno() {
		return compleanno;
	}

	public void setCompleanno(Date compleanno) {
		this.compleanno = compleanno;
	}
	
	public String toString () {
		return "Nome: "+getNome()+" Cognome: "+getCognome()+" Data di nascita: "+getFormatedCompleanno();
	}

}
