package lz4.es3;

public class Dado extends Lanciabile {

	private int faccia; 

	public Dado () {
	}

	public int getFaccia() {
		return faccia;
	}

	public void setFaccia(int faccia, boolean e) {
		if (e==true) {
		this.faccia = faccia;
		} else {
			//do nothing
		}
	}

	@Override
	int lancio() {
		int result = randomico(1, faccia);
		return result;
	}

	public boolean dadoExist (int facce) {
		@SuppressWarnings("unused")
		boolean dice;
		switch (facce) {
		case 4: 
			System.out.println("Il dado esiste, è un d4");
			return dice = true;
		case 6:
			System.out.println("Il dado esiste, è un d6");
			return dice = true;
		case 8: 
			System.out.println("Il dado esiste, è un d8");
			return dice = true;
		case 10:
			System.out.println("Il dado esiste, è un d10");
			return dice = true;
		case 12: 
			System.out.println("Il dado esiste, è un d12");
			return dice = true;
		case 20:
			System.out.println("Il dado esiste, è un d20");
			return dice = true;
		case 100:
			System.out.println("Il dado esiste è un d100");
			return dice = true;
		default:
			System.out.println("Non abbiamo quel dado, mi spiace");
			return dice = false;

		}
	}
}
