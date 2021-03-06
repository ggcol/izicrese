package lz3.es3;

public class Giornaliero extends Biglietto{


	public Giornaliero() {
	}


	@Override
	public int getValidità() {
		return validità;
	}

	@Override
	public void setValidità(int validità) {
		if (validità > 1 && validità < 31) {
			this.validità = validità;
		} else if (validità < 1 || validità > 31) {
			System.out.println("!!! errore nella generazione del biglietto");
			this.validità = -1;
		}
	}

	@Override
	public String toString() {
		if (validità == -1) {
			return "Questo biglietto non ha validità, errore durante la validazione.\n";
		} else {
			return "Biglietto di tipo: Giornaliero. Validità: "+this.validità+"° giorno del mese corrente.\n";
		}
	}



}
