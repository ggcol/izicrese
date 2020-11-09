package lz4.es4;

public class Oggetto implements Operativa{
	
	private int a;
	private int[] quadroCubo;
	
	public Oggetto (int a) {
		setA(a);
		setQuadroCubo();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int[] getQuadroCubo() {
		return quadroCubo;
	}

	public void setQuadroCubo() {
		this.quadroCubo = quadratoEcubo(this.a);
	}
	
	static int[] quadratoEcubo (int ingresso) {
		int[] rappresentazione = new int[2];
		rappresentazione[0] = (int) Math.pow(ingresso, 2);
		rappresentazione[1] = (int) Math.pow(ingresso, 3);
		
		return rappresentazione;
		
	}
	

}
