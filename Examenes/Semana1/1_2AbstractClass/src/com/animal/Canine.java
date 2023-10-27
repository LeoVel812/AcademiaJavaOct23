package com.animal;

// una clase mas especifica, pero plantilla de felinos
public abstract class Canine extends Animal {
	// cada felino tiene nombre
	private String name;

	// su andar es diferente, solo pueden caminar o correr
	public void roam() {
		System.out.println("As a Canine, I can only walk or run");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
