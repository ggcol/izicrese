package lz4.es6;

public class Operazione implements Calc {
	
	private int operando1; 
	private int operando2;
	
	public Operazione(int a, int b) {
		setOperando1(a);
		setOperando2(b);
	}

	public int getOperando1() {
		return operando1;
	}

	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}

	public int getOperando2() {
		return operando2;
	}

	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	
	

}
