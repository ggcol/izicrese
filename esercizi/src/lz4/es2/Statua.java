package lz4.es2;

public class Statua extends OperaArte implements CriticoMagaziniere{
	
	private int profondità;
	
	public Statua (int lunghezza, int altezza, int profondità, String titolo) {
		setAltezza(altezza);
		setLunghezza(lunghezza);
		setProfondità(profondità);
		setTipo("statua");
		setTitolo(titolo);
	}

	public int getProfondità() {
		return profondità;
	}

	public void setProfondità(int profondità) {
		this.profondità = profondità;
	}
	
	

}
