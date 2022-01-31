package com.iescomercio.prog.ud05.explicacion;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo(10, 10.0, "Audi", 10.0);
		v.mostrarInfo();
		
		System.out.println();
		
		Coche c = new Coche(10, 10.0, "Audi", 10.0);
		c.mostrarInfo();
		
		System.out.println();
		
		Bicicleta b = new Bicicleta(10, 10.0, "Audi", 10.0, "XXL");
		b.mostrarInfo();
	}

}
