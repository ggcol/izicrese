package lz1.es6;

public class Main_es6 {
	
	public static void main (String[] args) {
	
	Dot d1 = new Dot (1, 8);
	Dot d2 = new Dot (3, 12);
	
	System.out.println("coordinate primo punto");
	System.out.println("x: "+d1.getX()+" y: "+d1.getY());
	System.out.println("coordinate secondo punto");
	System.out.println("x: "+d2.getX()+" y: "+d2.getY());
	System.out.println("===========");
	System.out.println("distanza tra i due punti: "+d1.distanceOnPlane(d1, d2));
	}

}
