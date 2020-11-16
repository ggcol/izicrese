/*
 * ESERCIZIO 1 - Classe 'Persona' con nome, congome e compleanno chiesti in ingresso. 
 * Mettere le persone dentro un array e stamparlo. Un utente può indicare
 * un compleanno e gli vengono fornite le persone che compiono gli anni in quella data.
 */

package lz6.es1;

import java.util.Date;
import java.text.DateFormat;
import java.util.Arrays;

public class Main_lz6e1 {
	
	public static void main (String[] args) {
		
		
		Persona p1 = new Persona ("Forrest", "Gump", new Date ("01/01/1940"));
		Persona p2 = new Persona ("Ten.", "Dan", new Date("12/12/2012"));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		Persona[] container = {p1, p2};
		
//		String ricerca = "01/01/40";
		String ricerca = "12/12/12";
		Date comparable = new Date(ricerca);
		
		System.out.println("ricerca");
		for (Persona p : container)  {
			if (p.getCompleanno().equals(comparable)) {
				System.out.println(p.toString());
			}
		}
	}

}
