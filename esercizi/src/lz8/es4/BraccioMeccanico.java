package lz8.es4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public interface BraccioMeccanico {

	default void riempiBottiglia(LinkedList<Bottiglia> list, int i, int bevanda) {
		if (bevanda == 0) {
			list.get(i).setContenuto(new Alcolico());
		} else if (bevanda == 1) {
			list.get(i).setContenuto(new Analcolico());
		} else {
			list.get(i).setContenuto(new Veleno());
		}
	}

	default void svuotaBottiglia(LinkedList<Bottiglia> list, int id) {
		list.get(id).setContenuto(null);
	}

	default void riempiMultiple(Magazzino m1) {
		LinkedList<Integer> containerId = new LinkedList<Integer>(); 
		LinkedList<Integer> containerCont = new LinkedList<Integer>();

		Scanner s = new Scanner(System.in);
		System.out.println("quante bott vuoi riempire o modificare?");
		int quante = s.nextInt();
		String safe = s.nextLine();

		for (int i = 0; i < quante; i++) {
			System.out.println("inserisci id bottiglia:");
			int modID = s.nextInt();
			safe = s.nextLine();
			System.out.println("inserisci nuovo contenuto:");
			int modCont = s.nextInt();
			safe = s.nextLine();
			containerId.add(i, modID);
			containerCont.add(i, modCont);
		}

		for (int i = 0; i < quante; i++) {
			switch (containerCont.get(i)) {
			case 0: 
				m1.getStorage().get(containerId.get(i)).setContenuto(new Alcolico());
				break;
			case 1:
				m1.getStorage().get(containerId.get(i)).setContenuto(new Analcolico());
				break;
			default: 
				m1.getStorage().get(containerId.get(i)).setContenuto(new Veleno());
				break;
			}


		}
		s.close();
	}


}
