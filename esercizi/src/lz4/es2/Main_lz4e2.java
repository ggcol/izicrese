/*
 * ESERCIZIO 2 - Scrivere un programma che istanzi opere d'arte identificate dal nome dell'opera, il nome dell'artista e il loro ingombro. 
Le opere possono essere quadri e sculture, i quadri hanno lughezza e altezza e le sculture lunghezza, altezza e profondità.
Inserire le opere d'arte in un array e implementare un'interfaccia che calcoli l'ingombro totale delle operee un metodo equals(Opera x, Opera y)  che controlla
se sono uguali.
 */

package lz4.es2;

public class Main_lz4e2 {
	
	public static void main (String[] args) {
		
		Quadro q = new Quadro(20, 60, "Il muro di nebbia");
		q.setVolume(q.calcVolume(q));
		
		System.out.println(q.toString());
		
		Statua s = new Statua(20, 60, 500, "Introspezione di Tower");
		s.setVolume(s.calcVolume(s));
		
		Statua s2 = new Statua(20, 60, 500, "Introspezione di Tower");
		
		System.out.println(s.toString());
		
		OperaArte[] esposizione = {q, s};
		
		int somma = s.totVolume(esposizione);
		System.out.println(somma);
	
		System.out.println(s.uguale(s, s2));
	}

}
