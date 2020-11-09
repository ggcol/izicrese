/*
ESERCIZIO 3 - Costruire una struttura di classi Biglietto con field numero. Costruire tre sottoclassi gironaliero, settimanale e mensile con attributi 
rispettivamente: giorno di validità (il numero del giorno del mese), settimana di validità e mese di validità.
Implementare un controllo via incapsulamento che verifichi che i giorni o settimane o mesi inseriti siano sensati.
Classe Utente con attributo array di biglietti e metodo acquista.
Far acquistare tre biglietti a un utente e stampare numero, tipo e validità di ognuno.
 */

package lz3.es3;

import java.util.Arrays;
import java.util.Scanner;

public class Main_lz3e3 {

	public static void main (String[] args) {

		BigliettoFactory bF = new BigliettoFactory();

		Persona p = new Persona();
		int flag = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Benvenuto alla biglietteria");

			do {
				System.out.println("Vedo che hai ancora spazio nel portafoglio...");
				System.out.println("Inserisci il tipo del biglietto che vuoi acquistare");
				System.out.println("(giornaliero, settimanale, mensile)");
				String scelta = s.nextLine();

				System.out.println("\nOk! Indicami la validità che vuoi dare al biglietto");
				System.out.println("(1-31 - giornaliero\n1-52 - settimanale\n1-12 - mensile");
				int validazione = s.nextInt();
				String safe = s.nextLine();

				/* istanzia il corretto tipo di biglietto tramite una factory */
				Biglietto b = bF.getATicket(scelta);

				try {
					b.setValidità(validazione);
					/* se non inserisci "giornaliero", "settimanale" o "mensile" chiamare "setValidità" solleva 
					 * un'Eccezione siccome la factory di fatto, così, non ha istanziato nessuna classe e non ci può
					 * richiamare il metodo
					 */

				} catch (NullPointerException e) {
					System.out.println("non hai scelto una tipologia valida di biglietto");	
				}

				p.acquista(b);
				flag++;

			} while (flag < 3);

			System.out.println("\nEcco qua, ora dovresi avere:");
			System.out.println(Arrays.toString(p.getPortafoglio()));
			s.close();
		}
	}

}
