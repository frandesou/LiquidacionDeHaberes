package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class Recibo {
	private String nombre,apellido;
	private int cuil;
	private LocalDate fechaRecibo;
	private int antiguedad;
	private double montoTotal;
	
	public Recibo(String nombre,String apellido, int cuil, int antiguedad, double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.montoTotal = montoTotal;
		this.fechaRecibo = LocalDate.now();
	}
	
	
}
