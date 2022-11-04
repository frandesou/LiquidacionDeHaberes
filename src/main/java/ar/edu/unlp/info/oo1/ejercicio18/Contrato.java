package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate fechaInicio;
	
	public Contrato(Empleado empleado, LocalDate fechaInicio ) {
		this.empleado = empleado;
		this.fechaInicio = fechaInicio;
	}
}
