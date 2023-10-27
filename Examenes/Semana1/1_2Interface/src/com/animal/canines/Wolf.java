package com.animal.canines;

import com.animal.Canine;

public class Wolf extends Canine {

	public Wolf(String name) {
		setName(name);
		setPicture("Above of 1 meter of height on four legs");
		setFood("I'm carnivore, I like arge hoofed mammals such as deer, elk, bison, and moose.");
		setLocation("I livein nature, in forests or cold habitats.");
	}

	@Override
	public void makeNoise() {
		System.out.println("grrr, grrr, grrr...");
	}

	@Override
	public void eat() {
		System.out.println("I'm eating DogFood");
	}

	@Override
	public void sleep() {
		System.out.println("I sleep with my owners, comfortably");
	}

}
