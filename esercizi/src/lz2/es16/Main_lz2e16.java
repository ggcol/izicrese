/*
 * ESERCIZIO 16 - Dati in ingresso tre numeri, determinare se sono tutti uguali, uno diverso o tutti diversi.
 */

package lz2.es16;

import java.util.Scanner;

public class Main_lz2e16 {
	
	public static void main (String[] args) {
		
		
		System.out.println("inserisci tre numeri: ");
		Scanner s = new Scanner(System.in);
		System.out.println("primo e premi invio:");
		int a = s.nextInt();
		String safe = s.nextLine();
		System.out.println("secondo e premi invio");
		int b = s.nextInt();
		safe = s.nextLine();
		System.out.println("terzo e premi invio");
		int c = s.nextInt();
		safe = s.nextLine();
		
		System.out.println("===== risposta =====");
		uguaglianza(a, b, c);
		
 	}
	
	public static void uguaglianza (int a, int b, int c) {
		if (a == b && b == c) {
			System.out.println("sono tutti uguali");
		} else if (a==b && b != c) {
			System.out.println("a e b sono uguali");
		} else if (a==c && a != b) {
			System.out.println("a e c sono uguali");
		} else if (b==c && b!=a) {
			System.out.println("b e c sono uguali");
		} else {
			System.out.println("i numeri sono tutti differenti");
		}
	}

}
