/*
 * ESERCIZIO 4 - Inserire la parola "PrograMatoRRe" e correggerla in "Programmatore" usando i metodi di String. Considerare il case.
 */

package lz1.es4;

public class Main_es4 {

	public static void main(String[] args) {

		String ref = "PrograMatoRRE";
		System.out.println("parola da correggere: "+ref);
		System.out.println("ci lavoro...");
		
		
		System.out.println("parola corretta: "+ref.replace("MatoRRE", "mmatore"));
		
	}

}
