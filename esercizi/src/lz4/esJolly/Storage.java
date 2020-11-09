package lz4.esJolly;


public class Storage {

	private String indicazione;
	//sala nocivi, sala bevibili
	private Contenitore[] capacità = new Contenitore[2];

	public Storage (String indicazione) {
		setIndicazione(indicazione);
	}

	public String getIndicazione() {
		return indicazione;
	}

	public void setIndicazione(String indicazione) {
		this.indicazione = indicazione;
	}

	public Contenitore[] getCapacità() {
		return capacità;
	}

	public void setCapacità(Contenitore[] capacità) {
		this.capacità = capacità;
	}

	public Contenitore[] filtra (Contenitore[] produzione) {
		int flag = 0;
		for (int i = 0; i < produzione.length; i++) {
			if (produzione[i].getIndicazione().equalsIgnoreCase(this.indicazione)) {
				capacità[flag] = produzione[i];
				flag++;
			}
		}
		return capacità;
	}

	public String toString() {
		return "Questa è la Sala "+indicazione+" contiene:";
	}
}
