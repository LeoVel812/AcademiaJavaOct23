package com.animal.canines;

import com.animal.Canine;

public class Dog extends Canine {

	public Dog(String name) {
		setName(name);
		setPicture("From 30 cm to 1 meter of height on four legs");
		setFood("I'm mostly carnivore, but I can be omnivore evenly.");
		setLocation("Often in homes or cities, rarely in nature.");
	}

	@Override
	public void makeNoise() {
		System.out.println("guau, guau, guau...");
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
