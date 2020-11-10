/*
 * ESERCIZIO 6 - Programma che riempie un array di numeri progressivi e solleva una 
 * eccezione se viene inserito un numero più basso del precedente
 */

package lz5.es6;

import java.util.Arrays;

public class Main_lz5e6 {
	
	public static void main (String[] args) {
		
		int[] container = new int[10];
		
		try {
			for (int i = 1; i < container.length; i++) {
//				if (i == 5) {
//					container[i] = 2;
//				} else {
				container[i] = i;
//				}
				if (container[i] < container [(i-1)]) {
					throw new NoMinorNumber();
				}
			}
		} catch (NoMinorNumber e) {
			e.printStackTrace();
		}
		
		
		System.out.println(Arrays.toString(container));
		
	}

}
