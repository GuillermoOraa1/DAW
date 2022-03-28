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
public class Profesora extends Persona{

    private String DNI;
    private int anosDeExperiencia;
    private Grupo grupo;
    
    /*Los dos constructores lanzan la excepcion que hemos creado para cuando los valores introducidos no cumplen el patron*/
    public Profesora(String DNI,String nombre, String telefono,int anosDeExperiencia) throws ExcepcionPatron{
        super(nombre, telefono);
        this.anosDeExperiencia=anosDeExperiencia;
        if(Pattern.matches("[0-9]{8}[A-Z]", DNI)) {this.DNI=DNI;}
        else { throw new ExcepcionPatron();}
    }
    
    public Profesora(String nombre, String telefono, String DNI,int anosDeExperiencia,Grupo grupo) throws ExcepcionPatron{
        super(nombre, telefono);
        this.anosDeExperiencia=anosDeExperiencia;
        this.grupo=grupo;
        if(Pattern.matches("[0-9]{8}[A-Z]", DNI)) {this.DNI=DNI;}
        else { throw new ExcepcionPatron();}
    }

    public String getDNI() {
        return DNI;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    /*Con este metodo mostramos los datos de la profesora*/ 
    @Override
    public String mostrar() {
        return "Nombre de la profesora: "+this.getNombre()+"\nDNI: "+this.DNI+
                "\nTelefono: "+this.getTelefono()+"\nAños de experiencia: "+this.anosDeExperiencia+
                "\nGrupo :"+this.grupo.getNombre();
    }
    
}
