/*
 * ESERCIZIO 12 - Dati in ingresso 4 numeri casuali da 0 a 10 determina se ce ne sono di uguali, poi restituisce prima il più grande poi il più piccolo.
 */

package lz2.es12;

import java.util.Arrays;

public class Main_lz2es12 {

	public static void main(String[] args) {

		int a = (int) (Math.random()*10)+1;
		int b = (int) (Math.random()*10)+1;
		int c = (int) (Math.random()*10)+1;
		int d = (int) (Math.random()*10)+1;

		System.out.println("numero a: "+a);
		System.out.println("numero b: "+b);
		System.out.println("numero c: "+c);
		System.out.println("numero d: "+d);
		
		anyEquals(a, b, c, d);
		
		int[] container = {a, b, c, d};
		Arrays.sort(container);
		System.out.println("numero più piccolo: "+container[0]);
		System.out.println("numero più grande: "+container[3]);
	}

	public static void anyEquals (int a, int b, int c, int d) {
		if (a == b) {
			System.out.println("il numero A è uguale al numero B");
		} else if (a == c) {
			System.out.println("il numero A è uguale al numero C");
		} else if (a == d) {
			System.out.println("il numero A è uguale al numero D");
		} else if (b == c) {
			System.out.println("il numero B è uguale al numero C");
		} else if (b == d) {
			System.out.println("il numero B è uguale al numero D");
		} else if (c == d) {
			System.out.println("il numero C è uguale al numero D");
		} else {
			System.out.println("nessun numero è uguale");
		}
		}



	}
