/*
 * ESERCIZIO 11 - Date in ingresso tre stringhe determina la più lunga e la più breve
 */

package lz2.es11;

import java.util.Arrays;

public class Main_lz2es11 {

	public static void main(String[] args) {

		/* soluzione 1
		 * 
		 */

		String a = null;
		String b = "new Strunga";
		String d = "new String4";

		longer(a, b, d);

		/* fine s1
		 * 
		 */

		
		/*
		 * soluzione 2
		 */
		String[] c = {"a", "ab", "abc"};
		
		sortByInnerLength(c);

		System.out.println(Arrays.toString(c));
		System.out.println("parola più lunga: "+c[0]);
		System.out.println("parola più breve: "+c[2]);
		
		/*
		 * fine s2
		 */

	}
	
	public static void sortByInnerLength (String[] c) {
		if (c[0].length() > c[1].length() && c[0].length() > c[2].length()) {
			if (c[1].length() > c[2].length()) {
				//do nothing
			} else if (c[1].length() < c[2].length()) {
				String s = c[1];
				String s2 = c[2];
				c[1] = s2;
				c[2] = s;
			}
		} else if (c[0].length() < c[1].length() && c[0].length() > c[2].length()) {
			String s = c[0];
			String s1 = c[1];
			c[0] = s1;
			c[1] = s;
		} else if (c[0].length() < c[1].length() && c[0].length() < c[2].length()) {

			if (c[1].length() > c[2].length()) {
				String s = c[0];
				String s1 = c[1];
				String s2 = c[2];
				c[0] = s1;
				c[1] = s2;
				c[2] = s;
			} else if (c[1].length() < c[2].length()) {
				String s = c[0];
				String s1 = c[2];
				c[0] = s1;
				c[2] = s;
			}

		}
	}

	public static void longer (String a, String b, String c) {
		if (a != null && b != null && c != null) {


			if (a.length() == b.length() && a.length() == c.length()) {
				System.out.println("tutte le stringhe hanno lunghezza identica");
			} else {
				if (a.length() > b.length() && a.length() > c.length()) {
					System.out.println("la stringa: "+a+" è la più lunga tra quelle in esame");
				} else if (b.length() > a.length() && b.length() > c.length()) {
					System.out.println("la stringa: "+b+" è la più lunga tra quelle in esame");
				} else if (c.length() > a.length() && c.length() > b.length()) {
					System.out.println("la stringa: "+c+" è la più lunga tra quelle in esame");
				} else if (a.length() == b.length() || a.length() == c.length()) {
					System.out.print("la stringa: "+a+" ha lunghezza uguale alla stringa: ");
					if (a.length() == b.length()) {
						System.out.println(b);
					} else if (a.length() == c.length()) {
						System.out.println(c);
					}
				} else if ( b.length() == c.length() || b.length() == a.length()) {
					System.out.print("la stringa: "+b+" ha lunghezza uguale alla stringa: ");
					if (b.length() == a.length()) {
						System.out.println(a);
					} else if (b.length() == c.length()) {
						System.out.println(c);
					}
				} else if (c.length() == a.length() || c.length() == b.length()) {
					System.out.print("la stringa: "+c+" ha lunghezza uguale alla stringa: ");
					if (c.length() == a.length()) {
						System.out.println(a);
					} else if (c.length() == b.length()) {
						System.out.println(b);
					}
				} else if (a.length() == b.length() && a.length() == c.length()) {

				}
			}
		}else {
			System.out.println("almeno una stringa = null");
		} 
	}

}
