/*
 * ESERCIZIO 5 - Creare due variabili, alla prima si assegna un numero random da 0 a 100, alla seconda da 50 a 100
 */

package lz1.es5;

import java.util.Random;

public class Main_es5 {
	
	public static void main (String[] args) {
		
	int a = 0;
	int b = 100;
	int c = 50;
	
	System.out.println("tra 0 e 100: "+genera(a, b));
	System.out.println("tra 50 e 100: " +genera(c, b));
	
	}
	
	public static int genera (int lowerBound, int upperBound) {
		Random randomico = new Random();
		int numero;
		do {
			numero = randomico.nextInt(100);
		} while (numero < lowerBound || numero > upperBound);
		return numero;
	}
}