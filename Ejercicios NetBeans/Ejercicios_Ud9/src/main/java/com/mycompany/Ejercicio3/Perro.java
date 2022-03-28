package com.mycompany.Ejercicio3;

public class Perro extends Mascotas{
	
	private String raza;
	private boolean pulgas;
	
	public Perro(String nombre,int edad,String estado,String raza,boolean pulgas) {
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.raza=raza;
		this.pulgas=pulgas;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getPulgas() {
		if(this.pulgas) return "Tiene pulgas";
		else return "No tiene pulgas";
	}
	
	@Override
	public void muestra() {
		// TODO Auto-generated method stub
		System.out.println("Datos del perro: "+"\n\tNombre: "+this.nombre+"\n\tEdad: "+this.edad+"\n\tEstado: "+this.estado+"\n\tRaza: "+this.raza+"\n\tPulgas: "+this.getPulgas());
	}
	
	@Override
	public void habla() {
		System.out.println("GUAU GUAU");
	}

}
