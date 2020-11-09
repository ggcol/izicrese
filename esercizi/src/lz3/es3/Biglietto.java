package lz3.es3;

public class Biglietto {
	
	protected int validità;

	public int getValidità() {
		return validità;
	}

	public void setValidità(int validità) {
		this.validità = validità;
	}

	public String toString() {
		if (validità == -1) {
		return "Questo biglietto non ha validità, errore durante la validazione";
		} else {
		return "Biglietto di tipo: NONSPECIFICATO. Validità: "+this.validità;
		}
	}
	
	
}
