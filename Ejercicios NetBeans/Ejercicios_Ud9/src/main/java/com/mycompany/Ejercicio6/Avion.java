/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Avion extends VehiculoAereo{
    private double tiempoMaximoVuelo;
    
    public Avion(String matricula,String modelo,int numeroAsientos,double tiempoMaximoVuelo){
        super(matricula, modelo, numeroAsientos);
        this.tiempoMaximoVuelo=tiempoMaximoVuelo;
    }

    public double getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
                " Numero de asientos: "+this.getNumeroAsientos()+" Tiempo maximo de vuelo: "+this.tiempoMaximoVuelo);
    }
}
