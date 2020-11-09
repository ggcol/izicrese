/*
 * ESERCIZIO 13 - Dato in ingresso un numero tra 1 e 7 restituisce il giorno della settimana relativo. Usare switch
 */

package lz2.es13;

import java.util.Scanner;

public class Main_lz2e13 {

	public static void main (String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("inserire un numero tra 1 e 7");
		int a = s.nextInt();
		String safe = s.nextLine();
		s.close();
		
		System.out.println(whichDay(a));
		


	}

	public static String whichDay (int a) {
		switch (a) {
		case 1:
			String ref = "Lunedì";
			return ref;
		case 2: 
			ref = "Martedì";
			return ref;
		case 3: 
			ref = "Mercoledì";
			return ref;
		case 4:
			ref = "Giovedì";
			return ref;
		case 5: 
			ref = "Venerdì";
			return ref;
		case 6:
			ref = "Sabato";
			return ref;
		case 7:
			ref = "Domenica";
			return ref;
		default:
			ref = "non hai inserito un valore valido";
			return ref;
		}
	}

}
