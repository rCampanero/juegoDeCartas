package juegoDeCartas;

import java.util.ArrayList;

public class Jugadores {
	
	ArrayList<Jugador> jugadores;
	
	/**
	 * Constructor del ArrayList de jugadores
	 */
	Jugadores(){
		jugadores = new ArrayList<Jugador>();
	}
	
	/**
	 * Añade un jugador al array list de jugadores
	 * @param j
	 * @throws JugadorExisteException
	 */
	void addJugador(Jugador j){
			jugadores.add(j);
	}
	
	
	/**
	 * Devuelve la longitud del ArrayList Jugadores
	 * @return
	 */
	int size(){
		return jugadores.size();
	}
	
	/**
	 * Devuelve el jugador que se encuentra en el indice i
	 * @param i
	 * @return
	 */
	Jugador getJugador(int i){
		return jugadores.get(i);
	}
		
	@Override
	public String toString() {
		return "Los jugadores de esta partida son:" + jugadores + ".";
	}

	public void remove(int i) {
		jugadores.remove(i);
		
	}
	
	
	
}
