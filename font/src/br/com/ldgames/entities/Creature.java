package br.com.ldgames.entities;

public class Creature extends Card {

	public Creature(String name, String description, int attack, int defense) {

		this.setType(CardType.Creature);
		this.setName(name);
		this.setDescription(description);
		this.setAttack(attack);
		this.setDefense(defense);
	}

}
