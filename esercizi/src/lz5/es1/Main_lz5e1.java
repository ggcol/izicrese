/*
 * ESERCIZIO 1 - Scrivere un programma che fa divisioni di due numeri 
 * interi in ingresso e che gestisce la divisione per zero
 */

package lz5.es1;

public class Main_lz5e1 {
	
	public static void main (String[] args) {
		
		try {
		System.out.println(divisione (10, 0));
		} catch (ArithmeticException aE) {
			System.out.println("Sono numeri interi, non puoi dividere per 0!!!");
		} finally {
			System.out.println("finally... qualcuno che sa la matematica!");
		}
	}

	static int divisione (int a, int b) {
		int risultato = a/b;
		return  risultato;
	}
}
