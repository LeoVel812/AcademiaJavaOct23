package com.animal.canines;

import com.animal.Canine;
import com.animal.pet.Pet;

//se implementa una interfaz Pet, con la que le da capacidad de ser amigable y jugar
public class Dog extends Canine implements Pet {

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

	@Override
	public void beFriendly() {
		System.out.println("I'm " + super.getName() + " and I'm friendly...");
	}

	@Override
	public void play() {
		System.out.println("I'm " + super.getName() + " and you throw the ball!!!.");
	}

}
