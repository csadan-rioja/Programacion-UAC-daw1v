package com.iescomercio.prog.ud05.explicacion;

public class Cardiologo extends Medico{

	@Override
	public void operar() {
		System.out.println("Operacion corazon");
	}
	
	public void ponerByPass() {
		System.out.println("poner bypass");
	}
	
}
