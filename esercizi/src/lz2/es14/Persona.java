package lz2.es14;

public class Persona {

	private String orAliment;

	public Persona (String orAliment) {
		setOrAliment(orAliment);
	}

	public String getOrAliment() {
		return orAliment;
	}

	public void setOrAliment(String orAliment) {
		this.orAliment = orAliment;
	}

	public boolean loMangia (Persona p, String indicazionePiatto) {
		System.out.print("questa persona mangia questo piatto? ");
		switch (p.getOrAliment()) {
		case "vegetariano":
			boolean ref = (p.getOrAliment().equals(indicazionePiatto)) ? true : false;
			return ref;
		case "onnivoro":
			return ref = true;
		default: 
			return ref = false;
		}
	}
}
