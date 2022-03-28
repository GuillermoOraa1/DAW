/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_agenda;

import java.util.Objects;

/**
 *
 * @author DAW
 */
public class Contacto {
    
    private String nombre;
    private String telefono;
    
    public Contacto(String nombre, String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
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
    
    public String mostrarDatosContacto(){
        return "Nombre: "+this.nombre+"\nTelefono: "+this.telefono+"\n";
    }

    
}
