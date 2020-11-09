/*
 * ESERCIZIO 3 - Inserire un intero 'dimensione array'. Creare un array e riempirlo di numeri incrementali da 0 in poi fino a che l'array risulta pieno.
 */

package lz2.es3;

import java.util.Arrays;

public class Main_lz2es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lengTH = 5;
		System.out.println("lunghezza dell'array: "+lengTH);
		
		int[] container = new int[lengTH];
		System.out.println("array appena inizializzato: "+Arrays.toString(container));
		System.out.println("riempio l'array...");
		
		for (int i = 0; i < container.length; i++) {
			container[i] = i;
			System.out.println("inserisco :"+container[i]+" in posizione: "+i);
		}
		
		System.out.println("array riempito: "+Arrays.toString(container));
		
		

	}

}
