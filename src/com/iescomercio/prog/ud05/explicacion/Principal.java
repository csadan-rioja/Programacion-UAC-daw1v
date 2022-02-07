package com.iescomercio.prog.ud05.explicacion;

public class Principal {

	public static void main(String[] args) {
//		Vehiculo v = new Vehiculo(10, 10.0, "Audi", 10.0);
//		v.mostrarInfo();
//		
//		System.out.println();
//		
//		Coche c = new Coche(10, 10.0, "Audi", 10.0);
//		c.mostrarInfo();
//		
//		System.out.println();
//		
//		Bicicleta b = new Bicicleta(10, 10.0, "Audi", 10.0, "XXL");
//		b.mostrarInfo();
		
		
		Medico m = new Medico();
		m.operar();
		
		System.out.println("----");
		
		Cardiologo c = new Cardiologo();
		c.operar();
		
		System.out.println("----");

		Estomatologo e = new Estomatologo();
		e.operar();
		
		System.out.println(e);
		
	}

}
