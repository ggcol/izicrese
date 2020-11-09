package lz1.es3;

public class Portafoglio {
	
	private double dindi;
	
	public Portafoglio (double dindi) {
		setDindi(dindi);
	}

	public double getDindi() {
		return dindi;
	}

	public void setDindi(double dindi) {
		this.dindi = dindi;
	}
	
	public double percentuale (double dindi, double percentuale) {
		double calcolato = (this.dindi/100)*percentuale;
		return calcolato;
	}

}
