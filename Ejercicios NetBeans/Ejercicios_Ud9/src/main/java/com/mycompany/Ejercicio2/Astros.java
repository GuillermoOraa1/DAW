package com.mycompany.Ejercicio2;

public class Astros {
	private double radioEcuatorial;
	private int rotacion;
	private double masa;
	private float temperaturaMedia;
	private int gravedad;
	
	public Astros(double radioEcuatorial, int rotacion, double masa, float temperaturaMedia, int gravedad) {
		this.radioEcuatorial = radioEcuatorial;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
	}

	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public int getRotacion() {
		return rotacion;
	}

	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public float getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(float temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public int getGravedad() {
		return gravedad;
	}

	public void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}
	
	public String muestra() {
		return "El radio ecuatorial es: "+this.radioEcuatorial+"\nLa rotacion es: "+this.rotacion+"\nLa masa es: "+this.masa+
				"\nLa temperatura media es: "+this.temperaturaMedia+"\nLa gravedad es: "+this.gravedad;
	}
	
}
