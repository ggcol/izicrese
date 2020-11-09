/*
 * ESERCIZIO 6 - Inserire un giorno della settimana, per ogni giorno stampare il numero del giorno della settimana corrente.
 */


// NOVEMBRE 2020
package lz2.es6;

import java.util.Arrays;

public class MAin_lz2es6 {

	public static void main(String[] args) {


		String[] days = {"Dom", "Lun", "Mar", "Mer", "Gio", "Ven", "Sab"};
		String[] month = new String[30];
		int[] num = new int[30];

		//riempio di numeri
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}

		System.out.println(Arrays.toString(num));

		//inserisco i giorni
		try{
			for (int i = 0; i < 30; i = i+7) {
				month[i] = days [0];
				month[i+1] = days [1];
				month[i+2] = days [2];
				month[i+3] = days [3];
				month[i+4] = days [4];
				month[i+5] = days [5];
				month[i+6] = days [6];
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("notifico IOBE");
			for (int i = 0; i < 28; i = i+7) {
				month[i] = days [0];
				month[i+1] = days [1];
				month[i+2] = days [2];
				month[i+3] = days [3];
				month[i+4] = days [4];
				month[i+5] = days [5];
				month[i+6] = days [6];
			}
		}

		System.out.println(Arrays.toString(month));
		
		System.out.println("stampo calendario:");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(month[i]+" "+num[i]+"/11/2020");
		}


	}

}
