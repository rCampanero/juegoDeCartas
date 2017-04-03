package juegoDeCartas;

import java.util.Iterator;

import javax.management.remote.rmi.RMIJRMPServerImpl;

import utiles.*;

/**
 * Dise�a e implementa un juego de cartas. Para ello, comienza implementando el
 * juego de las siete y media. Es opcional implementar otro juego. Recuerda que:
 * <ul>
 * <li>A las siete y media se juega con una baraja espa�ola</li>
 * <li>Pueden jugar tantos jugadores como se quiera.</li>
 * <li>Al principio del juego se indicar� el alias de los jugadores implicados.
 * </li>
 * <li>Se podr� averiguar el n�mero de partidas ganadas y perdidas por cada
 * jugador.</li>
 * <li>Se podr� mostrar el ranking de las partidas jugadas</li>
 * <li>Al iniciar cada partida se preguntar� qu� jugador juega y cu�l no.</li>
 * <li>Utiliza el m�todo shuffle para barajar las cartas</li>
 * </ul>
 * Para que te plantees el dise�o te dejo estas preguntas:
 * <ul>
 * <li>El hecho de pedir una carta, �a qu� m�todo se refiere? �De qu�
 * objeto/clase?</li>
 * <li>El hecho de plantarse un jugador, �a qu� m�todo se refiere? �De qu�
 * objeto/clase?</li>
 * <li>El hecho de plantarse, �a qu� m�todo se refiere? �De qu�
 * objeto/clase?</li>
 * <li>El hecho de preguntar el nombre al jugador, �a qu� m�todo se refiere? �De
 * qu� objeto/clase?</li>
 * <li>El hecho de preguntarle a un usuario si va a jugar o no, �a qu� m�todo se
 * refiere? �De qu� objeto/clase?</li>
 * <li>�En qu� se diferencia una partida de otra? �Coincide la baraja?</li>
 * <li>�Qu� tienen en com�n todas las partidas de siete y media?</li>
 * <li>�Utilizas alg�n valor constante?�Utilizas enumeraciones?</li>
 * </ul>
 * 
 * @author iatsko
 *
 */

public class TestJuegoDeCartas {

	static Jugadores jugadores = new Jugadores();
	static Jugadores participantes = new Jugadores();

	public static void main(String[] args) throws JugadorExisteException {
		Menu menu = new Menu("Bienvenido a las Siete y Media",
				new String[] { "Iniciar partida", "Gestionar jugadores" });

		do {
			switch (menu.gestionar()) {
			case 1:
				iniciarPartida();
				break;
			case 2:
				gestionarJugadores();
				break;
			case 3:
				System.exit(0);
			}
		} while (true);
	}

	private static void gestionarJugadores() throws JugadorExisteException {
		Menu menu = new Menu("�Qu� quieres hacer con los jugadores?",
				new String[] { "A�adir un jugador", "Eliminar un jugador", "Mostrar todos los jugadores" });
		boolean salir = true;
		do {
			switch (menu.gestionar()) {
			case 1:
				Jugador nuevo;
				nuevo = new Jugador(Teclado.leerCadena("Introduce el alias del nuevo jugador: "));
				try {
					comparaAlias(nuevo, jugadores);
					jugadores.addJugador(nuevo);
				} catch (JugadorExisteException e) {
					System.err.println("No puedes a�adir un jugador que ya existe.");
				}
				break;
			case 2:
				Jugador nuevo1;
				nuevo1 = new Jugador(Teclado.leerCadena("Introduce el alias del jugador que quieres eliminar: "));
				try {
					if (rmJugador(nuevo1))
						System.out.println("El jugador se ha eliminado correctamente.");
				} catch (JugadorNoExisteException e) {
					System.err.println("No puedes eliminar un jugador que no existe.");
				}

				break;
			case 3:
				System.out.println(jugadores.toString());
				break;
			case 4:
				salir = false;
				break;
			}
		} while (salir);
	}

	/**
	 * Compara el alias del nuevo jugador con el resto
	 * 
	 * @param nuevo
	 * @return existe
	 */
	private static boolean comparaAlias(Jugador nuevo, Jugadores jugadores) throws JugadorExisteException {

		boolean existe = false;

		for (int i = 0; i < jugadores.size(); i++) {
			if ((jugadores.getJugador(i).alias).equals(nuevo.alias)) {
				existe = true;
				throw new JugadorExisteException();
			}
		}
		return existe;

	}

	/**
	 * Quita un jugador del array list de jugadores
	 * 
	 * @param j
	 * @throws JugadorNoExisteException
	 */
	static boolean rmJugador(Jugador nuevo) throws JugadorNoExisteException {
		for (int i = 0; i < jugadores.size(); i++) {
			if ((jugadores.getJugador(i).alias).equals(nuevo.alias)) {
				jugadores.remove(i);
				return true;
			} else if (!(jugadores.getJugador(i).alias).equals(nuevo.alias)) {
				throw new JugadorNoExisteException();
			}
		}
		return false;

	}

	private static void iniciarPartida() {
		do {
			try {
				addParticipantes(jugadores);
			} catch (JugadorExisteException e) {
				System.err.println("No puedes a�adir dos veces el mismo participante.");
			}
		} while (participantes.size() >= 2);
		
		Partida partida = new Partida(participantes);
	}


	private static Jugadores addParticipantes(Jugadores jugadores) throws JugadorExisteException {
		Jugadores participantes1 = new Jugadores();
		Jugador nuevo2;
		nuevo2 = new Jugador(Teclado.leerCadena("Introduce el alias del jugador que quieres a�adir a la partida: "));
		for (int i = 0; i < jugadores.size(); i++) {
			if (comparaAlias(nuevo2, participantes)) {
				throw new JugadorExisteException();
			} else if (!comparaAlias(nuevo2, participantes)) {
				participantes1.addJugador(nuevo2);
			}
		}
		return participantes1;

	}
}