package lz4.es2;

public interface CriticoMagaziniere {
	
	default int calcVolume (OperaArte opera) {
		int volume = 0;
		if (opera.getTipo().equals("statua")) {
			return volume = opera.getProfondità()*opera.getAltezza()*opera.getLunghezza();
		} else if (opera.getTipo().equals("quadro")) {
			return volume = opera.getAltezza()*opera.getLunghezza();
		}
		return volume;
	}
		
	default int totVolume (OperaArte[] esposizione) {
		int volumi = 0;
		for (int i = 0; i < esposizione.length; i++) {
			volumi = volumi+esposizione[i].getVolume();
		}
		return volumi;
		
	}

	default boolean uguale (OperaArte a, OperaArte b) {
		boolean uguale = false;
		if (a.getTitolo().equals(b.getTitolo())) uguale = true;
		return uguale;
	}
}
