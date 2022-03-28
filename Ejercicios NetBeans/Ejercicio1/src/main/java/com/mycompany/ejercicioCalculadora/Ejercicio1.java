/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioCalculadora;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc= new Scanner(System.in);  
    public static void main(String[] args) {
        // TODO code application logic here
         Ejercicio1.Calculadora();
    }
    /**
     * Realizar un programa en Java, que te pregunte qué operación quieres realizar.
     * Usamos funciones de la clase Operaciones para modular el código
     */
    private static void Calculadora(){
        
        boolean terminar=true;
        Operaciones operacion=new Operaciones();
        
        do {                       
            System.out.println("Escriba la operación a realizar:\n1-Sumar\n2-Restar"
                    + "\n3-Multiplicar\n4-Dividir\n5-Raiz cuadrada\n6-Potencia\n7-Terminar");
            String realizarOperacion=sc.nextLine();
            realizarOperacion= realizarOperacion.replaceAll(" ","").toLowerCase();  
      
            switch (realizarOperacion) {
                case "sumar":
                    operacion.Suma();
                    break;
                case "restar":
                    operacion.Resta();
                    break;
                case "multiplicar":
                    operacion.Multiplicar();
                    break;
                case "dividir":
                    operacion.Dividir();
                    break;
                case "raizcuadrada":
                    operacion.RaizCuadrada();
                    break;  
                case "potencia":
                    operacion.Potencia();
                    break;  
                case "terminar":
                    terminar=false;
                    break;
                default:
                    System.out.println("Error al escribir la operación a realizar");
            }           
        } while (terminar==true);       
    }
    
}
