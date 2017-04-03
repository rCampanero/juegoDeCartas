package juegoDeCartas;

public class Partida {
	
	private static final double PUNTUACION_MAXIMA = 7.5;
	Jugadores jugadores = new Jugadores();
	Baraja baraja = new Baraja();
	Carta carta;
	
		Partida(Jugadores jugadores){
			setJugadores(jugadores);
		}
		
		/**
		 * Devuelve el ArrayList de los jugadores
		 * @return
		 */
		public Jugadores getJugadores() {
			return jugadores;
		}

		/**
		 * 
		 * @param jugadores
		 */
		public void setJugadores(Jugadores jugadores) {
			this.jugadores = jugadores;
		}

		/**
		 * Devuelve la baraja
		 * @return
		 */
		public Baraja getBaraja() {
			return baraja;
		}

		/**
		 * 
		 * @param baraja
		 */
		public void setBaraja(Baraja baraja) {
			this.baraja = baraja;
		}

		/**
		 * Devuelve la carta
		 * @return
		 */
		public Carta getCarta() {
			return carta;
		}

		/**
		 * 
		 * @param carta
		 */
		public void setCarta(Carta carta) {
			this.carta = carta;
		}
		
		
}
