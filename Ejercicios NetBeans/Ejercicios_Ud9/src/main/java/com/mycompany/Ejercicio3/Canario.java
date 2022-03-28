package com.mycompany.Ejercicio3;

public class Canario extends Aves{

	private String color;
	private boolean canta;
	
	public Canario(String nombre,int edad,String estado,boolean pico,boolean vuela,String color,boolean canta) {
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.pico=pico;
		this.vuela=vuela;
		this.color=color;
		this.canta=canta;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getCanta() {
		if(this.canta) return "Canta";
		else return "No canta";
	}
	
	@Override
	public void muestra() {
		// TODO Auto-generated method stub
		System.out.println("Datos del canario: "+"\n\tNombre: "+this.nombre+"\n\tEdad: "+this.edad+"\n\tEstado: "+this.estado+"\n\tPico: "+this.getPico()+"\n\tVuela: "+this.getVuela()+
				"\n\tColor: "+this.color+"\n\tCanta: "+this.getCanta());
	}
	
	@Override
	public void habla() {
		System.out.println("Soy un canario");
	}
	
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		if(this.vuela) return "Si vuela";
		else return "No vuela";
	}



}
