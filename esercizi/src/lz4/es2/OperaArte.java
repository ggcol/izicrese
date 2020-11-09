package lz4.es2;

abstract class OperaArte {
	
	protected int lunghezza;
	protected int altezza;
	protected int profondità;
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
	public int getProfondità() {
		return profondità;
	}
	public void setProfondità(int profondità) {
		this.profondità = profondità;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public String toString () {
		return "Quest'opera è un: "+tipo+"\nIl suo titolo è: "+titolo+"\nIl suo ingombro totale è: "+volume;
	}
	
	

}
