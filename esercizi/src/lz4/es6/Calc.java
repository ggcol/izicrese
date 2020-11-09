package lz4.es6;

public interface Calc {
	
	default int somma (Operazione o) {
		return o.getOperando1()+o.getOperando2();
	}
	
	default int sottrazione (Operazione o) {
		return o.getOperando1()-o.getOperando2();
	}
	
	default int moltiplicazione (Operazione o) {
		return o.getOperando1()*o.getOperando2();
	}
	
	default int divisione (Operazione o) {
		return o.getOperando1()/o.getOperando2();
	}

}
