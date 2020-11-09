/*
 * ESERCIZIO 2 – Dati in ingresso quattro numeri double.
Un metodo prende i due più piccoli e ne fa il modulo.
Un altro  prende i due più piccoli e li somma, ma restituisce un intero.
Un terzo prende i risultati dei due metodi precedenti e li mostra entrambi.
 */

package lz2.es2;

import java.util.*;

public class Main_lz2es2 {

	public static void main (String[] args) {

		double a = 2.3;
		double b = 5.65;
		double c = 6.234;
		double d = 7.7;

		double[] container = {a, b, c, d};
		Arrays.sort(container);
		System.out.print("sorting: ");
		System.out.println(Arrays.toString(container));

		showResults(moduleSmaller(container), sumSmallerAsInt(container));


	}

	public static double moduleSmaller (double[] container) {
		double module = (container[0]%container[1]);
		return module;
	}

	public static int sumSmallerAsInt (double[] container) {
		int sum = (int) (container[0]+container[1]);
		return sum;
	}
	
	public static void showResults (double module, int sum) {
		System.out.println("module of smaller 2: "+module);
		System.out.println("sum of smaller 2 as int: "+sum);
	}
}
