package lz4.esJolly;


public class Storage {

	private String indicazione;
	//sala nocivi, sala bevibili
	private Contenitore[] capacit� = new Contenitore[2];

	public Storage (String indicazione) {
		setIndicazione(indicazione);
	}

	public String getIndicazione() {
		return indicazione;
	}

	public void setIndicazione(String indicazione) {
		this.indicazione = indicazione;
	}

	public Contenitore[] getCapacit�() {
		return capacit�;
	}

	public void setCapacit�(Contenitore[] capacit�) {
		this.capacit� = capacit�;
	}

	public Contenitore[] filtra (Contenitore[] produzione) {
		int flag = 0;
		for (int i = 0; i < produzione.length; i++) {
			if (produzione[i].getIndicazione().equalsIgnoreCase(this.indicazione)) {
				capacit�[flag] = produzione[i];
				flag++;
			}
		}
		return capacit�;
	}

	public String toString() {
		return "Questa � la Sala "+indicazione+" contiene:";
	}
}
