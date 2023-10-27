package com.animal.felines;

import com.animal.Feline;
import com.animal.pet.Pet;

public class Cat extends Feline implements Pet {

	public Cat(String name) {
		setName(name);
		setPicture("A small cat, I can be of many colors as my eyes");
		setFood("mice, small lizards, small birds, but I prefer catfood .");
		setLocation("Often in homes or cities, rarely in nature.");
	}

	@Override
	public void makeNoise() {
		System.out.println("prr, prr, prrrrr....");
	}

	@Override
	public void eat() {
		System.out.println("I'm carnivore, but of small preys");
	}

	@Override
	public void sleep() {
		System.out.println("I sleep with my owners, comfortably");
	}

	@Override
	public void beFriendly() {
		System.out.println("I'm " + super.getName() + " and sometimes I'm friendly...");
	}

	@Override
	public void play() {
		System.out.println("I'm " + super.getName() + " and you must throw that hairy ball!!!.");
	}
}
