package com.iescomercio.prog.ud05.explicacion;

public class Coche extends Vehiculo {
	
	private String matricula;
	
	public Coche(Integer velocidadMaxima, Double kgPeso, String marca, Double precio) {
		super(velocidadMaxima, kgPeso, marca, precio);
		// TODO Auto-generated constructor stub
	}

	
//	public void mostrarInfo() {
//		//System.out.println(this.velocidadMaxima);
//		System.out.println(super.velocidadMaxima);
//		System.out.println(this.matricula);
//	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
