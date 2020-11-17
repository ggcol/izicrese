package lz7.es1;

public class Calcolatrice {

	private double op1;
	private double op2;

	public Calcolatrice (int op1, int op2) {
		setOp1(op1);
		setOp2(op2);
	}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	public double operazione (int scelta) {
		double risultato;
		switch (scelta) {
		case 0:
			System.out.println("La somma di: "+op1+" e "+op2+" è:");
			return risultato = op1+op2;
		case 1: 
			System.out.println("La differenza tra: "+op1+" e "+op2+" è:");
			return risultato = op1-op2;
		case 2:
			System.out.println("Il prodotto di: "+op1+" e "+op2+" è:");
			return risultato = op1*op2;
		case 3: 
			System.out.println("Il quoto/quoziente di: "+op1+" e "+op2+" è:");
			try {
				return risultato = op1/op2;
				//l'eccezione si solleverebbe se fossero interi!
			} catch (ArithmeticException e) {
				System.out.println("ehhhh non si può dividere per 0!");
			}
		case 4:
			System.out.println("Il resto della divisione di: "+op1+" e "+op2+" è:");
			return risultato = op1%op2;
		case 5: 
			System.out.println("Il risultato dell'elevazione di: "+op1+" alla potenza "+op2+" è:");
			return risultato = Math.pow(op1, op2);
		case 6:
			System.out.println("- In questo caso posso usare solo il primo numero -");
			System.out.println("La radice quadrata di: "+op1+" è:");
			return risultato = Math.sqrt(op1);
		default: 
			System.out.println("nessuna operazione, ritorno uno 0");
			return 0.0;

		}
	}


}
