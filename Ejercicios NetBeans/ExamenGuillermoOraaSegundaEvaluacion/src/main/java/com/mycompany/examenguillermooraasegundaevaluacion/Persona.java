/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenguillermooraasegundaevaluacion;

/**
 *
 * @author DAW
 */
public abstract class Persona {
    protected String nombre;
    protected String telefono;
    
    public Persona(String nombre, String Telefono){
        this.nombre=nombre;
        this.telefono=Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    public abstract String mostrar();
}
