package lz3.es3;

public class Biglietto {
	
	protected int validit�;

	public int getValidit�() {
		return validit�;
	}

	public void setValidit�(int validit�) {
		this.validit� = validit�;
	}

	public String toString() {
		if (validit� == -1) {
		return "Questo biglietto non ha validit�, errore durante la validazione";
		} else {
		return "Biglietto di tipo: NONSPECIFICATO. Validit�: "+this.validit�;
		}
	}
	
	
}
