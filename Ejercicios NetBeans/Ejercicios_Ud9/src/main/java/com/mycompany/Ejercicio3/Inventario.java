package com.mycompany.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
	
	private ArrayList listaAnimales= new ArrayList();

	public ArrayList getListaAnimales() {
		return listaAnimales;
	}
	
	public void AnadirAListaAnimales(Mascotas mascota) {
		this.listaAnimales.add(mascota);
	}
	
	public void QuitarDeListaAnimales(Mascotas mascota) {
		this.listaAnimales.remove(mascota);
	}

	public void QuitarListaAnimales() {
		this.listaAnimales.clear();
	}
	
	public void mostrarListaAnimales() {
		for (int i=0;i<this.listaAnimales.size();i++) {
			System.out.println("Nombre: "+((Mascotas)listaAnimales.get(i)).getNombre()+" Tipo: "+listaAnimales.get(i).getClass().getName().substring(25));
		}
	}
	
	public void mostrarTodosDatosTodosAnimales() {
		Iterator it= this.listaAnimales.iterator();
		while(it.hasNext()) {
			((Mascotas)it.next()).muestra();
		}
	}
	
	public void mostrarTodosDatosAnimal(String nombre) {
		
		for (int i=0;i<this.listaAnimales.size();i++) {
			if (((Mascotas)listaAnimales.get(i)).getNombre().equals(nombre))
				((Mascotas)listaAnimales.get(i)).muestra();
		}	
	}
	
	
}
