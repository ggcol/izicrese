package lz3.es3;

public class Mensile extends Biglietto {

	public Mensile() {}


	@Override
	public int getValidit�() {
		return validit�;
	}

	@Override
	public void setValidit�(int validit�) {
		if (validit� > 1 && validit� < 12) {
			this.validit� = validit�;
		} else if (validit� < 1 || validit� > 12) {
			System.out.println("!!! errore nella generazione del biglietto");
			this.validit� = -1;
		}
	}

	@Override
	public String toString() {
		if (validit� == -1) {
			return "Questo biglietto non ha validit�, errore durante la validazione.\n";
		} else {
			return "Biglietto di tipo: Mensile. Validit�: "+this.validit�+"� mese dell'anno corrente.\n";
		}
	}

}
