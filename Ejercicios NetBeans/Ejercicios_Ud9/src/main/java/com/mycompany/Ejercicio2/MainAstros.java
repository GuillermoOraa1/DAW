package com.mycompany.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAstros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Satelites satelite1=new Satelites(2000.200,20,300.34,40.7f,12,4000,3.12f,"Luna");
		Satelites satelite2=new Satelites(2000.200,20,300.34,40.7f,12,4000,3.12f,"Titan");
		ArrayList listaSatelites=new ArrayList();
		listaSatelites.add(satelite1);
		listaSatelites.add(satelite2);
		ArrayList listaSatelites2=new ArrayList();
		Planetas planeta1=new Planetas(2000.200,20,300.34,40.7f,12,20000,300.56f,listaSatelites);
		Planetas planeta2=new Planetas(3000.300,30,200.24,30.7f,12,30000,200.56f,listaSatelites2);
		
		
		ArrayList cuerposEstelares= new ArrayList();
		cuerposEstelares.add(planeta2);
		cuerposEstelares.add(planeta1);
		cuerposEstelares.add(satelite1);
		
		
		System.out.println("Escriba la posicion del planeta a buscar en la lista");
		int posicion=sc.nextInt();
		Astros astro=(Astros)cuerposEstelares.get(posicion);
		System.out.println(astro.muestra());
	}

}
