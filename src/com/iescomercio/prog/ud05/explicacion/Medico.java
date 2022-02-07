package com.iescomercio.prog.ud05.explicacion;

public class Medico {
	
	private String dni;
	private String nombre;
	
	
	public void operar() {
		System.out.println("Operacion generica");
	}
	
	@Override
	public String toString() {
		return "un medico";
	}

}
