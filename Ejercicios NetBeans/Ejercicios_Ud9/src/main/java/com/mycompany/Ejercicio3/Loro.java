package com.mycompany.Ejercicio3;

public class Loro extends Aves{
	
	private String origen;
	private boolean habla;
	
	public Loro(String nombre,int edad,String estado,boolean pico,boolean vuela,String origen,boolean habla) {
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.pico=pico;
		this.vuela=vuela;
		this.origen=origen;
		this.habla=habla;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getHabla() {
		if(this.habla) return "Habla";
		else return "No habla";
	}
	
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		if(this.vuela) return "Si vuela";
		else return "No vuela";
	}
	
	public String saluda() {
		return "Hola, soy un loro";
	}

	@Override
	public void muestra() {
		// TODO Auto-generated method stub
		System.out.println("Datos del loro: "+"\n\tNombre: "+this.nombre+"\n\tEdad: "+this.edad+"\n\tEstado: "+this.estado+"\n\tPico: "+this.getPico()+"\n\tVuela: "+this.getVuela()+
				"\n\tOrigen: "+this.origen+"\n\tHabla: "+this.getHabla());
	}

}
