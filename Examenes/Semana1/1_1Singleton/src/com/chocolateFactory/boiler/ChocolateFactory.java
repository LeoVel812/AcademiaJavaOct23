package com.chocolateFactory.boiler;

public class ChocolateFactory {

	public static void main(String[] args) {
		// crear instancia para hacer procesos del boiler
		ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
		// haciendo los procesos
		System.out.println("Before filling: empty: " + boiler1.isEmpty() + " boiled: " + boiler1.isBoiled());
		boiler1.fill(); // llenado
		System.out.println(
				"After filling/Before boiling: empty: " + boiler1.isEmpty() + " boiled: " + boiler1.isBoiled());
		boiler1.boil(); // hervido
		System.out.println(
				"After boiling/Before draining: empty: " + boiler1.isEmpty() + " boiled: " + boiler1.isBoiled());
		boiler1.drain();// drenado
		System.out.println("Process finished: empty: " + boiler1.isEmpty() + " boiled: " + boiler1.isBoiled());

		// haciendo referencia a otro boiler:
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler2.fill(); // llenado
		boiler2.boil(); // hervido
		boiler2.drain();// drenado

		// haciendo referencia a otro boiler:
		ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
		boiler3.fill(); // llenado
		boiler3.boil(); // hervido
		boiler3.drain();// drenado

		System.out.println("Instances created: " + ChocolateBoiler.getCounter());
	}

}
