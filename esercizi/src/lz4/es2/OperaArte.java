package lz4.es2;

abstract class OperaArte {
	
	protected int lunghezza;
	protected int altezza;
	protected int profondit�;
	protected String tipo;
	protected String titolo;
	protected int volume;
	
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getProfondit�() {
		return profondit�;
	}
	public void setProfondit�(int profondit�) {
		this.profondit� = profondit�;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public String toString () {
		return "Quest'opera � un: "+tipo+"\nIl suo titolo �: "+titolo+"\nIl suo ingombro totale �: "+volume;
	}
	
	

}
