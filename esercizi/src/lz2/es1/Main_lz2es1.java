/*
 * ESERCIZIO 1 – Dati due rettangoli, calcolarne l’area e mandare in uscita da un metodo qual è il più grande.
 */

package lz2.es1;

public class Main_lz2es1 {
	
	public static void main (String[] args) {
	
	Rettangolo a = new Rettangolo (2, 5);
	Rettangolo b = new Rettangolo (5, 2);
	
	a.setArea(a.calcArea(a));
	b.setArea(b.calcArea(b));
	
	a.magg(a, b);
	
	}

}
