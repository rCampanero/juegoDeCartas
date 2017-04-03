package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	private static final int N_PALOS = 4;
	private static final int N_FIGURAS = 10;
	
	private ArrayList<Carta> baraja = new ArrayList<Carta>();
	
	public Baraja(){
		for (int i = 0; i < N_PALOS; i++) {
			for (int j = 0; j < N_FIGURAS; j++) {
				baraja.add(new Carta(Palos.values()[i], Figuras.values()[j]));
			}
			Collections.shuffle(baraja);
		}
	}
	
	
	/**
	 * Saca una carta de la baraja
	 * @return Carta
	 */
	Carta sacarCarta(){
		Carta carta = baraja.get(0);
		baraja.remove(0);
		return carta;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Baraja: \n" + baraja;
	}
	
	
}

