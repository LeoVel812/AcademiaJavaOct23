package com.legos.v1;

public class Lego {
	// class for modeling legos:
	private String name;
	private String type;
	private float price;
	private int pieces;

	public Lego(String name, String type, float price, int pieces) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.pieces = pieces;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

	public int getPieces() {
		return pieces;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lego [name= ");
		builder.append(name);
		builder.append(", price= ");
		builder.append(price);
		builder.append(", type= ");
		builder.append(type);
		builder.append(", pieces= ");
		builder.append(pieces);
		builder.append("]");
		return builder.toString();
	}

}
