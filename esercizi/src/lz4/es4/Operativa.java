package lz4.es4;

public interface Operativa {
	
	static int[] quadratoEcubo (int ingresso) {
		int[] rappresentazione = new int[2];
		rappresentazione[0] = (int) Math.pow(ingresso, 2);
		rappresentazione[1] = (int) Math.pow(ingresso, 3);
		
		return rappresentazione;
		
	}

}
