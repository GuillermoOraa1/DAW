package com.mycompany.Ejercicio3;



public class MainAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1= new Perro("Perro1",10,"sano","Pastor aleman",false);
		Perro perro2= new Perro("Perro2",3,"enfermo","beagle",false);
		Gato gato1= new Gato("Gato1",5,"sano","canela",true);
		Gato gato2= new Gato("Micifuz",9,"sano","atigrado",false);
		Loro loro1=new Loro("Loro1",30,"resfriado",true,true,"guacamayo",true);
		Loro loro2=new Loro("Carioca",50,"sano",true,false,"Loro de cola gris",true);
		Canario canario1= new Canario("Canario1",1,"con sarna",true,true,"amarillo",true);
		
		Inventario inventario= new Inventario();


		
		System.out.println("*****MOSTRAR FECHA NACIMIENTO DE PERRO2*****");
		System.out.println(perro2.cumpleanos());
		
		System.out.println("*****LOS ANIMALES HABLAN*****");
		perro2.habla();
		gato2.habla();
		canario1.habla();
		
		inventario.AnadirAListaAnimales(perro1);
		inventario.AnadirAListaAnimales(perro2);
		inventario.AnadirAListaAnimales(gato1);
		inventario.AnadirAListaAnimales(gato2);
		inventario.AnadirAListaAnimales(loro1);
		inventario.AnadirAListaAnimales(loro2);
		inventario.AnadirAListaAnimales(canario1);
		
		System.out.println("*****MOSTRAR LISTA SIMPLE DE ANIMALES*****");
		inventario.mostrarListaAnimales();
		System.out.println("*****MOSTRAR DATOS LORO2*****");
		inventario.mostrarTodosDatosAnimal("Carioca");
		System.out.println("*****QUITAR LORO2 DE ANIMALES*****");
		inventario.QuitarDeListaAnimales(loro2);
		System.out.println("*****MOSTRAR LISTA COMPLETA DE ANIMALES*****");
		inventario.mostrarTodosDatosTodosAnimales();
		System.out.println("*****BORRAR TODA LA LISTA DE ANIMALES*****");
		inventario.QuitarListaAnimales();
		System.out.println("Tamano de la lista: "+ inventario.getListaAnimales().size());
	}

}
