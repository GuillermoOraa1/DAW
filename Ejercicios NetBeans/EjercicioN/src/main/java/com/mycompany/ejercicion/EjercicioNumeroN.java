/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjercicioNumeroN {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc= new Scanner(System.in); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        EjercicioNumeroN.CalcularN();
    }
    
    private static void CalcularN(){
        int suma=0;
        int contador=0;
        int numero;
        double media;
        do {            
            System.out.println("Escriba un número");
            numero=sc.nextInt();
            if (numero!=0) {
                suma+=numero;
                contador++;
                media=(double)suma/contador;
                System.out.printf("La suma es %s y la media es %s.\n",suma,media); 
            }    
        } while (numero!=0);
    }
    
}
