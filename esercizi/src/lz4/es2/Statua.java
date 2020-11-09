package lz4.es2;

public class Statua extends OperaArte implements CriticoMagaziniere{
	
	private int profonditā;
	
	public Statua (int lunghezza, int altezza, int profonditā, String titolo) {
		setAltezza(altezza);
		setLunghezza(lunghezza);
		setProfonditā(profonditā);
		setTipo("statua");
		setTitolo(titolo);
	}

	public int getProfonditā() {
		return profonditā;
	}

	public void setProfonditā(int profonditā) {
		this.profonditā = profonditā;
	}
	
	

}
