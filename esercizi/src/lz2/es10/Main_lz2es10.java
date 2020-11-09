/*
 * ESERCIZIO 10 - Dati in ingresso 4 numeri casuali, determinare se sono pari o dispari o lo zero
 */
package lz2.es10;

import java.util.Random;

public class Main_lz2es10 {

	public static void main(String[] args) {

		Random r = new Random();

		int a = r.nextInt(100);
		int b = r.nextInt(100);
		int c = r.nextInt(100);
		int d = r.nextInt(100);

		int[] container = {a, b, c, d};
		
		for (int i = 0; i < container.length; i++) {
			System.out.println("il numero generato è: "+container[i]+", il numero è: "+kindOf(container[i]));
		}

	}

	public static String kindOf (int n) {
		switch (n) {
		case 0:
			String ref = "0";
			return ref;
		default:
			ref = ((n%2) == 0) ? "pari":"dispari";
			return ref;
		}

	}

}
