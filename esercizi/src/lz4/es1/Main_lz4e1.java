/*
 * ESERCIZIO 1 - Realizza un programma che sia in grado di valutare il volume di cilindri e parallelepipedi basandosi sul valore della 
loro area di base e dell'altezza. Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.
 */

package lz4.es1;

public class Main_lz4e1 {
	
	public static void main (String[] args) {
		
		Cilindro c = new Cilindro(4, 6);
		
		c.setVolume(c.calcoloVolume());
		
		System.out.println("cilindro:\n"+c.toString());
		
		Parallelepipedo p = new Parallelepipedo(10, 6, 5);
		
		p.setVolume(p.calcoloVolume());
		
		System.out.println("parallelepipedo:\n"+p.toString());
		
	}

}
