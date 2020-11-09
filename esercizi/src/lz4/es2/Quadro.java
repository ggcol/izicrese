package lz4.es2;

public class Quadro extends OperaArte implements CriticoMagaziniere {

	public Quadro (int lunghezza, int altezza, String titolo) {
		setAltezza(altezza);
		setLunghezza(lunghezza);
		setTipo("quadro");
		setTitolo(titolo);
	}
}
