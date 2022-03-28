/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioFracciones;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Fracciones {
    
        static final Scanner sc= new Scanner(System.in);
	private double numerador;
	private double denominador;
	
	public double getNumerador() {
		return numerador;
	}
	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}
	public double getDenominador() {
		return denominador;
	}
	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
	
	public void LeerFraccion() {
		
		System.out.println("Escriba el numerador");
		this.numerador=sc.nextDouble();
		System.out.println("Escriba el denominador");
		this.denominador=sc.nextDouble();
	}
	
	public void EscribirFraccion() {
		if (this.denominador==1) System.out.println(this.numerador);
		else System.out.println(this.numerador+"/"+this.denominador);
	}	
	
	public double Calcular_mcd() {
	    double x;
	    while (this.denominador != 0) {
	        x = this.denominador;
	        this.denominador = this.numerador % this.denominador;
	        this.numerador = x;
	    }
	    return this.numerador;
	}
		
	public void Simplificar_fracción() {
		double mcd=this.Calcular_mcd();
		this.numerador=this.numerador/mcd;
		this.denominador=this.denominador/mcd;	
	}
	
	public void Sumar_fracciones(double numerador,double denominador) {
		this.numerador=this.numerador*denominador+this.denominador*numerador;
		this.denominador=this.denominador*denominador;	
		this.Simplificar_fracción();
	}
	
	public void Restar_fracciones(double numerador,double denominador) {
		this.numerador=this.numerador*denominador+this.denominador*numerador;
		this.denominador=this.denominador*denominador;	
		this.Simplificar_fracción();
	}
	
	public void Multiplicar_fracciones(double numerador,double denominador) {
		this.numerador=this.numerador*numerador;
		this.denominador=this.denominador*denominador;	
		this.Simplificar_fracción();
	}
	
	public void Dividir_fracciones(double numerador,double denominador) {
		this.numerador=this.numerador*denominador;
		this.denominador=this.denominador*numerador;	
		this.Simplificar_fracción();
	}
    public void Seleccionar() {
        int opcion;
        double numerador2,denominador2;
        boolean salida=false;
        this.LeerFraccion();
        do{
            System.out.println("Operacion: \n1-Sumar dos fracciones\n2-Restar dos fracciones\n3-Multiplicar dos fracciones\n4-Dividir dos fracciones\n5-Salir");
            System.out.println("Escriba la opcion que prefiera");
            opcion=sc.nextInt();
            switch(opcion) {
                
            case(1):
            System.out.println("Escriba el numerador");
            numerador2=sc.nextDouble();
            System.out.println("Escriba el denominador");
            denominador2=sc.nextDouble();
            Sumar_fracciones(numerador2,denominador2);
            this.EscribirFraccion();
            break;
				
            case(2):
            System.out.println("Escriba el numerador");
            numerador2=sc.nextDouble();
            System.out.println("Escriba el denominador");
            denominador2=sc.nextDouble();
            Restar_fracciones(numerador2,denominador2);
            this.EscribirFraccion();
            break;

            case(3):
            System.out.println("Escriba el numerador");
            numerador2=sc.nextDouble();
            System.out.println("Escriba el denominador");
            denominador2=sc.nextDouble();
            Multiplicar_fracciones(numerador2,denominador2);
            this.EscribirFraccion();
            break;

            case(4):
            System.out.println("Escriba el numerador");
            numerador2=sc.nextDouble();
            System.out.println("Escriba el denominador");
            denominador2=sc.nextDouble();
            Dividir_fracciones(numerador2,denominador2);
            this.EscribirFraccion();
            break;
            
            case(5):  
            salida=true;
            
            default:
            System.out.println("Esa operacion no existe");				
            }
        }while(salida==false);
        
        
   
    }
}
