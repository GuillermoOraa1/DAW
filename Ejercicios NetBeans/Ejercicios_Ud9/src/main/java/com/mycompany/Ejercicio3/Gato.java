package com.mycompany.Ejercicio3;

public class Gato extends Mascotas{
	
	private String color;
	private boolean peloLargo;

	public Gato(String nombre,int edad,String estado,String color,boolean peloLargo) {
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.color=color;
		this.peloLargo=peloLargo;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getPeloLargo() {
		if(this.peloLargo) return "Tiene el pelo largo";
		else return "Tiene el pelo corto";
	}
	
	@Override
	public void muestra() {
		// TODO Auto-generated method stub
		System.out.println("Datos del gato: "+"\n\tNombre: "+this.nombre+"\n\tEdad: "+this.edad+"\n\tEstado: "+this.estado+"\n\tColor: "+this.color+"\n\tPelo largo: "+this.getPeloLargo());
	}

	@Override
	public void habla() {
		System.out.println("MIAUU MIAUU");
	}
}
