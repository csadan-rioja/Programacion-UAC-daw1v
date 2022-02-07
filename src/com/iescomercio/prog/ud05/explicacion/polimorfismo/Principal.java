package com.iescomercio.prog.ud05.explicacion.polimorfismo;

import java.util.Vector;

public class Principal {
	public static void main(String[] args) {
		
		Vector<Animal> animales = new Vector<Animal>();
		animales.add(new Leon());
		animales.add(new Ballena());
		animales.add(new Animal());
		
		Domador d = new Domador();
		d.mandarAtacar(animales);

	}

}
