package lz8.es4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Magazzino implements BraccioMeccanico {
	
	private LinkedList<Bottiglia> storage = new LinkedList<Bottiglia>();
	
	public Magazzino () {
	}

	public LinkedList<Bottiglia> getStorage() {
		return storage;
	}

	public void setStorage(LinkedList<Bottiglia> storage) {
		this.storage = storage;
	}
	
	public void ricevoBottiglie(int flag) {
		for (int i = 0; i < flag; i++) {
			storage.add(new Bottiglia(i));
		}
	}
	
	

}
