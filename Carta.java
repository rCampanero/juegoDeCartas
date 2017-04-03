package juegoDeCartas;

public class Carta {
	private Palos palo;
	private Figuras figura;
	
	Carta(Palos palo, Figuras figura){
		setPalo(palo);
		setFigura(figura);
	}

	/**
	 * @return the palo
	 */
	private Palos getPalo() {
		return palo;
	}

	/**
	 * @param palo the palo to set
	 */
	private void setPalo(Palos palo) {
		this.palo = palo;
	}

	/**
	 * @return the figura
	 */
	private Figuras getFigura() {
		return figura;
	}

	/**
	 * @param figura the figura to set
	 */
	private void setFigura(Figuras figura) {
		this.figura = figura;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carta: " + figura + " DE "+ palo ;
	}
}