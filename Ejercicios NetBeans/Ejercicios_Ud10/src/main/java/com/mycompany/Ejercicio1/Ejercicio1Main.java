/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio1Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        try{
            int valor=sc.nextInt();
            System.out.println("Valor introducido: "+valor);       
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }   
    }
    
}
