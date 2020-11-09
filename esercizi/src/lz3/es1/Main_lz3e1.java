/*
 * ESERCIZIO 1 - Classe Utente attributi nome, cognome, età
Usare l'incapsulamento per segnalare con un errore la creazione di una istanza con nome e cognome non valorizzati (null) e con età minore di 18 anni.
 */

package lz3.es1;

public class Main_lz3e1 {

	public static void main(String[] args) {
		
		Utente u1 = new Utente ("Pippo", "Cippi", 47);
		System.out.println(u1.toString());
		
		System.out.println("\n");
		
		
		Utente u2 = new Utente (null, null, 5);
		System.out.println(u2.toString());
	}

}
