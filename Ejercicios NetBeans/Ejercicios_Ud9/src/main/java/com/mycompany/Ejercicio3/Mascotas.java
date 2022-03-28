package com.mycompany.Ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Mascotas {
	
	protected String nombre;
	protected int edad;
	protected String estado;
	protected LocalDate fechaNacimiento;
	
	public abstract String getNombre();
	
	public LocalDate getFechaNacimiento() {
		return LocalDate.now().minusYears(edad);
	}

	public abstract void muestra();
	
	public LocalDate cumpleanos() {
		return this.getFechaNacimiento();
	};
	
	public void morir() {
		System.out.println("El animal fallecio a las "+ LocalDateTime.now());
	}
	
	public void habla() {
		System.out.println("La mascota habla");
	}

}
