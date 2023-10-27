package com.animal.felines;

import com.animal.Feline;

public class Lion extends Feline {

	public Lion(String name) {
		setName(name);
		setPicture("A big yellow cat with mane");
		setFood("Antelopes,Buffaloes, Zebras,Young Elephants,Rhinos.");
		setLocation("I live in Savannahs");
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
		System.out.println("I sleep in savannahs");
	}

}
