package com.legos.v1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal0 {

	public static void main(String[] args) {
		// making an array of legos:
		Lego[] legos = { new Lego("Yamaha MT-10SP", "Vehicle (Moto)", 239.99f, 1478),
				new Lego("Imperial TIE Fighter", "Star Wars", 44.99f, 432),
				new Lego("Ducati Panigale V4 R", "Vehicle (Moto)", 69.99f, 646),
				new Lego("Liebherr lr 13000", "Vehicle (Machinery)", 699.99f, 2883),
				new Lego("Himeji Castle", "Architecture", 159.99f, 2125),
				new Lego("Bulldozer CAT D11", "Vehicle (Machinery)", 574.99f, 3854),
				new Lego("Venator-Class Republic Attack Cruiser", "Star Wars", 649.99f, 5374),
				new Lego("Great Pyramid of Giza", "Architecture", 129.99f, 1476),
				new Lego("AT-AT", "Star Wars", 849.99f, 6785), new Lego("Taj Mahal", "Architecture", 119.99f, 2022), };

		// passing them into a List
		List<Lego> listLegos = Arrays.asList(legos);

		// printing out different types:
		System.out.println("Lego Motos: ");
		// defining predicate to filter:
		printLegos(listLegos, lego -> lego.getType() == "Vehicle (Moto)");

		// Star Wars:
		System.out.println("Lego Star Wars: ");
		printLegos(listLegos, lego -> lego.getType() == "Star Wars");

		// Architecture:
		System.out.println("Lego Architecture: ");
		printLegos(listLegos, lego -> lego.getType() == "Architecture");

		System.out.println("Hard Level Legos (+2000 pieces): ");
		printLegos(listLegos, lego -> lego.getPieces() > 1999);

		System.out.println("Expensive Legos (+$150): ");
		printLegos(listLegos, lego -> lego.getPrice() > 149.99f);

	}

	private static void printLegos(List<Lego> listLegos, Predicate<Lego> funct) {
		boolean evaluation;
		for (Lego lego : listLegos) {
			// executing the lambda:
			evaluation = funct.test(lego);
			if (evaluation)
				System.out.println(lego);
		}
	}

}
