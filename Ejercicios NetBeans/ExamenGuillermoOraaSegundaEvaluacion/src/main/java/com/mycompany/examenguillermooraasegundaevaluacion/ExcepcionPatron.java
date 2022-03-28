/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenguillermooraasegundaevaluacion;

/**
 *
 * @author DAW
 */
public class ExcepcionPatron extends Exception{
    @Override
    public String getMessage() {
	return "No se cumple el parametro";
    }
}
