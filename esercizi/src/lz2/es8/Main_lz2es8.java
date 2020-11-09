/*
 * ESERCIZIO 8 - Costruire un array di interi, ordinarlo e stampare tutti gli elementi
 */

package lz2.es8;

import java.util.Arrays;

public class Main_lz2es8 {
	
	public static void main (String[] args) {
		
		int[] order = {3, 4, 7, 1, 3, 10};
		Arrays.sort(order);
		System.out.println(Arrays.toString(order));
	}
	

}
