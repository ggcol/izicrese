package lz4.es3;

public class Moneta extends Lanciabile {

	final int faccia = 2;

	@Override 
	public int lancio() {
		int headOrTail = randomico(faccia-1, faccia);
		switch (headOrTail) {
		case 1:
			System.out.println("TESTA!");
			return headOrTail = 1;
		case 2:
			System.out.println("CROCE!");
			return headOrTail = 2;
		default: 
			System.out.println("la moneta si è fermata senza cadere");
			return headOrTail = 0;
		}
	}
	


}
