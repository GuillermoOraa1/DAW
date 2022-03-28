package com.mycompany.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1=new Producto("cera",5);
		Producto producto2=new Producto("caja",4);
		Producto producto3=new Producto("cuerda",3);
		Producto producto4=new Producto("cardo",2);
		Producto producto5=new Producto("carta",1);
		Producto producto6=new Producto("prueba",0);
		
		ArrayList productos= new ArrayList();
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
		
		Iterator it= productos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		productos.remove(2);
		productos.remove(producto5);
		productos.add(2,producto6);
		
		System.out.println("*********");
		it= productos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		productos.removeAll(productos);
		
	}

}
