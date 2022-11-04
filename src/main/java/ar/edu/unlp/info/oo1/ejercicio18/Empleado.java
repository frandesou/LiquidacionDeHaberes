package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fechaDeNacimiento;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	private LocalDate fechaInicioRelacionLaboral;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, int cuil, LocalDate fechaDeNacimiento,boolean tieneConyuge, boolean tieneHijos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tieneConyuge = tieneConyuge;
		this.tieneHijos = tieneHijos;
		this.contratos = new ArrayList<Contrato>();
	}
}
