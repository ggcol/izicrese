package lz3.es1;

public class Utente {

	private String nome;
	private String cognome; 
	private int et�;

	public Utente (String nome, String cognome, int et�) {
		setNome(nome);
		setCognome(cognome);
		setEt�(et�);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			this.nome = "!!! non hai valorizzato il campo";
		} else {
			this.nome = nome;
		}
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if (cognome == null) {
			this.cognome = "!!! non hai valorizzato il campo";
		} else {
			this.cognome = cognome;
		}
	}

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		if (et� >= 18) {
			this.et� = et�;
		} else {
			System.out.println("troppo giovane!");
		}
	}

	public String toString() {
		return "Utente: \nNome: "+this.nome+" Cognome: "+this.cognome+" Et�: "+this.et�;
	}

}
