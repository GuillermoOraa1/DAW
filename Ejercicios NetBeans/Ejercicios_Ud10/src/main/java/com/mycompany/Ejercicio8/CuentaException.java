/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio8;

/**
 *
 * @author DAW
 */
public class CuentaException extends Exception{
    public CuentaException(){}
    
    @Override
    public String getMessage(){
        return "No se permite realizar esta operacion.";
    }
}
