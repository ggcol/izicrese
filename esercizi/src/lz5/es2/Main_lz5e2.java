/*
 * ESERCIZIO 2 - Scrivere un programma che gestisce l'inserimento 
 * dei dati in un array e solleva una eccezione gestita quando viene 
 * superata la dimensione dell'array
 */

package lz5.es2;

import java.util.Arrays;

public class Main_lz5e2 {

	public static void main(String[] args) {

		
		int[] container = new int[4];
		int[] flagger = new int [6];
		
		
		try {
		for (int i = 0; i < flagger.length; i++) {
			container[i] = i;
		}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("non ce ne stanno più!");
		} finally {
			System.out.println("però ci sono stati questi:");
			System.out.println(Arrays.toString(container));
		}
		
		
	}

}
