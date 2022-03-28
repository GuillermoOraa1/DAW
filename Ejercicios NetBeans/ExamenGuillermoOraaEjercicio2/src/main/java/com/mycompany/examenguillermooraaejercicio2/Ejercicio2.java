/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenguillermooraaejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrado=new Cuadrado();
        int opcion;
        do {
            opcion=menu();
            switch (opcion) {
                case 1:
                    cuadrado.pideLado();
                    System.out.println("El perimetro es "+cuadrado.Perimetro(cuadrado.getLado()));                  
                    break;
                case 2:
                    cuadrado.pideLado();
                    System.out.println("El area es "+cuadrado.Area(cuadrado.getLado()));
                    break;
                case 3:
                    //opcion=3;
                    break;
                default:
                    System.out.println("Esa opcion no está disponible");
            }  
        } while (opcion!=3);
        
        
    }
        
    public static int menu(){
        int opcion=0;
        System.out.println("Seleccione una opcion: \n1.Perimetro\n2.Area\n3.Salir del Programa");
        String texto=sc.next();
        if (isNumeric(texto) == true) {
            opcion = Integer.parseInt(texto);
        } else {
            System.out.println("No es un numero");
        }
        return opcion;
    }
    
       public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
        
}
