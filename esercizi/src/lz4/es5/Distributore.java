package lz4.es5;

public class Distributore {
	
	private int id;
	private String citt�;
	private int capacit�;
	private int attuale;
	private double costoCarb;
	private double cassa;
	
	public Distributore (int id, String citt�, int capacit�, int attuale, double costoCarb) {
		setId(id);
		setCitt�(citt�);
		setCapacit�(capacit�);
		setAttuale(attuale);
		setCostoCarb(costoCarb);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCitt�() {
		return citt�;
	}

	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public void setCapacit�(int capacit�) {
		this.capacit� = capacit�;
	}

	public int getAttuale() {
		return attuale;
	}

	public void setAttuale(int attuale) {
		if (attuale <= this.capacit�) {
		this.attuale = attuale;
		} else {
			System.out.println("tutta sta benzina non ci sta nella cisterna capo!");
		}
	}

	public double getCostoCarb() {
		return costoCarb;
	}

	public void setCostoCarb(double costoCarb) {
		this.costoCarb = costoCarb;
	}
	
	
	public double getCassa() {
		return cassa;
	}

	public void setCassa(double cassa) {
		this.cassa = cassa;
	}

	public void rifornimentoSettimanale(int rif) {
		setAttuale(this.attuale+rif);
	}
	
	public void erogazione (int rif) {
		if (rif > this.attuale && rif < this.capacit�) {
			System.out.println("non ho tutta quella benza capo");
		} else if (rif < 1) {
			System.out.println("minimo un litro frate");
		} else if (rif > this.capacit�) {
			System.out.println("nemmeno il culo di tua madre tiene tanti litri");
			schizoFrenicoReagisce();
		} else {
			System.out.println("ok, capo, arriva subito");
			setAttuale(attuale-rif);
			setCassa(this.cassa+(rif*this.costoCarb));
			System.out.println("fatto");
			System.out.println("buon viaggio capo!");
		}
	}
	
	public void schizoFrenicoReagisce () {
		System.out.println("*schiuma bianco dalla bocca");
		System.out.println("*smascella evidentemente");
		setCassa(0);
		System.out.println("sto scemo si � fottuto l'incasso, ha la mamma puttana");
	}

}
