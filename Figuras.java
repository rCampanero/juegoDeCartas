package juegoDeCartas;

enum Figuras {
	UNO(1), 
	DOS(2), 
	TRES(3), 
	CUATRO(4), 
	CINCO(5), 
	SEIS(6), 
	SIETE(7), 
	SOTA(0.5), 
	CABALLO(0.5), 
	REY(0.5);

	private final double valor;
	
	Figuras (double valor){
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	private double getValor() {
		return valor;
	}
	
	
}