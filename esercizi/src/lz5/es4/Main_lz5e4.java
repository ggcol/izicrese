/* ESERCIZIO 4 - Scrivere un programma che richiama due metodi, 
 * uno che esegue radici quadrate e uno che legge stringhe. 
 * Il primo metodo deve gestire l'eccezione relativa alla radice dei 
 * numeri negativi usando l'eccezione fornita dal sistema AritmethicException, 
 * il secondo deve usare una eccezione custom che viene 
 * sollevata se la stringa inserita è "tucano". */

package lz5.es4;

public class Main_lz5e4 {

	public static void main (String[] args) {
		
		Function f = new Function();
		System.out.println(f.sqrt(-12));
		System.out.println(f.sqrt(4));
		System.out.println("==============");
		System.out.println(f.read$print("tucano"));
		System.out.println(f.read$print("provaprova"));
	}
}
