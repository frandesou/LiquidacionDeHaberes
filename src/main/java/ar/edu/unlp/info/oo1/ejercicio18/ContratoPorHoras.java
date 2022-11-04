package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {
	private double valorHora;
	private int horasPorMes;
	private LocalDate fechaFinContrato;
	
	public ContratoPorHoras(Empleado empleado, LocalDate fechaInicio, double valorHora, int horasPorMes, LocalDate fechaFinContrato) {
		super(empleado, fechaInicio);
		this.valorHora = valorHora;
		this.horasPorMes = horasPorMes;
		this.fechaFinContrato = fechaFinContrato;
	}
}
