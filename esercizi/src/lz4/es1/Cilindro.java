package lz4.es1;

public class Cilindro extends Solido {
	
	private double rcerchio;
	
	public Cilindro (int rcerchio, int altezza) {
	super.altezza = altezza;
	super.areaBase = (Math.pow(rcerchio, 2))*3.14;
	}

	public double getRcerchio() {
		return rcerchio;
	}

	public void setRcerchio(double rcerchio) {
		this.rcerchio = rcerchio;
	}

	
}


