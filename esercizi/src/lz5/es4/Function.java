package lz5.es4;

public class Function {
	
	public double sqrt (double a) {
		double sqrt = 0;
		try {
		if (a < 0) {
			throw new ArithmeticException();
		} else {
			sqrt = Math.sqrt(a);
		}
		} catch (ArithmeticException e) {
			System.out.println("no radici di n < 0");
		}
		return sqrt;
	}

	@SuppressWarnings("finally")
	public String read$print (String rif) {
		try {
		if (rif.equals("tucano")) {
			throw new TucanoException();
		} else {
			return rif;
		}
		} catch (TucanoException e) {
			e.printStackTrace();
		} finally {
			return rif;
		}
	}
}
