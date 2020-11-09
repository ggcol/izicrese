package lz3.es2;

import java.util.Random;

public class Eroe {

	protected int saggezza;
	protected int forza;
	protected int destrezza;
	protected int generate;

	public Eroe() {}

	public int getSaggezza() {
		return saggezza;
	}

	public void setSaggezza(int saggezza) {
		this.saggezza = saggezza;
	}

	public int getForza() {
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	public int getDestrezza() {
		return destrezza;
	}

	public void setDestrezza(int destrezza) {
		this.destrezza = destrezza;
	}


	public int getGenerate() {
		return generate;
	}

	public void setGenerate(int generate) {
		this.generate = generate;
	}

	protected String competenza() {
		return "competenza";
	}

}
