package br.com.ldgames.entities;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cartas;

	public Deck() {
		cartas = new ArrayList<Card>();

		Land l = new Land("Forest", "Forest");
		for (int i = 0; i < 20; i++) {
			cartas.add(l);
		}

		for (int i = 0; i < 10; i++) {
			Creature c = new Creature("Soldier" + i, "Soldier" + i, 2, 2);
			for (int j = 0; j < 4; j++) {
				cartas.add(c);
			}
		}

	}

}
