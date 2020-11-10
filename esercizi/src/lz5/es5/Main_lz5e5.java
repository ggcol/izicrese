/*
 * ESERCIZIO 5 - Scrivere un programma che mette in un array una serie di esseri viventi. 
 * Uno degli attributi degli esseri viventi è il booleano 'esiste'.
 * Il programma lancia una eccezione gestita quando si cerca di mettere 
 * nell'array un essere che non esiste (drago, balrog, Chtuhlu ecc)
 */

package lz5.es5;

import java.util.Arrays;

public class Main_lz5e5 {
	
	public static void main (String[] args) {
		
		Essere e1 = new Essere("Forrest", true);
		Essere e2 = new Essere("Chtuhlu", /*unfortunately*/ false);
		Essere e3 = new Essere("Bubba", true);
		Essere e4 = new Essere("Dio", false);
		
		Essere[] container = {e1, e2, e3, e4};
		Essere[] esistono = new Essere[4];
		
		for (int i = 0; i < container.length; i++) {
			try {
				if (container[i].isEsiste() == true) {
					esistono[i] = container[i];
					container[i] = null;
				} else {
					throw new DoNotExistException();
				}
			} catch (DoNotExistException e) {
				e.printStackTrace();
			}
		}
		System.out.println("questi non esistono: "+Arrays.toString(container));
		System.out.println("questi esistono: "+Arrays.toString(esistono));
		
	}

}
