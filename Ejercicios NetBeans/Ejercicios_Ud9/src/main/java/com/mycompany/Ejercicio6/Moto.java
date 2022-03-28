/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Moto extends VehiculoTerrestre{
    String color;
    
    public Moto(String matricula,String modelo,int numeroRuedas,String color){
        super(matricula, modelo, numeroRuedas);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula()+
                " Modelo: "+this.getModelo()+" Numero de ruedas: "+this.getNumeroRuedas()+
                " Color: "+this.color);
    }
}
