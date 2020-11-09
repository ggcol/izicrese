/*
 * ESERCIZIO 7 - In un aerodromo si vogliono salvare informazioni sugli aeromobili.
 * Di ogni aeromobile si vuole sapere la sigla (string) che lo identifica.
 * Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive 
 * l'efficienza aereodinamica.
 * Gli aerei a motore sono caratterizzati invece dalla potenza in CV del motopropulsore (double).
 * Gli alianti si confrontano in base all'efficienza, gli aerei a motore in base alla potenza in CV.
 * Scrivi un'interfaccia pubblica 'comparazione' contenente un metodo boolean 'superiore' 
 * per verificare se un aeromobile è superione a un altro come prestazioni.
 * Il metodo deve sempre restituire un messaggio di errore se gli aeromobili 
 * non sono coparabili o se uno dei parametri in ingresso è null.
 */

package lz4.es7;

public class Main_lz4e7 {
	
	public static void main (String[] args) {
		
		Aeromobile a1 = new Aliante ("PRV1", 50);
		Aeromobile a2 = new Aereo ("PRV2", 230.5);
		Aeromobile a3 = new Aliante ("PRV3", 70);
		Aeromobile a4 = null;
		Aeromobile a5 = new Aereo("PRV4", 450.62);
		
		Aeromobile helper = new Aeromobile();
		
		helper.superiore(a5, a2);

	}
	

}
