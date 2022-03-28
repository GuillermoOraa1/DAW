/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class VehiculoAereo extends Vehiculo{
    
    private int numeroAsientos;
    
    public VehiculoAereo(String matricula,String modelo,int numeroAsientos){
        if(Pattern.matches("[A-Za-z]{4}[0-9]{6}", matricula)) this.matricula=matricula;
        else System.out.println("Aqui salta un error por que la matricula es incorrecta");
        this.modelo=modelo;
        this.numeroAsientos=numeroAsientos;    
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }
   
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
                " Numero de asientos: "+this.numeroAsientos);
    }
    
}
