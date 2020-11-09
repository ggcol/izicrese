package lz4.es2;

public class Statua extends OperaArte implements CriticoMagaziniere{
	
	private int profondit�;
	
	public Statua (int lunghezza, int altezza, int profondit�, String titolo) {
		setAltezza(altezza);
		setLunghezza(lunghezza);
		setProfondit�(profondit�);
		setTipo("statua");
		setTitolo(titolo);
	}

	public int getProfondit�() {
		return profondit�;
	}

	public void setProfondit�(int profondit�) {
		this.profondit� = profondit�;
	}
	
	

}
