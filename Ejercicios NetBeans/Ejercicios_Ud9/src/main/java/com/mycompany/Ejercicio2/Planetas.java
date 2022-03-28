package com.mycompany.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Planetas extends Astros{

	private int distanciaAlSol;
	private float orbitaAlSol;
	private ArrayList Satelites;
	
	public Planetas(double radioEcuatorial, int rotacion, double masa, float temperaturaMedia, int gravedad,int distanciaAlSol,float orbitaAlSol,ArrayList Satelites) {
		super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
		this.distanciaAlSol=distanciaAlSol;
		this.orbitaAlSol=orbitaAlSol;
		this.Satelites=Satelites;
	}
	
	public int getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(int distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public float getOrbitaAlSol() {
		return orbitaAlSol;
	}

	public void setOrbitaAlSol(float orbitaAlSol) {
		this.orbitaAlSol = orbitaAlSol;
	}

	public ArrayList getSatelites() {
		return Satelites;
	}

	public void setSatelites(ArrayList satelites) {
		Satelites = satelites;
	}
        
        @Override
	public String muestra() {
		
		String respuestaMostrada= super.muestra()+"\nDistancia al Sol: "+this.distanciaAlSol+"\nOrbita al Sol: "+this.orbitaAlSol;
		
		if(!this.Satelites.isEmpty()) {
			respuestaMostrada+="\nTiene satelites: ";
			for(int i=0;i<this.Satelites.size();i++) {
				Satelites satelite=(Satelites)this.Satelites.get(i);
				respuestaMostrada+="\n"+satelite.muestra();
			}
		}
		
		return respuestaMostrada;
	}

}
