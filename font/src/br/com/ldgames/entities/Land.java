package br.com.ldgames.entities;

public class Land extends Card {

	public Land(String name, String description){
		
		this.setType(CardType.Land);
		this.setName(name);
		this.setDescription(description);
		
	}
	
}
