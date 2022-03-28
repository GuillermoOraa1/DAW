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
public class VehiculoAcuatico extends Vehiculo{

    private int eslora;
    
    public VehiculoAcuatico(String matricula,String modelo,int eslora){
        if(Pattern.matches("[A-Za-z]{3,10}", matricula)) this.matricula=matricula;
        else System.out.println("Aqui salta un error por que la matricula es incorrecta");
        this.modelo=modelo;
        this.eslora=eslora;    
    }

    public int getEslora() {
        return eslora;
    }
    
    @Override
    public void imprimir() {
       System.out.println("Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
               " Eslora: "+this.eslora);
    }
    
}
