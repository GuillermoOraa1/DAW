/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Introduzca un valor A");
            int A=sc.nextInt();
            System.out.println("Introduzca un valor B");
            int B=sc.nextInt(); 
            double resultado= A/B;
            System.out.println("Division: "+resultado);
        }catch(InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }
    }
    
}
