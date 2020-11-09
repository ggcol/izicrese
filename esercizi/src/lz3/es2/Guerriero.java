package lz3.es2;

public class Guerriero extends Eroe {

	public Guerriero(int forza, int destrezza, int saggezza, int generate) {
		super.forza = forza;
		super.destrezza = destrezza;
		super.saggezza = saggezza;
		super.generate = generate;
	}

	@Override
	public String competenza() {
		return "Caratteristiche dell'Eroe: \nFor: "+this.getForza()+" Des: "+this.getDestrezza()+" Sag: "+this.getSaggezza()
		+"\nLa competenza di un Guerriero è il combattimento in mischia";
	}	

}
