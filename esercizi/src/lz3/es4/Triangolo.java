package lz3.es4;

public class Triangolo {
	
	private int l1;
	private int l2;
	private int l3;
	
	public Triangolo() {}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}
	
	public boolean exist (Triangolo t) {
		boolean exit = false;
		if (l1 < (l2+l3) && l2 < (l1+l3) && l3 < (l1+l2)) exit = true;
		return exit;
	}

}
