package br.com.ldgames.entities;

public class Card {

	private String name;
	private CardType type;
	private String image;
	private String description;
	private int attack;
	private int defense;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAttack() {
		return attack;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getDefense() {
		return defense;
	}

}
