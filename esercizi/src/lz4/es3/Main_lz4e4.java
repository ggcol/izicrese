/*
 * ESERCIZIO 3 - Scrivi un programma che simuli il lancio di un dado e di una moneta 
 * stampandone il risultato. Utilizzare una classe astratta che 
 * rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.
 */

package lz4.es3;

import java.util.Scanner;

public class Main_lz4e4 {

	public static void main(String[] args) {

		Moneta m = new Moneta();

		System.out.println("lancio la moneta...");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		m.lancio();
		
		System.out.println("Ok, ora proviamo con un dado: ");
		System.out.println("digita il numero di facce che il dado deve avere");
		Scanner s = new Scanner(System.in);
		int facce = s.nextInt();
		@SuppressWarnings("unused")
		String safe = s.nextLine();
		s.close();
		Dado d = new Dado();
		d.setFaccia(facce, d.dadoExist(facce));
		System.out.println("Ora lanciamo il dado...");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("E' uscito un "+d.lancio());
		
		
		
	}

	
}
