/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Gato {
    private String nombre;
    private int edad;
      
    public Gato(String nombre,int edad)throws Exception{
    
        if(nombre.length()>=3) this.nombre=nombre;
        else throw new Exception("El nombre debe tener al menos 3 letras.");
        
        if (edad>=0) this.edad=edad;
        else throw new Exception("La edad debe ser mayor o igual a cero.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws Exception {
        if(nombre.length()>=3) this.nombre=nombre;
        else throw new Exception("El nombre debe tener al menos 3 letras.");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad>=0) this.edad=edad;
        else throw new Exception("La edad debe ser mayor o igual a cero.");
    }
    
    public void imprimir(){
        System.out.printf("El gato %s tiene %d años de edad.",this.nombre,this.edad);
    }
}
