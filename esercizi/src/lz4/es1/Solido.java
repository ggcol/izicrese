package lz4.es1;

abstract class Solido {
	
	protected double areaBase;
	protected double altezza;
	protected double volume;
	
	public double calcoloVolume () {
		this.volume = areaBase*altezza;
		return volume;
	}

	public String toString() {
		return "il volume di questo solido è: "+volume;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
}
