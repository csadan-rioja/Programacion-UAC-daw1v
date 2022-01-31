package com.iescomercio.prog.ud05.explicacion;

public class Bicicleta extends Vehiculo {
	
	private String talla;

	public Bicicleta(Integer velocidadMaxima, Double kgPeso, String marca, Double precio, String talla) {
		super(velocidadMaxima, kgPeso, marca, precio);
		this.talla = talla;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Bicicleta comportamiento");
	}

}
