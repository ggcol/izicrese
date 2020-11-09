/*
 * ESERCIZIO 2 - Classe Eroe con attibuti nome, forza, saggezza e destrezza. Tre classi Mago, arciere e guerriero estendono Eroe.
Il mago deve avere saggezza uguale o superiore a 15
l'arciere deve avere destrezza uguale o sueriore a 15
Il guerriero deve avere forza uguale o superiore a 15
Generare casualmente tra 10 e 20 i valori delle tre abilità, assicurandosi che solo una possa superare il 15 e che almeno una lo superi e poi istanziare la 
classe relativa.
 */

package lz3.es2;

public class Main_lz3e2 {
	
	public static void main (String[] args) {
		
		HeroFactory hF = new HeroFactory();
	
		Eroe e = hF.getAnHero();
		System.out.println(e.competenza());
		
	}

}
