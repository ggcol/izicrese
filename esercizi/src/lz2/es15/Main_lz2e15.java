/*
 * ESERCIZIO 15 - Basandosi sulla formula del montante M = C*(1-i)^n dove:
C = capitale inziale
i = tasso di interesse (float)
n = numero di anni
M = montante restituito dalla banca dopo n anni al tasso i
Dato in ingresso un tasso di interesse e un capitale iniziale calcolare dopo quanti anni raddoppierà il 
capitale iniziale.
 */
package lz2.es15;

public class Main_lz2e15 {
	
	public static void main (String[] args) {
		
		double C = 200;
		double i = 50; //dato variabile
		int n = 1; //da calcolare
		double M;
		double m;
		
		do {
		m = C*((100+i+n)/100);
		System.out.println("capitale: "+m);
		System.out.println("dopo "+n+" anni");
		n++;
		} while (m != C*2);
	}

}
