package com.mycompany.Ejercicio2;

public class Satelites extends Astros{
	

	private float distanciaAlPlaneta;
	private float orbitaPlanetaria;
	private String planetaAlQuePertenece;
	
	public Satelites(double radioEcuatorial, int rotacion, double masa, float temperaturaMedia, int gravedad,float distanciaAlPlaneta,float orbitaPlanetaria,String planetaAlQuePertenece) {
		super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
		this.distanciaAlPlaneta=distanciaAlPlaneta;
		this.orbitaPlanetaria=orbitaPlanetaria;
		this.planetaAlQuePertenece=planetaAlQuePertenece;
	}

	public float getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}

	public void setDistanciaAlPlaneta(float distanciaAlPlaneta) {
		this.distanciaAlPlaneta = distanciaAlPlaneta;
	}

	public float getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	public void setOrbitaPlanetaria(float orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	public String getPlanetaAlQuePertenece() {
		return planetaAlQuePertenece;
	}

	public void setPlanetaAlQuePertenece(String planetaAlQuePertenece) {
		this.planetaAlQuePertenece = planetaAlQuePertenece;
	}
	
        @Override
	public String muestra() {
		return super.muestra()+"\nDistancia al planeta: "+this.distanciaAlPlaneta+"\nOrbita planetaria: "+this.orbitaPlanetaria+"\nPlaneta al que pertenece: "+this.planetaAlQuePertenece;
	}
	
}
