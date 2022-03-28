/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenguillermooraa;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1.solicitarNumeros();
    }
    public static void solicitarNumeros(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num1=sc.nextInt();
        System.out.println("Introduzca otro numero");
        int num2=sc.nextInt();
        multiplicarParesImpares(num1, num2);
    }
    public static void multiplicarParesImpares(int num1,int num2){     
        int totalPares=1;
        int totalImpares=1;
        while (num1!=(num2+1)){
            if(num1%2==0){
                totalPares*=num1;
            }else{
                totalImpares*=num1;
            }
            num1++;
        }
        System.out.println("El producto total de los pares es "+totalPares);
        System.out.println("El producto total de los impares es "+totalImpares);
    }
}
