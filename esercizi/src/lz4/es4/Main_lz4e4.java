/*
 * ESERCIZIO 4 - Scrivi un programma che dato un numero 
 * intero in ingresso restituisca un oggetto rappresentativo 
 * del quadrato del numero dato e un oggetto rappresentativo 
 * del cubo del numero assegnato. Implementa l'algoritmo 
 * attraverso l'uso di una interfaccia comune.
 */

package lz4.es4;

import java.util.Arrays;

public class Main_lz4e4 implements Operativa {
	
	public static void main (String[] args) {
		
		Oggetto o = new Oggetto(6);
		
		System.out.println(Arrays.toString(o.getQuadroCubo()));
		
	}

}
