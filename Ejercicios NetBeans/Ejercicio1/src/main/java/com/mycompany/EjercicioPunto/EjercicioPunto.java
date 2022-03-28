/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.EjercicioPunto;

/**
 *
 * @author DAW
 */
public class EjercicioPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1=new Punto();
        Punto punto2=new Punto();
        Punto punto3=new Punto();
        punto1.setX(3);
        punto1.setY(6);
        
        punto2.setX(1);
        punto2.setY(2);
        
        punto3.setX(10);
        punto3.setY(19);
        
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(punto3.toString());
    }
    
}
