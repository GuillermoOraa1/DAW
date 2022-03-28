/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioN;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class EjercicioN {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc= new Scanner(System.in); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        EjercicioN.CalcularN();
    }
    
    private static void CalcularN(){
        int terminar=0;
        int suma=0;
        int contador=0;
        int numero;
        double media;
        do {            
            System.out.println("Escriba un número");
            numero=sc.nextInt();
            suma+=numero;
            contador++;
            media=(double)suma/contador;
            System.out.printf("La suma es %s y la media es %s.\n",suma,media);           
        } while (terminar==0);
    }
}
