package lz3.es1;

public class Utente {

	private String nome;
	private String cognome; 
	private int età;

	public Utente (String nome, String cognome, int età) {
		setNome(nome);
		setCognome(cognome);
		setEtà(età);
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

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		if (età >= 18) {
			this.età = età;
		} else {
			System.out.println("troppo giovane!");
		}
	}

	public String toString() {
		return "Utente: \nNome: "+this.nome+" Cognome: "+this.cognome+" Età: "+this.età;
	}

}
