package com.animal;

// este es una platilla general
public abstract class Animal {
	// todos los animales tienen estos estados
	private String picture;
	private String food;
	private String location;

	// todos los animales tienen las siguientes acciones
	// hacen ruido
	public abstract void makeNoise();

	// comen
	public abstract void eat();

	// duermen
	public abstract void sleep();

	// andan
	public abstract void roam();

	// getters y setters
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getName() + " [picture=");
		builder.append(picture + " ]");
//		builder.append(", food=");
//		builder.append(food);
//		builder.append(", location=");
//		builder.append(location);
//		builder.append("]");
		return builder.toString();
	}

}
