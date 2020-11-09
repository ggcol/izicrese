package lz3.es3;

public class Persona {
	
	private Biglietto[] portafoglio = new Biglietto [3];

	public Persona() {
	}

	public Biglietto[] getPortafoglio() {
		return portafoglio;
	}

	public void setPortafoglio(Biglietto[] portafoglio) {
		this.portafoglio = portafoglio;
	}
	
	public Biglietto[] acquista (Biglietto b) {
		
		for (int i = 0; i < portafoglio.length; i++) {
			if (portafoglio[i] == null) {
				portafoglio[i] = b;
				break;
			}
		}
		
		return portafoglio;
	}

}
