/*
 * ESERCIZIO 4 - Dati in ingresso tre lati di un triangolo dire se il triangolo esiste. Un triangolo esiste se ogni lato è minore della somma degli altri due.
 */

package lz3.es4;

import java.util.Scanner;

public class Mainlz3_e4 {
	
	public static void main (String[] args) {
		
		Triangolo t = new Triangolo();
		
		System.out.println("Ciao sono un controlla-triangoli!");
		System.out.println("Inserisci 3 numeri che valorizzeranno\ni lati del triangolo\n(dopo ognuno premi invio pls)");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		String safe = s.nextLine();
		int b = s.nextInt();
		safe = s.nextLine();
		int c = s.nextInt();
		safe = s.nextLine();
		
		s.close();
		
		t.setL1(a);
		t.setL2(b);
		t.setL3(c);
		
		System.out.println("Un triangolo esiste se ogni lato è minore della somma degli altri due.");
		System.out.println("Il tuo triangolo esiste? "+t.exist(t));
	}

}
