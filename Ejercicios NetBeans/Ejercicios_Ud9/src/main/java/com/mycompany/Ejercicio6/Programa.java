/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Avion avion1=new Avion("AbcD123456","Charter",40,120.5); 
       Barco barco1=new Barco("ABcdEF","yate",40, true);
       Coche coche1=new Coche("1234Abc","Deportivo",4,true);
       Helicoptero helicoptero1=new Helicoptero("ABCD123456","Helicoptero deportivo",2,2);
       Moto moto1=new Moto("1234ABC", "De carreras", 2, "blanco");
       Submarino submarino1=new Submarino("ABCD","atomico",35,2000);
       VehiculoTerrestre vehiculoTerrestre1=new VehiculoTerrestre("5678XYZ","tanque",8);
       VehiculoAcuatico vehiculoAcuatico1= new VehiculoAcuatico("ABCDEFG","moto acuatica",1);
       VehiculoAereo vehiculoAereo1= new VehiculoAereo("FGTH789101","dron",1);
       
       ArrayList<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
       vehiculos.add(avion1);
       vehiculos.add(barco1);
       vehiculos.add(coche1);
       vehiculos.add(helicoptero1);
       vehiculos.add(moto1);
       vehiculos.add(submarino1);
       vehiculos.add(vehiculoTerrestre1);
       vehiculos.add(vehiculoAereo1);
       vehiculos.add(vehiculoAcuatico1);
       
        for (Vehiculo vehiculo:vehiculos) {
            vehiculo.imprimir();
        }
       
       
    }
    
}
