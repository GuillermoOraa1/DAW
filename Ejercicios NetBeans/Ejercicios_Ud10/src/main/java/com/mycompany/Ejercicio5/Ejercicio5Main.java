/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio5Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            imprimePositivo(1); 
            imprimePositivo(2);
            imprimePositivo(5);
            imprimePositivo(-5);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Salta la excepcion");
        }
        
        try{
            imprimeNegativo(-1);  
            imprimeNegativo(-9);
            imprimeNegativo(-11);
            imprimeNegativo(5);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Salta la excepcion");
        }
        
    }
    
    public static void imprimePositivo(int p) throws Exception{
        if(p>0) System.out.println(p);
        else throw new Exception("Excepcion por meter valor negativo");
    }
    
    public static void imprimeNegativo(int n) throws Exception{
        if (n<=0) System.out.println(n);
        else throw new Exception("Excepcion por meter valor positivo");
    }   
}
