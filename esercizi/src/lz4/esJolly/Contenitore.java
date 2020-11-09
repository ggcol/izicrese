package lz4.esJolly;

public class Contenitore {
	
	private String contenuto;
		//acido, ammoniaca, acqua, tè
	private String indicazione;
		//bevibile, nocivo
	
	
	public Contenitore (String contenuto, String indicazione) {
		setContenuto(contenuto);
		setIndicazione(indicazione);
	}


	public String getContenuto() {
		return contenuto;
	}


	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}


	public String getIndicazione() {
		return indicazione;
	}


	public void setIndicazione(String indicazione) {
		this.indicazione = indicazione;
	}
	
	
	public String toString() {
		return "Contenitore contenente: "+contenuto+" Indicazione di sicurezza: "+indicazione;
	}
	
	

}
