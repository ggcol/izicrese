/*
 * ESERCIZIO 4 - In una fabbrica di bevande alcoliche e analcoliche un braccio 
 * meccanico può prendere bottiglie per riempirle o svuotarle. 
 * Le bottiglie sono caratterizzate dal tipo di contenuto e dall'essere piene o vuote.
 * Date nel magazzino 4 bottiglie, implementare un sistema interattivo che le 
 * riempie di bevande alcoliche o analcoliche, le svuota e stampa lo stato di 
 * tutte e quattro
 */

package lz8.es4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Main_lz8e4 {
	
	public static void main (String[] args) {
		
		Magazzino m1 = new Magazzino();
		System.out.println(m1.getStorage());
		
		int flag = 4; // questo lo decide l'utente
		
		m1.ricevoBottiglie(flag);
		
		System.out.println(m1.getStorage());
		
		m1.riempiBottiglia(m1.getStorage(), 0, 0);
		m1.riempiBottiglia(m1.getStorage(), 1, 0);
		
		System.out.println(m1.getStorage());

		m1.riempiMultiple(m1);
		
		System.out.println(m1.getStorage());

		
		
		
		
		
		

	}

}
