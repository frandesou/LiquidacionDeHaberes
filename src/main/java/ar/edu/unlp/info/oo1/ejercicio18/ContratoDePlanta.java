package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijos;
	
	public ContratoDePlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos) {
		super(empleado, fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos;
	}
}
