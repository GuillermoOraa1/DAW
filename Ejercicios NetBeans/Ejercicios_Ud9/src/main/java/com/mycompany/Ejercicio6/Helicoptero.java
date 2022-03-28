/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Helicoptero extends VehiculoAereo{
    private int numeroHelices;
    
    public Helicoptero(String matricula,String modelo,int numeroAsientos,int numeroHelices){
        super(matricula, modelo, numeroAsientos);
        this.numeroHelices=numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
                " Numero de asientos: "+this.getNumeroAsientos()+" Número de hélices: "+this.numeroHelices);
    }    
}
