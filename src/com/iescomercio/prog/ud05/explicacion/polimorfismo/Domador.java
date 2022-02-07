package com.iescomercio.prog.ud05.explicacion.polimorfismo;

import java.util.Iterator;
import java.util.List;

public class Domador {
	
	public void mandarAtacar(Animal a) {
		a.atacar();
	}
	
	public void mandarAtacar(List<Animal> listaAnimales) {
		for (Animal animal : listaAnimales) {
			animal.atacar();
		}
	}
	
}
