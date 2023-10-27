package com.animal.felines;

import com.animal.Feline;

public class Tiger extends Feline {

	public Tiger(String name) {
		setName(name);
		setPicture("A big cat with reddish-orange coats with prominent black stripes");
		setFood("Large ungulates, monkeys, buffalo, sloth bears, leopard, crocodiles.");
		setLocation("Temperate, tropical or evergreen forests, mangrove swamps and grasslands");
	}

	@Override
	public void makeNoise() {
		System.out.println("grr, grr, grrrrr....");
	}

	@Override
	public void eat() {
		System.out.println("I'm carnivore, I like big preys");
	}

	@Override
	public void sleep() {
		System.out.println("I sleep in temperate habitats");
	}

}
