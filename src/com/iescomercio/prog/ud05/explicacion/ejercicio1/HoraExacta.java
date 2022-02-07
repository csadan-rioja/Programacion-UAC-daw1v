package com.iescomercio.prog.ud05.explicacion.ejercicio1;

public class HoraExacta extends Hora {
	
	private Integer segundos;
	
	public HoraExacta(Integer hora, Integer minuto, Integer segundo) {
		super(hora, minuto);
		this.segundos = segundo;
	}
	
	public Boolean setSegundos(Integer segundos) {
		Boolean isChanged = false;
		if(segundos<=59 && segundos>=0) {
			this.segundos = segundos;
			isChanged=true;
		}
		return isChanged;
	}
	
	@Override
	public void inc() {
		
		this.segundos++;
		if(this.segundos==60) {
			this.segundos=0;
			super.inc();
		}

	}

}
