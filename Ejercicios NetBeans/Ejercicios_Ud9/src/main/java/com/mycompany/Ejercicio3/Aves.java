package com.mycompany.Ejercicio3;

public abstract class Aves extends Mascotas{

	protected boolean pico;
	protected boolean vuela;
	
	public abstract String volar();
	
	public String getPico() {
		if(this.pico) return "Tiene pico";
		else return "No tiene pico";
	}
	
	public String getVuela() {
		if(this.vuela) return "Vuela";
		else return "No vuela";
	}
}
