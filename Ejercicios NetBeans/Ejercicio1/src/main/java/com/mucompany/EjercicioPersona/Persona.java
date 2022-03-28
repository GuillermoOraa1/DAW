/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mucompany.EjercicioPersona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    static final int mayoriaEdad=18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Persona(String dni, String nombre, String apellidos){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.apellidos+" con "+this.dni+" tiene "+this.edad+" años.";
    }
    
    public void imprime(){
        System.out.println(this.nombre+" "+this.apellidos+" con "+this.dni+".");
    }
    
    public boolean esMayorEdad(){
       boolean mayorEdad=true;
       mayorEdad=(this.edad>=18)?true:false;
       return mayorEdad;
    }
    
    public boolean esJubilado(){
        boolean EsJubilado;
        EsJubilado=(this.edad>65)?true:false;
        return EsJubilado;
    }
    
    public int diferenciaEdad(Persona p){
        return this.edad-p.edad;
    }
    
    public static boolean validarDNI(String dni){
        Pattern pat= Pattern.compile("\\d{8}[A-Z]");
        Matcher matt=pat.matcher(dni);
        if (matt.matches()){ 
            System.out.println("Verdadero");
            return true;}
        else {
            System.out.println("Falso");
            return false;}
    }
}
