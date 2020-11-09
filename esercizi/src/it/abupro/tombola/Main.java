package it.abupro.tombola;
import java.util.*;


public class Main {

	@SuppressWarnings("rawtypes")
	public static void main (String[] args) {

		//inizializza tutti gli array necessari
		List sacchetto = new ArrayList(89); 
		List pescati = new ArrayList(89);
		List paragone = new ArrayList(89);

		System.out.println("PARTENZA");
		System.out.println("numeri nel sacchetto: "+sacchetto);
		System.out.println("numeri pescati: "+pescati);
		System.out.println("lista paragone: "+paragone);
		System.out.println("===========");


		//sposta indice lista di destinazione numeri
		int incremental = 0;

		//riempie di numeri i contenitori
		for (int riempi = 0; riempi < 90; riempi++) {
			sacchetto.add(riempi, (riempi+1));
			paragone.add(riempi, 0);
			pescati.add(riempi, 0);
		}

		System.out.println("RIEMPIMENTO");
		System.out.println("numeri nel sacchetto: "+sacchetto);
		System.out.println("numeri pescati: "+pescati);
		System.out.println("lista paragone: "+paragone);
		System.out.println("===========");

		try {
			do {

				//pesca un numero casuale dal sacchetto
				int pescato = pesca(sacchetto);
				System.out.println("numero estratto: " + pescato + " conta: " + incremental);

				//mette da parte il numero pescato
				pescati.set(incremental, pescato);
				incremental++;

			} while (!sacchetto.equals(paragone));

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		System.out.println("sono stati pescati tutti i numeri");

		System.out.println("\n===========");
		System.out.println("FINALE");
		System.out.println("numeri nel sacchetto: "+sacchetto);
		System.out.println("numeri pescati: "+pescati);
		System.out.println("lista paragone: "+paragone);
		System.out.println("sacchetto uguale a paragone: "+sacchetto.equals(paragone));
		System.out.println("===========");

	}

	public static int pesca (List sacchetto) {
		int pescato;
		do {
			Random numero = new Random();
			int position = numero.nextInt(90);
			pescato = (int) sacchetto.get(position);
			sacchetto.set(position, 0);
		} while (pescato == 0);
		return pescato;
	}



}
