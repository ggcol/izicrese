/*
 * ESERCIZIO 1 - Rendere interattivo il programma calcolatrice. Attenzione alle divisioni per zero.
 */

package lz7.es1;

import java.util.Scanner;

public class Main_lz7e1 {

	public static void main (String[] args) {

		String ripeti;

		do {
			
			Scanner s = new Scanner(System.in);
			System.out.println("inserisci primo numero:");
			int op1 = s.nextInt();
			String safe = s.nextLine();

			System.out.println("inserisci secondo numero:");
			int op2 = s.nextInt();
			safe = s.nextLine();

			System.out.println("Ok, ora seleziona l'operazione che vuoi eseguire:");
			System.out.println("0 - somma, 1 - sottrazione, 2 - moltiplicazione\n3 - divisione, 4 - modulo, 5 - potenza, 6 - sqrt");
			int scelta = s.nextInt();
			safe = s.nextLine();

			Calcolatrice c = new Calcolatrice(op1, op2);
			int result = (int) c.operazione(scelta);
			System.out.println(result);

			System.out.println("Vuoi fare un'altra operazione? \n(y/n)");
			ripeti = s.nextLine();
			
		} while (ripeti.equalsIgnoreCase("y"));
		
		System.out.println("Arrivederci.");
	}
}
