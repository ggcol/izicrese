package lz5.es5;

public class Essere {
	
	private String nome;
	private boolean esiste;
	
	public Essere (String nome, boolean esiste) {
		setNome(nome);
		setEsiste(esiste);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isEsiste() {
		return esiste;
	}

	public void setEsiste(boolean esiste) {
		this.esiste = esiste;
	}
	
	public String toString () {
		return "Nome: "+this.nome+" Esiste: "+this.esiste;
	}

}
