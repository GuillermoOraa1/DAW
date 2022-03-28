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
public class VehiculoTerrestre extends Vehiculo{
    protected int numeroRuedas;
    
    public VehiculoTerrestre(String matricula,String modelo,int numeroRuedas){
        if(Pattern.matches("[0-9]{4}[A-Za-z]{3}", matricula)) this.matricula=matricula;
        else System.out.println("Aqui salta un error por que la matricula es incorrecta");
        this.modelo=modelo;
        this.numeroRuedas=numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
                " Numero de ruedas: "+this.numeroRuedas);
    }
}
