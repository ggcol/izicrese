/*
 * ESERCIZIO JOLLY (realizzabile anche senza interfacce o classi astratte) - 
 * Scrivere un programma che gestisca contenitori. I contenitori possono avere al loro 
interno acido, ammoniaca, acqua o tè. Scrivere un metodo che presi in ingresso un array 
di contenitori e l'indicazione "bevibili" o "nocivi" restituisca un array
filtrato dei contenitori con liquidi bevibili o nocivi.
 */

package lz4.esJolly;

import java.util.Arrays;

public class Main_lz4_eJolly {

	public static void main(String[] args) {
		
		Contenitore[] produzione = new Contenitore[4];
		/* che strana fabbrica... */
		produzione[0] = new Contenitore("acido", "nocivi");
		produzione[1] = new Contenitore("acqua", "bevibili");
		produzione[2] = new Contenitore("ammoniaca", "nocivi");
		produzione[3] = new Contenitore("tè", "bevibili");
		
		System.out.println("La produzione consegna queste merci: ");
		System.out.println(Arrays.toString(produzione));
		System.out.println();
		
		Storage s1 = new Storage ("Bevibili");
		
		s1.filtra(produzione);
		System.out.println(s1.toString());
		System.out.println(Arrays.toString(s1.getCapacità()));
		System.out.println();
		
		Storage s2 = new Storage("Nocivi");
		s2.filtra(produzione);
		System.out.println(s2.toString());
		System.out.println(Arrays.toString(s2.getCapacità()));

	}

}
