/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosconcurso;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjercicioTortitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        https://www.aceptaelreto.com/problem/statement.php?id=143&cat=19
        
        La especialidad de Michelón es hacer tortitas. En la cocina de su restaurante hace a diario muchísimas y las va 
        colocando una encima de otra según las saca de la plancha. Le gusta ver variedad en su pila de tortitas, por lo 
        que va haciéndolas de tamaños distintos.
        
        Como la tortita que está más arriba se enfría mucho más rápido que el resto, de vez en cuando mete la espátula 
        entre dos tortitas de la torre y las da la vuelta, de forma que la tortita que estaba encima queda ahora en 
        medio, y la tortita que estaba en medio, queda la primera.
        
        Tras una serie de volteos, ¿serías capaz de decir el tamaño de la tortita que queda más arriba?
        */
        
        /*
        Cada caso de prueba contiene dos líneas. La primera describe la situación inicial de la pila de tortitas. Contiene 
        una sucesión de números terminada con -1 que indica los tamaños de cada una de las tortitas, empezando por el tamaño 
        de la situada encima de la mesa y terminando por la de más arriba. Todos los tamaños son positivos, por lo que el -1 
        final no debe considerarse.
        
        Una segunda línea describe los volteos que hace Michelón. El primer número de la línea indica el número de volteos 
        que hace. Le sigue un número por cada movimiento, indicando el número de tortitas totales que coge de golpe. Se 
        garantiza que el número siempre es válido (es decir, está entre 0 y el número total de tortitas).
        
        La entrada termina con un caso de prueba sin tortitas.
        
        Entrada del ejemplo:
        5 4 3 2 1 -1
        0
        5 4 3 2 1 -1
        2 3 2
        5 4 3 2 1 -1
        1 5
        -1
        0
        
        Salida del ejemplo:
        1
        2
        5
        */
        boolean continuarBucle=true;
        do {
            Scanner sc= new Scanner(System.in);
            String primeraEntrada=sc.nextLine();
            String[]casos=primeraEntrada.split(" ");
            String segundaEntrada=sc.nextLine();
            if (Integer.parseInt(casos[0])==-1) continuarBucle=false;
            Queue <String>pilaDeTortitas= new LinkedList<String>();
            for (int i = 0; i < casos.length; i++) {
                pilaDeTortitas.add(segundaEntrada)
            }
        } while (continuarBucle);
        
        

    }
    
}
