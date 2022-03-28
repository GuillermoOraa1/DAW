/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenguillermooraasegundaevaluacion;

import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class Alumna extends Persona{

    private String numeroDeAlumna;
    private int numeroDeSobresalientes;
    
    
    public Alumna(String numeroDeAlumna)throws ExcepcionPatron{
        super("Gabriela", "912223344");
        if(Pattern.matches("[a-zA-Z]{1}[0-9]{6}", numeroDeAlumna)) this.numeroDeAlumna=numeroDeAlumna;
        else throw new ExcepcionPatron();
    }
    
    

    /*El constructor lanza la excepcion que hemos creado para cuando los valores introducidos no cumplen el patron*/
    public Alumna(String nombre, String telefono,String numeroDeAlumna, int numeroDeSobresalientes) throws ExcepcionPatron{
        super(nombre, telefono);
        this.numeroDeSobresalientes=numeroDeSobresalientes;
        if(Pattern.matches("[A-Z][0-9]{6}", numeroDeAlumna)) {this.numeroDeAlumna=numeroDeAlumna;}
        else { throw new ExcepcionPatron();}
    }

    public String getNumeroDeAlumna() {
        return numeroDeAlumna;
    }

    public int getNumeroDeSobresalientes() {
        return numeroDeSobresalientes;
    }

    public void setNumeroDeSobresalientes(int numeroDeSobresalientes) {
        this.numeroDeSobresalientes = numeroDeSobresalientes;
    }
    /*Con este metodo mostramos los datos de la alumna*/ 
    @Override
    public String mostrar() {
        return "Nombre de la alumna: "+this.getNombre()+"\n\tNumero de alumna: "+this.numeroDeAlumna+
                "\n\tTelefono: "+this.getTelefono()+"\n\tNumero de Sobresalientes: "+this.numeroDeSobresalientes;
    }
    
}
