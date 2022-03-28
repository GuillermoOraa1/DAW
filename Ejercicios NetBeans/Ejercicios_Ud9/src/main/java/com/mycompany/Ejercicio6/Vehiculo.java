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
public abstract class Vehiculo {
    
    protected String matricula;
    protected String modelo; 

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    
    public abstract void imprimir();
       
}
