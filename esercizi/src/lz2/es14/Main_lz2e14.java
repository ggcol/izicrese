/*
 * ESERCIZIO 14 - Classe Persona con attributo orientamento alimentare (onnivoro, vegetariano). Dati in ingresso 4 piatti (String) 
Usare il controllo ternario per determinare se una persona consuma il pasto o no.
 */

package lz2.es14;

public class Main_lz2e14 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("onnivoro");
		Persona p2 = new Persona("vegetariano");
		
		Piatto a = new Piatto ("bistecca", "onnivoro");
		Piatto b = new Piatto ("insalata", "vegetariano");
		Piatto c = new Piatto ("ratatuille", "vegetariano");
		Piatto d = new Piatto ("croque madame", "onnivoro");
		
		System.out.println(p1.loMangia(p2, a.getIndicazione()));
		
	}


}
