/*
 * ESERCIZIO 2 - Scrivere un programma che stampi a console Eclipse e su un file di testo 
 * la lista di file di una directory del vostro hard disk. La directory viene 
 * fornita in input dall'utente.
 */

package lz7.es2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main_lz7e2 {

	public static void main (String[] args) {

				Scanner s = new Scanner(System.in);
				System.out.println("inserire percorso cartella da leggere");
				String pathRead = s.nextLine();
				System.out.println("inserire percorso cartella in cui scrivere");
				String pathWrite = s.nextLine();
				s.close();
		
				File dirToRead = new File(pathRead);
				listFilesInDir(dirToRead, pathWrite);

	} 

	public static void listFilesInDir (final File dir, String pathWrite) {
		File check = new File(pathWrite);
		if (check.exists() == true) {

			try {
				FileWriter writer = new FileWriter(pathWrite+"\\lista.txt"); //dev'essere una directory esistente
				for (final File fileEntry: dir.listFiles()) {
					/* non lo rendo ricorsivo, quindi non entra in eventuali dir */
					//				if (fileEntry.isDirectory()) {
					//					listFilesInDir(fileEntry, pathWrite);
					//				} else {
					System.out.println(fileEntry.getName()); //stampa a console
					writer.write(fileEntry.getName()+"\n"); //scrive in file
				} 
				writer.close();

			}catch (Exception e) {
				System.out.println("something goes wrong!");
			}
		} else {
			System.out.println("can't do nothing"); //not true but gets more work!
		}
	}


}
