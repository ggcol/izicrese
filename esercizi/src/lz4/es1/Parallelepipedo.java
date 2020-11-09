package lz4.es1;

public class Parallelepipedo extends Solido {
	
	private int l1quadrilatero;
	private int l2quadrilatero;
	
	public Parallelepipedo (int l1quadrilatero, int l2quadrilatero, int altezza) {
		super.altezza = altezza;
		super.areaBase = l1quadrilatero*l2quadrilatero;
	}

	public int getL1quadrilatero() {
		return l1quadrilatero;
	}

	public void setL1quadrilatero(int l1quadrilatero) {
		this.l1quadrilatero = l1quadrilatero;
	}

	public int getL2quadrilatero() {
		return l2quadrilatero;
	}

	public void setL2quadrilatero(int l2quadrilatero) {
		this.l2quadrilatero = l2quadrilatero;
	}
	
	

}

//A = l*l