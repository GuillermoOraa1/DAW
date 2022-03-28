/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenguillermooraaejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW
 */

public class Cuadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double pideLado(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el lado del cuadrado:");
        this.lado=sc.nextDouble();
        return this.lado;
    }
    
    public double Perimetro(double lado){
        return lado*4;
    }
    
    public double Area(double lado){
        return lado*lado;
    }
}
