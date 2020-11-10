/*
 * ESERCIZIO 3 - Scrivere un programma che crea istanze di persone con nome, cognome e mail
 * Gestire le anomalie di mancato inserimento dei dati o di mail mal scritte 
 * (manca la @ oppure manca il dominio) con una eccezione custom
 */

package lz5.es3;

public class Main_lz5e3 {
	
	public static void main (String[] args) {
		
		Persona p1 = new Persona("", "", "cipicipi.org");
		Persona p2 = new Persona("Forrest", "Gump", "forrest.gump@vientam.us");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
