package lz4.es7;

public class Aeromobile implements Comparazione {

	private String sigla;
	private double potenza; //Aerei
	private int efficenza; //Alianti

	public Aeromobile () {}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public double getPotenza() {
		return potenza;
	}

	public void setPotenza(double potenza) {
		this.potenza = potenza;
	}

	public int getEfficenza() {
		return efficenza;
	}

	public void setEfficenza(int efficenza) {
		this.efficenza = efficenza;
	}

	public boolean superiore (Aeromobile a1, Aeromobile a2)  {
		boolean superiore = false;
		
		if (a1 != null && a2 != null) {
			
			if (a1.getClass().equals(a2.getClass())) {
				
				if (a1.getClass().toString().equals("class lz4.es7.Aliante")) {
					
					if (a1.getEfficenza() > a2.getEfficenza()) {
						System.out.println("il primo aliante è più performante del primo");
						superiore = true;
						return superiore;
					} else if (a1.getEfficenza() == a2.getEfficenza()) {
						System.out.println("gli alianti sono ugualmente performanti");
						return superiore;
					} else {
						System.out.println("il secondo aliante è più performante del primo");
						return superiore;
					}
				} else if  (a1.getClass().toString().equals("class lz4.es7.Aereo")) {
					if (a1.getPotenza() > a2.getPotenza()) {
						System.out.println("il primo aereo è più performante del secondo");
						superiore = true;
						return superiore;
					} else if (a1.getPotenza() == a1.getPotenza()) {
						System.out.println("gli aerei sono ugualmente performanti");
						return superiore;
					} else {
						System.out.println("il secondo aereo è più performante del primo");
						return superiore;
					}
				} else {
					return superiore;
				}
			} else { // what if != classes
				System.out.println("non comparabili");
				return superiore;
			}
		} else { // what if == null
			System.out.println("uno dei velivoli è null");
			return superiore;
		}
	}
}
