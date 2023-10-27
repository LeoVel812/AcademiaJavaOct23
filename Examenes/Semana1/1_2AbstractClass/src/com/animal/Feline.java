package com.animal;

// una clase mas especifica, pero plantilla de felinos
public abstract class Feline extends Animal {
	// cada felino tiene nombre
	private String name;

	// su andar es diferente, pueden escalar arboles paredes
	public void roam() {
		System.out.println("As a Feline, I can climb");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
