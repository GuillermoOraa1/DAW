/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW
 */
public class ProgramaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo1=new Circulo(5);
        Cuadrado cuadrado1=new Cuadrado(6);
        Rectangulo rectangulo1= new Rectangulo(3,12);
        Triangulo triangulo1= new Triangulo(6,10);

        
        ArrayList<iFigura2D>figuras= new ArrayList<iFigura2D>();
        
        figuras.add(circulo1);
        figuras.add(cuadrado1);
        figuras.add(rectangulo1);
        figuras.add(triangulo1);
        
        System.out.println("****Mostrar informacion de todas las figuras****");
        Iterator it= figuras.iterator();
        while(it.hasNext()){
           ((iFigura2D)it.next()).imprimir();
        }
        System.out.println("\n****ESCALAR 2****");
        it= figuras.iterator();
        while(it.hasNext()){
           ((iFigura2D)it.next()).escalar(2);
        }   
        
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).imprimir();
        }
        System.out.println("\n****ESCALAR 0.1****");        
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).escalar(0.1);
        }
        
        for(iFigura2D figura : figuras){
            figura.imprimir();
        }
        
        System.out.println("\n****ESCALAR 10****");  
        figuras.stream().forEach(a->((iFigura2D)a).escalar(10));
        figuras.stream().forEach(a->((iFigura2D)a).imprimir());
        
    }
    
}
