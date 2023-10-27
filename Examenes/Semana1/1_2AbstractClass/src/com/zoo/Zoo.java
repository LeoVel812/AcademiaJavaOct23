package com.zoo;

import com.animal.Animal;
import com.animal.canines.*;
import com.animal.felines.*;

public class Zoo {

	public static void main(String[] args) {
		// creando arreglo de animales(clase abstracta)
		Animal[] zoo = { new Cat("Michi"), new Dog("Max"), new Wolf("Ralph"), new Lion("King Lion"),
				new Tiger("Vitaly") };
		// metodo que recorre el array y ejecuta su andar (roam)
		// dependiendo de objeto es:overriding
		animalDo(zoo);
	}

	private static void animalDo(Animal[] animalsZoo) {
		for (Animal animal : animalsZoo) {
			System.out.println(animal);
			// polimorfismo:
			animal.eat();
			animal.sleep();
			animal.roam();
		}
	}
}
