package lz3.es3;

public class BigliettoFactory {

	public BigliettoFactory() {}

	public Biglietto getATicket (String ref) throws NullPointerException {
		Biglietto b = null;

		switch (ref) {
		case "giornaliero":
			b = new Giornaliero();
			break;
		case "settimanale":
			b = new Settimanale();
			break;
		case "mensile":
			b = new Mensile();
			break;
		default:
			break;
		}
		return b;
	}


}
