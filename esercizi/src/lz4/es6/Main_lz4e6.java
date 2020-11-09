/*
 * ESERCIZIO 6 - Realizzare una interfaccia che definisce le 4 operazioni.
 *  Creare una classe "Operazione" che ha due operandi come attributi. 
 *  Fargli eseguirele 4 operazioni e integrare nel modello del programma
 *   una classe astratta che si preoccupi della stampa a video del risultato
 */

package lz4.es6;

public class Main_lz4e6 extends Printer {
	
	public static void main (String[] args) {
		
		int a = 2;
		int b = 3;
		
		Operazione o = new Operazione(a, b);
		
		stampa(o.somma(o));
		stampa(o.sottrazione(o));
		stampa(o.moltiplicazione(o));
		stampa(o.divisione(o));
		
	}

}
