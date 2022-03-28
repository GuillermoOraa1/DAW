/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;

public class EjerciciosTest3 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    // me quedo en el ejercicio 5 del http://www.it.uc3m.es/java/gitt/units/repaso/guides/0/html/test3/
    //metodo que recibe dos reales y devuelva el menor de los dos. ¿qué ocurre si los dos reales son iguales?
     private static double RealMayor(double num1, double num2){
         if (num1==num2) {
             return num1;
         }else if(num1>num2){
             return num2;
         }else{
             return num1;
         }
     }
    //método que recibe tres reales y devuelva el mayor de los tres.
    private static double RealMayor(double num1, double num2, double num3){
        if (num1>num2 && num1>num3) {
            return num1;
        }else if(num2>num1 && num2>num3){
            return num2;
        }else{
            return num3;
        }
    }
    //metodo para comparar dos cadenas
    private static void CompararCadenas(String cadena1,String cadena2){
        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
    
    //metodo para comparar cual de dos numeros es mayor
    private static int VerMayor(int num1,int num2){
       int num;
       return num = num1>num2 ? num1:num2;
    }
    
}
