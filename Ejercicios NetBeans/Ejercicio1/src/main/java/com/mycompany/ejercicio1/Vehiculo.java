/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

//Crea una clase Vehiculo donde definas un tipo enumerado MarcaDeVehiculo cuyos valores posibles 

import java.util.logging.Logger;

//serán FORD, TOYOTA, SUZUKI, RENAULT, SEAT. Establece como atributos de la clase matricula (tipo String) 
//y marca (tipo MarcaDeVehiculo) y crea los métodos getters (para obtener) y setters (para establecer 
//el valor) de los atributos. Escribe un pequeño programa de prueba donde verifiques que los métodos 
//funcionan correctamente.

public class Vehiculo {
    private String matricula;
    private MarcaDeVehiculo marca;
    
    public Vehiculo(String matricula,MarcaDeVehiculo marca){
        this.matricula=matricula;
        this.marca=marca;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public MarcaDeVehiculo getMarca(){
        return this.marca;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setMarca(MarcaDeVehiculo marca){
        this.marca=marca;
    }
    public void ToString(){
        System.out.printf("La matrícula del vehiculo es %s, y su marca es %s",this.getMatricula(),this.getMarca());
    }
    
}
