/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioCalculadora;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Operaciones {
    private static final Scanner sc= new Scanner(System.in);  
    
    public void Suma(){
        double resultado,num1,num2;
        System.out.println("Escriba el 1º número");
        num1= sc.nextDouble();
        System.out.println("Escriba el 2º número");
        num2= sc.nextDouble();  
        resultado=num1+num2;
        System.out.printf("Resultado: %s .\n",resultado);
    }
    
    public void Resta(){
        double resultado,num1,num2;
        System.out.println("Escriba el 1º número");
        num1= sc.nextDouble();
        System.out.println("Escriba el 2º número");
        num2= sc.nextDouble();  
        resultado=num1-num2;
        System.out.printf("Resultado: %s .\n",resultado);
    }
     public void Multiplicar(){
       double resultado,num1,num2;
       System.out.println("Escriba el 1º número");
       num1= sc.nextDouble();
       System.out.println("Escriba el 2º número");
       num2= sc.nextDouble(); 
       resultado=num1*num2;
       System.out.printf("Resultado: %s .\n",resultado);
     }   
     public void Dividir(){
       double resultado,num1,num2;
       System.out.println("Escriba el dividendo");
       num1= sc.nextDouble();
       System.out.println("Escriba el divisor");
       num2= sc.nextDouble(); 
       if (num2!=0){
          resultado=num1/num2;
          System.out.printf("Resultado: %s .\n",resultado);
       }  
       else {
          System.out.println("No se puede usar el 0 como divisor");
       }           
     }  
     
     public void RaizCuadrada(){
        double resultado,num1;
        System.out.println("Escriba el número del que calcular la raiz cuadrada");
        num1= sc.nextDouble();
        resultado=Math.sqrt(num1);
        System.out.printf("Resultado: %s .\n",resultado); 
     }
     
     public void Potencia(){
        double resultado,num1,num2;
        System.out.println("Escriba un número");
        num1= sc.nextDouble();
        System.out.println("Escriba la potencia");
        num2= sc.nextDouble(); 
        resultado=Math.pow(num1, num2);
        System.out.printf("Resultado: %s .\n",resultado);
     }
     
}
