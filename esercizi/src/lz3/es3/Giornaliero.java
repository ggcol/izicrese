package lz3.es3;

public class Giornaliero extends Biglietto{


	public Giornaliero() {
	}


	@Override
	public int getValidit�() {
		return validit�;
	}

	@Override
	public void setValidit�(int validit�) {
		if (validit� > 1 && validit� < 31) {
			this.validit� = validit�;
		} else if (validit� < 1 || validit� > 31) {
			System.out.println("!!! errore nella generazione del biglietto");
			this.validit� = -1;
		}
	}

	@Override
	public String toString() {
		if (validit� == -1) {
			return "Questo biglietto non ha validit�, errore durante la validazione.\n";
		} else {
			return "Biglietto di tipo: Giornaliero. Validit�: "+this.validit�+"� giorno del mese corrente.\n";
		}
	}



}
