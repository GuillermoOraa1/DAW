/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio0;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjemplosExcepcionesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,div,pos;
        int[] v={1,2,3};
        Scanner sc = new Scanner(System.in);
        try{
          System.out.println("Introduce el numerador: ");
            x=sc.nextInt();
            System.out.println("Introduce el denominador: ");
            y=sc.nextInt();    
            div=x/y;
            System.out.println("La division es: "+div);
            System.out.println("Introduce la posicion del vector a consultar");
            pos=sc.nextInt();
            System.out.println("El elemento es "+v[pos]);      
        }catch(NumberFormatException e){
            System.out.println("Division por cero "+e);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fin del programa");
        
    }
    
}
