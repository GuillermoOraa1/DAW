/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_dawbank_poo;

/**
 * Una clase para generar la excepcion que se lanza cuando el atributo IBAN del objeto CuentaBancaria  no cumple con la expresion regular.
 * @author Guillermo
 * @version 1.0
 * @see CuentaBancaria
 */
public class ExcepcionIban extends Exception{
	
	public ExcepcionIban() {}
	
        @Override
	public String getMessage() {
		return "El número del IBAN no es correcto";
	}
}
