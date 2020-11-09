/*
 * ESERCIZIO 5 - Scrivi un programma che sia in grado di istanziare 
 * degli oggetti 'distributori di benzina' di cui sia nota la città, 
 * il proprietario, la capacità e la benzina attualmente contenuta 
 * nel distributore. Dell'oggetto Distributore, deve essere 
 * possibile simulare le operazioni di erogazione del carburante e dei 
 * corrispondenti incassi.
 */

package lz4.es5;

public class Main_lz4e5 {
	
	public static void main (String[] args) {
		
		Distributore d1 = new Distributore (1, "Aulla", 100000, 50000, 1.00);
		
		d1.erogazione(60);
		System.out.println(d1.getCassa());
		System.out.println(d1.getAttuale());
		
		d1.erogazione(150);
		System.out.println(d1.getCassa());
		System.out.println(d1.getAttuale());
		
		d1.erogazione(40000);
		System.out.println(d1.getCassa());
		System.out.println(d1.getAttuale());
		
		d1.rifornimentoSettimanale(60000);
		System.out.println(d1.getAttuale());
		
		d1.erogazione(1200000);
		System.out.println(d1.getCassa());
		System.out.println(d1.getAttuale());
	}

}
