package lz2.es1;

public class Rettangolo {
	
	private int b;
	private int h;
	private int area;
	
	public Rettangolo(int b, int h) {
		setB(b);
		setH(h);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int calcArea (Rettangolo a) {
		int area = a.getB()*a.getH();
		return area;
	}
	
	public void magg (Rettangolo a, Rettangolo b) {
		if (a.getArea() > b.getArea()) {
			System.out.println("l'area del Rettangolo A è maggiore di B");
		} else if (a.getArea() == b.getArea()) {
			System.out.println("i due rettangoli misurano la medesima area");
		} else {
			System.out.println("l'area del Rettangolo B è maggiore di A");
		}
	}

}
