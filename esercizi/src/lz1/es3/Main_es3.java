//ESERCIZIO 3 – Classe portafoglio con attributo un valore in denaro euro,centesimi. 
//Calcolarne una percentuale a piacere usando valore e percentuale come dati di ingresso di un metodo.

package lz1.es3;

public class Main_es3 {

	public static void main(String[] args) {

		Portafoglio p1 = new Portafoglio(15.70);
		
		double percentuale = 20;
		
		System.out.println(p1.percentuale(p1.getDindi(), percentuale));
		
	}

}
