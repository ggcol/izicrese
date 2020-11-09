package lz1.es6;

public class Dot {
	
	private double x;
	private double y;
	
	public Dot (double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distanceOnPlane (Dot d1, Dot d2) {
		//elevo alla seconda
		double xb2 = Math.pow(d2.getX(), 2);
		double xa2 = Math.pow(d1.getX(), 2);
		double yb2 = Math.pow(d2.getY(), 2);
		double ya2 = Math.pow(d1.getY(), 2);
		//exp per sqrt
		double exp = (xb2-xa2)+(yb2-ya2);
		//sqrt
		double distance = Math.sqrt(exp);
		return distance;
	}
}
