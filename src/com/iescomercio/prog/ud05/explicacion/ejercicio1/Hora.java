package com.iescomercio.prog.ud05.explicacion.ejercicio1;

public class Hora implements IHora {
	private Integer horas;
	private Integer minutos;
	
	
	public Hora(int hora, int minutos) {
		this.horas= hora;
		this.minutos = minutos;
	}
	
	@Override
	public void dec() {
		// TODO Auto-generated method stub
		
	}
	
	public void inc() {
		this.minutos = this.minutos +1;
		if(this.minutos==60) {
			this.minutos=0;
			this.horas++;
			if(this.horas==24) {
				this.horas = 0;
			}
		}
	}

	public Boolean setHoras(Integer horas) {
		Boolean isChanged = false;
		if(horas<= Hora.NUM_MAX_HORA && horas>=0) {
			this.horas = horas;
			isChanged=true;
		}
		return isChanged;
	}

	public Boolean setMinutos(Integer minutos) {
		Boolean isChanged = false;
		if(minutos< Hora.NUM_MAX_MIN && minutos>=0) {
			this.minutos = minutos;
			isChanged=true;
		}
		return isChanged;
	}
	
	@Override
	public String toString() {
		return "hora: "+this.horas+" minutos: "+this.minutos;
	}



}





