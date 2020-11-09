package lz2.es14;

public class Piatto {
	
	private String nome;
	private String indicazione;
	
	public Piatto (String nome, String indicazione) {
		setNome(nome);
		setIndicazione(indicazione);
	}

	public String getIndicazione() {
		return indicazione;
	}

	public void setIndicazione(String indicazione) {
		this.indicazione = indicazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
