package lz5.es3;

public class WrongEmailException extends Exception {

	public void printStackTrace () {

		System.out.println("non hai inserito un indirizzo e-mail valido!");
	}

}
