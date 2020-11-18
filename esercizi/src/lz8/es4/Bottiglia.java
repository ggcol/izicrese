package lz8.es4;

public class Bottiglia<T> {
	
	private int id; 
	private T contenuto;
	private boolean piena;
	
	public Bottiglia (int i) {
		setId(i);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public T getContenuto() {
		return contenuto;
	}

	public void setContenuto(T contenuto) {
		if (contenuto != null) {
		this.contenuto = contenuto;
		setPiena(true);
		} else {
			setPiena(false);
		}
	}

	public boolean isPiena() {
		return piena;
	}

	public void setPiena(boolean piena) {
		this.piena = piena;
	}
	
	public String toString () {
		if (piena == true) {
			return "bottiglia n."+id+" contenuto: "+contenuto;
		} else {
			return "bottiglia n."+id+" vuota";
		}
	}

	
}
