package com.chocolateFactory.boiler;

public class ChocolateBoiler {
	// variables de referencia de instancia
	// para ver estados de la maquina
	private boolean empty;
	private boolean boiled;

	// referencia de clase del mismo tipo de la clase y estatica,
	// solo se puede crear una
	private static ChocolateBoiler uniqueChocolateBoiler;

	// referencia estatica para ver el numero de instancias creadas:
	private static int counter;

	// constructor privado, solo puede ser llamado desde esta clase
	// cuando se instancia el objeto siempre inicia con estos valores
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
		counter++;
	}

	// getters para ver estados de la instancia
	public boolean isEmpty() {
		return this.empty;
	}

	public boolean isBoiled() {
		return this.boiled;
	}

	// getter para ver numero de instancias creadas
	public static int getCounter() {
		return counter;
	}

	// metodo para llenar la maquina
	public void fill() {
		if (isEmpty()) {
			// se cambian los estados de la maquina
			// al comienzo del proceso
			this.empty = false;
			this.boiled = false;
			// ...se coloca todo el proceso de llenado
			System.out.println("Starting filling the boiler");
		}
	}

	// metodo para drenar la maquina
	public void drain() {
		// solo si: no esta vacio y ya termino el proceso de hervido
		if (!isEmpty() && isBoiled()) {
			// ...procesos para drenar el contenido de la maquina
			System.out.println("Draining Chocolate Boiler...");
			this.empty = true; // se actualiza estado de la instancia
		}
	}

	// metodo para hervir
	public void boil() {
		// solo si los estados: no esta vacio y no ha hervido
		if (!isEmpty() && !isBoiled()) {
			// ... proceso de hervido
			System.out.println("Boiling process...");
			this.boiled = true;// se actualiza estado de la instancia
		}
	}

	// metodo estatico o de clase, para crear solo una instancia en la ejecucion del
	// programa
	public static ChocolateBoiler getInstance() {
		// si la referencia estatica no tiene variable de referencia:
		if (uniqueChocolateBoiler == null) {
			// creale una nueva referencia:
			uniqueChocolateBoiler = new ChocolateBoiler();
			System.out.println("Instantiating a new ChocolateBoiler");
		}
		// de otro modo, regresa la referencia que exista
		return uniqueChocolateBoiler;
	}
}
