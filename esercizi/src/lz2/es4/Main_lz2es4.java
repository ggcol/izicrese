/*
 * ESERCIZIO 4 - Dare in ingresso 3 nomi, metterli in un array, aggiungere il cognome "Torretti" a tutti e stamparli in ordine alfabetico.
 */

package lz2.es4;

import java.util.Arrays;

public class Main_lz2es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n1 = "Zago";
		String n2 = "Alba";
		String n3 = "Moreno";
		
		String[] container = new String[3];
		container[0] = n1;
		container[1] = n2;
		container[2] = n3;
		
		for (int i = 0; i < container.length; i++) {
			container[i] += " Torretti";
		}
		
		Arrays.sort(container);
		System.out.println(Arrays.toString(container));

	}

}
