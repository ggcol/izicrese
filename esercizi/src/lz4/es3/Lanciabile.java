package lz4.es3;

import java.util.Random;

abstract class Lanciabile {
	
	abstract int lancio();
	
	static int randomico(int lowerBound, int upperBound) {
		Random r = new Random();
		int ritorno = 0;
		do {
			ritorno = r.nextInt(upperBound+1);
		} while (ritorno < lowerBound || ritorno > upperBound);
		return ritorno;
	}

}
