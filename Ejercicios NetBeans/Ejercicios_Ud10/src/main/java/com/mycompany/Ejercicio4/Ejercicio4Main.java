/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        boolean fin=true;
        int [] vectorNumeros;
        try{
            do{
                vectorNumeros= new int[(int)(Math.random()*100)];
                //con este codigo genero un array de valores aleatorios de tipo int
                vectorNumeros= new Random().ints(vectorNumeros.length,1, 10).toArray();
                
                System.out.printf("Longitud del array %d",vectorNumeros.length);
                System.out.println("\nIndique que posicion del array quiere seleccionar:");
                int posicion=sc.nextInt();      
                if(posicion>=0)System.out.println(vectorNumeros[posicion]);
                else fin=false;
            }while (fin==false); 
            /*
            for (int i = 0; i < vectorNumeros.length; i++) {
                System.out.println(vectorNumeros[i]);
            }*/
            
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Aqui salta la excepcion.");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Aqui salta la excepcion.");
        }



        

        
        
    }
    
}
