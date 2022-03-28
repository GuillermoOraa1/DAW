/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios3_clases_y_objetos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author DAW
 */
public class Ejercicio5_colecciones {

    /**
     * @param args the command line arguments
     */
    static{
        System.out.println("");
    }
    public static void main(String[] args) {
            /*
            implementar una clase que modele el comportamiento de una pila de enteros,
            ofreciendo la siguiente funcionalidad:
                - La pila siempre se creará vacia.
                - Se podrán insertar elementos.
                - Se podrán sacar elementos.
                - Se podrá preguntar si la pila está vacia.
                - Se podrá reguntar si la pila está llena.
                - Se podrá saber el número de elementos actual de la pila.
                - Implemente un método imprimir que muestre los elementos de la pila.
            */
        /*
        coleccionLIFO coleccion= new coleccionLIFO();
        coleccion.ConsultarContenidoVacio();
        coleccion.InsertarElemento(9);
        coleccion.InsertarElemento(4);
        coleccion.InsertarElemento(5);
        coleccion.InsertarElemento(9);
        coleccion.ConsultarContenido();
        coleccion.EliminarElemento(9);
        coleccion.ConsultarContenido();
        coleccion.ToString();
        int[]array={1,3,4,5};
        coleccion.MeterPila(array);
        coleccion.ToString();
        System.out.println(coleccion.BuscarMayorValor());
        System.out.println(coleccion.CalcularSumatorio());
        System.out.println(coleccion.CalcularMedia());
        */
        coleccionLIFO coleccion2=new coleccionLIFO();
        coleccion2.elementos=new ArrayList<>(Arrays.asList(1,5,6,9,2));
        //coleccion2.MostrarPares();
        //coleccion2.RecorrerDeFormaCircular();
        Ejercicio5_colecciones.CrearTableroAjedrez();
    }  
    
    public static void CrearTableroAjedrez(){
        String[][]tablero=new String [8][8];
        for (int i = 0; i <tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i%2!=0 && j%2==0) {
                    tablero[i][j]="B";
                }
                if ((i%2!=0 && j%2!=0)) {
                    tablero[i][j]="N"; 
                }
                if (i%2==0 && j%2!=0) {
                    tablero[i][j]="B"; 
                }
                if (i%2==0 && j%2==0) {
                    tablero[i][j]="N"; 
                }
                
            }
        }
         for (int i = 0; i <tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {              
                System.out.print(tablero[i][j]);
                if (j==tablero.length-1) {
                   System.out.println("\n"); 
                } 
            }
         }
    }
    
    
}
