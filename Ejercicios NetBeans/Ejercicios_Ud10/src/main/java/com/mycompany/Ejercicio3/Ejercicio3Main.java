/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        double[]vector=Ejercicio3Main.pedirNumeros();
        for (int i = 0; i <vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    /*
    public static double[] pedirNumeros(){
        Scanner sc = new Scanner(System.in);
        double[] vector=new double[4];
        try{
            for (int i = 0; i <vector.length; i++) {
                System.out.println("Introduzca un valor");
                vector[i]=sc.nextDouble();
            }        
        }catch(Exception e){
            System.out.println("Alguno de los valores introducidos en el array no es correcto.");
            Ejercicio3Main.pedirNumeros();
        }
        return vector;
    }
    */
    
        public static Scanner sc = new Scanner(System.in);
        public static double[] pedirNumeros(){
            
            double[] vector=new double[5];
            int posicion=0;
                while (posicion<vector.length) {
                    try{
                        System.out.println("Introduzca un valor");
                        vector[posicion]=Double.valueOf(sc.nextLine());
                        posicion++;
                    }catch(NumberFormatException e){
                        System.out.println("Alguno de los valores introducidos en el array no es correcto.");
                    }catch(Exception e){
                        System.out.println("Alguno de los valores introducidos en el array no es correcto.");
                    }
                }
            return vector;
        }      
}
