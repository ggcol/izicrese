/*
 * 
 * ESERCIZIO 5 - Immettere 4 ingredienti come stringhe. Creare due array, uno vuoto e uno con dentro le 4 stringhe. Creare un metodo che controlla
se nell'array ci sono "pomodoro", "mozzarella", "lattuga" e "spezie" e li mette nel secondo array. 
Nel caso in cui il primo array sia vuoto o diversamente costruito segnalarlo a console.
 */

package lz2.es5;

import java.util.Arrays;

public class Main_lz2es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String i1 = "green salad";
		String i2 = "tomatoes";
		String i3 = "olive"; //spezie
		String i4 = "greek cheese"; //mozzarella

		String[] foro = new String [4]; //a //change in length < 4 to provoke IndexOutOfBOundsException
		String[] salad = {i1, i2, i3, i4}; //b
		//		String[] salad = new String [4]; //b case no ingredients // goes into NullPointerException when try sorting if not handled

		checkIfSaladIsOk(foro, salad);

	}

	public static void checkIfSaladIsOk (String[] a, String[] b) {
		try{
			a[0] = "tomatoes";
			a[1] = "mozzarella";
			a[2] = "green salad";
			a[3] = "spices";
			Arrays.sort(a);
			try {
				Arrays.sort(b);
			} catch (NullPointerException e2) {
				//do nothing, go ahead
			}
			if (Arrays.equals(a, b)) {
				System.out.println("salad is ok");
			} else if (Arrays.equals(b, new String[4])) {
				System.out.println("you don't have any ingredients");
			} else {
				System.out.println("it seems you don't have the correct ingredients for this recipe");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("container is to small for all that stuff!");
		}
		
	}

}
