package com.iescomercio.prog.ud05.explicacion.polimorfismo;

import java.util.Objects;

public class Animal {
	
	public String nombre;
	
	public void atacar() {
		System.out.println("golpe de animal");
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
