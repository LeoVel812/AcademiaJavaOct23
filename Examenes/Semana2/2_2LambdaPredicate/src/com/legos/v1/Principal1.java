package com.legos.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal1 {

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
//		List<Lego> listLegos = Arrays.asList(legos);
		List<Lego> listLegos = addLegoToList(legos);

		// remove all elements that are hard and expensive:
		System.out.println("Easy (<1500 pieces) or comfortable (<$150) legos:");
		listLegos.removeIf(lego -> lego.getPieces() > 1500 && lego.getPrice() > 150.0f);
		listLegos.forEach(System.out::println);
	}

	private static List<Lego> addLegoToList(Lego[] legos) {
		List<Lego> listLegos = new ArrayList<>();
		for (Lego lego : legos) {
			listLegos.add(lego);
		}
		return listLegos;
	}

}
