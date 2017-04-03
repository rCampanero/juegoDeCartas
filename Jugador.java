package juegoDeCartas;

public class Jugador {
	
	String alias;
	private int partidasGanadas;
	private int partidasJugadas;
	private int partidasEmpatadas;
	double puntuacion;
	
	public Jugador(String alias){
		setAlias(alias);
		setPuntuacion(0);
		setPartidasGanadas(0);
		setPartidasJugadas(0);
	}
	
	
	/**
	 * 
	 * Aumenta en uno el numero de partidas ganadas
	 *
	 */
	public void incGanadas(){
		setPartidasGanadas(partidasGanadas + 1);
	}
	
	/**
	 * 
	 * Aumenta en uno el numero de partidas jugadas
	 *
	 */
	public void incJugadas(){
		setPartidasJugadas(partidasJugadas + 1);
	}
	
	/**
	 * 
	 * Aumenta en uno el numero de partidas empatadas
	 *
	 */
	public void incEmpatadas(){
		setPartidasEmpatadas(partidasEmpatadas + 1);
	}
	
	/**
	 * @return the alias
	 */
	private String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	private void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the partidasGanadas
	 */
	private int getPartidasGanadas() {
		return partidasGanadas;
	}

	/**
	 * @param partidasGanadas the partidasGanadas to set
	 */
	private void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	/**
	 * @return the partidasJugadas
	 */
	private int getPartidasJugadas() {
		return partidasJugadas;
	}

	/**
	 * @param partidasJugadas the partidasJugadas to set
	 */
	private void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	/**
	 * @return the puntuacion
	 */
	private double getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	private void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	/**
	 * @return the partidasEmpatadas
	 */
	private int getPartidasEmpatadas() {
		return partidasEmpatadas;
	}

	/**
	 * @param partidasEmpatadas the partidasEmpatadas to set
	 */
	private void setPartidasEmpatadas(int partidasEmpatadas) {
		this.partidasEmpatadas = partidasEmpatadas;
	}

	@Override
	public String toString() {
		return alias;
	}
	
	
	
	
}