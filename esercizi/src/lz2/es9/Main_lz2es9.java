/*
 * ESERCIZIO 9 - Inserire delle stringhe in un array e restituire quelle che cominciano con una maiuscola.
 */

package lz2.es9;

public class Main_lz2es9 {
	
	public static void main (String[] args) {
		
		
		String[] container = {"Prova", "prova", "provA"};
		
		System.out.println("first case:");
		startsWithUpperCase(container); //stampa solo la parola a indice 0
		
		container[1] = "Cambio";
		System.out.println("===========");
		
		System.out.println("second case:");
		startsWithUpperCase(container);
		
		
	}
	
	public static void startsWithUpperCase (String[] a) {
		for (int i = 0; i < a.length; i++) {
			char check = a[i].charAt(0);
			boolean isUpperCase = Character.isUpperCase(check);
			if (isUpperCase == true) {
				System.out.println(a[i]);
			} 
		}
	}

}
